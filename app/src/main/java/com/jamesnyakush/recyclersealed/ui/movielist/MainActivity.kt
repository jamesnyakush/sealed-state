package com.jamesnyakush.recyclersealed.ui.movielist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.jamesnyakush.recyclersealed.R
import com.jamesnyakush.recyclersealed.data.adapter.MoviesAdapter
import com.jamesnyakush.recyclersealed.utils.Coroutines
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.android.kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance

class MainActivity : AppCompatActivity(),KodeinAware{
    override val kodein by kodein()
    private val factory : MovieViewModelProviders  by instance()

    private lateinit var viewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this,factory).get(MovieViewModel::class.java)

        bindUI()
    }

    private fun bindUI() = Coroutines.main {
        val mMovies = viewModel.movies.await()

            recyclerViewMovies.apply {
                layoutManager= LinearLayoutManager(context)
                hasFixedSize()
                adapter= mMovies?.let { MoviesAdapter(it) }
            }


    }


}
