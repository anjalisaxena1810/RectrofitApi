package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

data class PopularPerson(
    @SerializedName("adult")
    val adult: Boolean,

    @SerializedName("gender")
    val gender:Int,

    @SerializedName("id")
    val id: Long,

    @SerializedName("known_for_department")
    val known_for_department: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("popularity")
    val popularity:Double,


    @SerializedName("profile_path")
    val profile_path: String,

    @SerializedName("KnownForList")
    val KnownForList:KnownForList
)
