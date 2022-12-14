package com.example.rectrofitapisproject.BaseEndUrl

import com.example.rectrofitapisproject.Models.*
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/posts")
    fun getPosts(): Call<PostList>

    @GET("/comments")
    fun getComment(): Call<CommentList>

    @GET("/users")
    fun getUser(): Call<UserList>

    @GET("/todos")
    fun getTODO(): Call<TodoList>

    @GET("/photos")
    fun getPhoto(): Call<PhotoList>

    @GET("/albums")
    fun getAblums(): Call<AlbumList>

    @GET("/products")
    fun getProducts():Call<ProductList>

    @GET("/jewelery")
    fun getjewelery():Call<jeweleryList>

    @GET("/api/quotes")
    fun getquotes():Call<quotesList>

}