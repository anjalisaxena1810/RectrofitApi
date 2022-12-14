package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class Todo(
    @SerializedName("id")
    val id:Int,

    @SerializedName("title")
    val title:String,

    @SerializedName("completed")
    val completed: String
)
