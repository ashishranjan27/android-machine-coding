package com.example.app.ui.productlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app.databinding.ItemProductListBinding
import com.example.app.domain.model.ProductItemModel

class ProductListAdapter() : ListAdapter<ProductItemModel, ProductListAdapter.ViewHolder>(ProductDiffUtils()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val binding = ItemProductListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(val binding: ItemProductListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ProductItemModel) {
            binding.apply {
                title.text = item.title
                price.text = item.price.toString()
                Glide.with(itemView.context).load(item.image).into(imageView)
                itemView.setOnClickListener {
                    //onItemClick(item.id)
                }
            }
        }
    }

    class ProductDiffUtils: DiffUtil.ItemCallback<ProductItemModel>(){
        override fun areItemsTheSame(oldItem: ProductItemModel, newItem: ProductItemModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ProductItemModel, newItem: ProductItemModel): Boolean {
            return oldItem == newItem
        }
    }
}