package com.example.rectrofitapisproject.ApiUtil

import com.example.rectrofitapisproject.BaseEndUrl.ApiInterface
import com.example.rectrofitapisproject.BaseEndUrl.Constants
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofitInstance: Retrofit.Builder by lazy {
        Retrofit.Builder().baseUrl(Constants.BASEURL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
    }

    val apiInterface: ApiInterface by lazy {
        retrofitInstance.build().create(ApiInterface::class.java)
    }

    private val retrofitInstanceFake: Retrofit.Builder by lazy {
        Retrofit.Builder().baseUrl(Constants.BASEURL1)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
    }

    val apiInterfacefake: ApiInterface by lazy {
        retrofitInstanceFake.build().create(ApiInterface::class.java)
    }
    private val retrofitInstanceQuotes: Retrofit.Builder by lazy {
        Retrofit.Builder().baseUrl(Constants.BASEURL2)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
    }

    val apiInterfacequote: ApiInterface by lazy {
        retrofitInstanceQuotes.build().create(ApiInterface::class.java)
    }

    private val retrofitInstanceTMDB: Retrofit.Builder by lazy {

        Retrofit.Builder().baseUrl(Constants.TMDBBASEURL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
    }

    val apiInterfacepopularpeople: ApiInterface by lazy {
        retrofitInstanceTMDB.build().create(ApiInterface::class.java)
    }
}