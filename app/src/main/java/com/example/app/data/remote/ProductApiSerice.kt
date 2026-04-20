package com.example.app.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ProductApiService {
    @GET("products")
    suspend fun getProducts(@Query("limit") limit: Int): Response<List<ProductDto>>

    @GET("products/{id}")
    suspend fun getProductById(@Path("id") id: Int): Response<ProductDto>
}

        //https://fakestoreapi.com/products?limit={LIMIT}
//●
//Product details (by id):
//https://fakestoreapi.com/products/{id}