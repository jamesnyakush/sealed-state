package com.jamesnyakush.recyclersealed

import android.app.Application
import com.jamesnyakush.recyclersealed.data.network.Api
import com.jamesnyakush.recyclersealed.data.repository.MovieRepository
import com.jamesnyakush.recyclersealed.ui.movielist.MovieViewModelProviders
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class Recycler : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@Recycler))


        bind() from singleton { MovieRepository(instance()) }
        bind() from provider { MovieViewModelProviders(instance()) }
    }
}