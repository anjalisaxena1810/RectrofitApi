package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class geo(
    @SerializedName("lat")
    val lat: Double,

    @SerializedName("lng")
    val lng : Double
)
