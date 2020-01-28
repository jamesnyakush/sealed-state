package com.jamesnyakush.recyclersealed.data.network

import com.jamesnyakush.recyclersealed.data.entity.Movie
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET


interface Api {

    @GET("movies")
    fun getMovies() : Deferred<Response<List<Movie>>>
}