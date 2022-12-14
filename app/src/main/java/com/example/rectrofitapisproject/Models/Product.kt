package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class Product(

    @SerializedName("text")
    val text:String,
    @SerializedName("author")
    val author :String
)
