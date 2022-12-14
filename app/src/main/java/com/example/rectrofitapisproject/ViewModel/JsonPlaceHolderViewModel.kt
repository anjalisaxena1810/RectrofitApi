package com.example.rectrofitapisproject.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rectrofitapisproject.Models.*
import com.example.rectrofitapisproject.Repository.JsonPlaceHolderRepository

class JsonPlaceHolderViewModel(val repository:JsonPlaceHolderRepository): ViewModel() {
   var listpost= MutableLiveData<PostList>()
   var isLoading :MutableLiveData<Boolean> = repository.isLoading.apply{
   postValue(true)
}
    fun getPost():LiveData<PostList>{
      listpost = repository.getPosts()
       return listpost
  }
    var listPhoto = MutableLiveData<PhotoList>()
    fun getPhoto():LiveData<PhotoList>{
        listPhoto = repository.getPhoto()
        return listPhoto
    }
    var listTodo = MutableLiveData<TodoList>()
    fun getTodo():LiveData<TodoList>{
        listTodo = repository.getTodo()
        return listTodo
    }
    var listComment = MutableLiveData<CommentList>()
    fun getComment():LiveData<CommentList>{
        listComment = repository.getComment()
        return listComment
    }
    var listAlbum = MutableLiveData<AlbumList>()
    fun getAlbum():LiveData<AlbumList>{
        listAlbum = repository.getAlbum()
        return listAlbum
    }
    var listProduct = MutableLiveData<ProductList>()
    fun getProducts():LiveData<ProductList>{
        listProduct = repository.getProducts()
        return listProduct
    }
    var listjwerly = MutableLiveData<jeweleryList>()
    fun getjewelery():LiveData<jeweleryList>{
        listjwerly = repository.getjewelery()
        return listjwerly
    }
    var listquotes = MutableLiveData<quotesList>()
    fun getquotes():LiveData<quotesList>{
        listquotes = repository.getquotes()
        return listquotes
    }



}