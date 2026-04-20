package com.example.app.ui.productlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app.R
import com.example.app.databinding.FragmentProductListBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class ProductListFragment : Fragment() {

    private val adapter = ProductListAdapter()

    private val viewModel : ProductListViewModel by viewModels()

    var _binding: FragmentProductListBinding? = null
    val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
        initView()
    }

    private fun initListener(){
        binding.apply {
            viewLifecycleOwner.lifecycleScope.launch {
                viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                    viewModel.productList.collectLatest { state ->
                        when (state) {
                            is com.example.app.helper.UiState.Loading -> {
                                progressBar.visibility = View.VISIBLE
                                toolbar.visibility = View.GONE
                                error.visibility = View.GONE
                                retry.visibility = View.GONE
                                recycler.visibility = View.GONE
                            }

                            is com.example.app.helper.UiState.Success -> {
                                progressBar.visibility = View.GONE
                                toolbar.visibility = View.VISIBLE
                                error.visibility = View.GONE
                                retry.visibility = View.GONE
                                recycler.visibility = View.VISIBLE
                                adapter.submitList(state.data)
                            }

                            is com.example.app.helper.UiState.Error -> {
                                progressBar.visibility = View.GONE
                                toolbar.visibility = View.GONE
                                error.visibility = View.VISIBLE
                                retry.visibility = View.VISIBLE
                                recycler.visibility = View.GONE
                                error.text = state.message
                                retry.setOnClickListener {
                                    viewModel.getProductList()
                                }
//                                adapter.submitList(state.data)
                            }
                        }
                    }
                }
            }
        }
    }

    private fun initView(){
        binding.apply {
            recycler.adapter = adapter
            recycler.layoutManager = LinearLayoutManager(requireContext())
        }
    }


}