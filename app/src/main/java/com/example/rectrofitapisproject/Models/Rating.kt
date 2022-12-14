package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class Rating(

    @SerializedName("rate")
    val rate: Double,

    @SerializedName("count")
    val count: String
)
