package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class address(
    @SerializedName("street")
    val street: String,

    @SerializedName("suite")
    val suite: String,

    @SerializedName("city")
    val city: String,

    @SerializedName("zipcode")
    val zipcode: Long,

    @SerializedName("geo")
    val geo: geo
)
