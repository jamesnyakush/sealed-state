package com.jamesnyakush.recyclersealed.data.network

import com.jamesnyakush.recyclersealed.data.entity.Movie
import retrofit2.Call
import retrofit2.http.GET

const val BASE_URL = "https://api.simplifiedcoding.in/course-apis/recyclerview/"

interface Api {

    @GET("movies")
    fun getMovies() : Call<List<Movie>>
}