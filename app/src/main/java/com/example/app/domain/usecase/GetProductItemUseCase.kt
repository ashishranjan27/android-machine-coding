package com.example.app.domain.usecase

import com.example.app.domain.repository.ProductRepository
import javax.inject.Inject

class GetProductItemUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
     suspend fun invoke(limit: Int) =  productRepository.getProductList(limit)
}