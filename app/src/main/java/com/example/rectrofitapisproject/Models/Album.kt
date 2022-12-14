package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class Album(
    @SerializedName("userId")
    val userId: String,

    @SerializedName("id")
    val id: String,

    @SerializedName("title")
    val title: String
)
