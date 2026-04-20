package com.example.app.domain.usecase

import com.example.app.domain.repository.ProductRepository
import javax.inject.Inject

class GetProductDetailsUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {
     suspend fun invoke(productId: Int) =  productRepository.getProductDetailsById(productId)
}