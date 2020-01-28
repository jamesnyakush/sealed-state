package com.jamesnyakush.recyclersealed.data.entity

import com.google.gson.annotations.SerializedName

data class Movie(
    val id: Int,
    val image: String,
    @SerializedName("is_new")
    val isNew: Int,
    val rating: String,
    @SerializedName("like_percent")
    val likepercent: Int,
    @SerializedName("vote_count")
    val votecount: Int,
    val title: String,
    val language: String,
    val type: String
)