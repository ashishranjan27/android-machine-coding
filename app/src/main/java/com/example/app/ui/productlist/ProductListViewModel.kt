package com.example.app.ui.productlist

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.domain.model.ProductItemModel
import com.example.app.domain.usecase.GetProductItemUseCase
import com.example.app.helper.UiState
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.collections.List

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val getProductItemUseCase: GetProductItemUseCase
) : ViewModel(){
    val limit = 20
    private var _productList = MutableStateFlow< UiState<List<ProductItemModel>>>(UiState.Loading)
    val productList = _productList.asStateFlow()

    init {
        getProductList()
    }
     fun getProductList(){
        viewModelScope.launch {
            when(val result= getProductItemUseCase.invoke(limit)){
                is UiState.Success-> {
                    //Log.d("Ashish","Response body is not null"+ Gson().toJson(result.data))
                    _productList.value = UiState.Success(result.data )
                }
                is UiState.Error -> {
                    _productList.value = UiState.Error(result.message)
                }
                else -> {
                }
            }
        }
     }
}