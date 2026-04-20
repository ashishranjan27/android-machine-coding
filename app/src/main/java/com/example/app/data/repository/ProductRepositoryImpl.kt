package com.example.app.data.repository

import android.util.Log
import com.example.app.data.mapper.ProductMapper
import com.example.app.data.remote.ProductApiService
import com.example.app.data.remote.ProductDto
import com.example.app.domain.model.ProductDetailsModel
import com.example.app.domain.model.ProductItemModel
import com.example.app.domain.repository.ProductRepository
import com.example.app.helper.Dispatcher
import com.example.app.helper.UiState
import com.google.gson.Gson
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productApi: ProductApiService,
    private val dispatcher: Dispatcher,
    private val productMapper: ProductMapper


): ProductRepository {
    override suspend fun getProductList(limit: Int): UiState<List<ProductItemModel>> {
        return withContext(dispatcher.io){
            try {
                val response = productApi.getProducts(limit)

                if (response.isSuccessful) {
                    if(response.body() != null){
                        Log.d("Ashish","Response body is not null"+ Gson().toJson(response.body()))
                       UiState.Success(productMapper.mapToProductItemModel(response.body()!!))
                    } else {
                        UiState.Error("Response body is null")
                    }
                }
                else {
                    UiState.Error("Request failed with code: ${response.code()}")
                }
            } catch (e: Exception) {
                UiState.Error("An error occurred: ${e.message}")
            }
        }
    }

    override suspend fun getProductDetailsById(id: Int): UiState<ProductDetailsModel> {
        TODO("Not yet implemented")
    }
}