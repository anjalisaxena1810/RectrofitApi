package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class Knownfor(
    @SerializedName("backdrop_path")
    val backdrop_path: String,

    @SerializedName("first_air_date")
    val first_air_date: String,

    @SerializedName("id")
    val id: Int,

    @SerializedName("media_type")
    val media_type: String,

    @SerializedName("original_language")
    val original_language: String,

    @SerializedName("original_name")
    val original_name: String,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("vote_average")
    val rating: Double,

    @SerializedName("vote_count")
    val vote_count: Long
)
