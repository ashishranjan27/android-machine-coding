package com.example.app.data.mapper

import com.example.app.data.remote.ProductDto
import com.example.app.domain.model.ProductDetailsModel
import com.example.app.domain.model.ProductItemModel
import com.example.app.domain.model.RatingDto
import javax.inject.Inject

class ProductMapper @Inject constructor() {
     fun mapToProductItemModel(productEntity: List<ProductDto>): List<ProductItemModel> {
          return productEntity.map {
               ProductItemModel(
                    id = it.id,
                    title = it.title,
                    price = it.price,
                    image = it.image
               )
          }
     }

    fun mapToProductDetailsModel(productEntity: ProductDto): ProductDetailsModel {
        return ProductDetailsModel(
            id = productEntity.id,
            title = productEntity.title,
            price = productEntity.price,
            description = productEntity.description,
            category = productEntity.category,
            image = productEntity.image,
            rating = RatingDto(productEntity.rating.rate, productEntity.rating.count)
        )
    }
}