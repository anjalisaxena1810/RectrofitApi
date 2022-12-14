package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class quotes(
    @SerializedName("text")
    val text:String,
    @SerializedName("author")
    val author :String
)
