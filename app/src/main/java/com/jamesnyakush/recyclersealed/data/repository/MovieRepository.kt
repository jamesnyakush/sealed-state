package com.jamesnyakush.recyclersealed.data.repository

import com.jamesnyakush.recyclersealed.data.entity.Movie
import com.jamesnyakush.recyclersealed.data.network.Api
import com.jamesnyakush.recyclersealed.utils.BaseRepository

class MovieRepository(
    private val api: Api
) : BaseRepository() {

    suspend fun getMovies(): List<Movie>? {
        val moviesResponse = safeApiCall(
            call = { api.getMovies().await() },
            errorMessage = "Error fetching Movie from api"
        )

        return moviesResponse
    }

}