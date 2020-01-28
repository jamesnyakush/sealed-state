package com.jamesnyakush.recyclersealed.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.simplifiedcoding.in/course-apis/recyclerview/"

object RetrofitBuilder {

    private fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: Api = retrofit().create(Api::class.java)
}