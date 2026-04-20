package com.example.app.domain.model

data class ProductDetailsModel(
    val id:Int,
    val title:String,
    val price:Double,
    val description:String,
    val category:String,
    val image:String,
    val rating:RatingDto
)

data class ProductItemModel(
    val id:Int,
    val title:String,
    val price:Double,
    val image:String
)

data class RatingDto(
    val rate:Double,
    val count:Int
)