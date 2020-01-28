package com.jamesnyakush.recyclersealed.ui.movielist

import androidx.lifecycle.ViewModel
import com.jamesnyakush.recyclersealed.data.repository.MovieRepository
import com.jamesnyakush.recyclersealed.utils.lazyDeferred

class MovieViewModel(
 repository: MovieRepository
) : ViewModel() {

    val movies by lazyDeferred {
       repository.getMovies()

    }
}