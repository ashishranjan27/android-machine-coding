package com.example.app.domain.repository

import com.example.app.data.remote.ProductDto
import com.example.app.domain.model.ProductDetailsModel
import com.example.app.domain.model.ProductItemModel
import com.example.app.helper.UiState

interface ProductRepository {
    suspend fun getProductList(limit: Int): UiState<List<ProductItemModel>>
    suspend fun getProductDetailsById(id: Int): UiState<ProductDetailsModel>
}