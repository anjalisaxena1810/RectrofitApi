package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class jewerly(
    @SerializedName("Id")
    val Id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("price")
    val price: Double,

    @SerializedName("description")
    val description: String,

    @SerializedName("category")
    val category: String,

    @SerializedName("image")
    val image: String,

    @SerializedName("rating")
    val rating: Rating
)
