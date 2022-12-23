package com.example.rectrofitapisproject.Models

import com.google.gson.annotations.SerializedName

class PopularPersonList {


    @SerializedName("results")
    val peopleResult = ArrayList<PopularPerson>()
}