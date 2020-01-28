package com.jamesnyakush.recyclersealed.ui.movielist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jamesnyakush.recyclersealed.data.repository.MovieRepository

@Suppress("UNCHECKED_CAST")
class MovieViewModelProviders(
 private var repository: MovieRepository
) : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(repository) as T
    }
}