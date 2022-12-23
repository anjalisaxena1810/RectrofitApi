package com.example.rectrofitapisproject.Repository

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast

import androidx.lifecycle.MutableLiveData
import com.example.rectrofitapisproject.ApiUtil.RetrofitInstance
import com.example.rectrofitapisproject.Models.*
import com.example.rectrofitapisproject.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class JsonPlaceHolderRepository (val context: Context){

    val listpost = MutableLiveData<PostList>()
    var isLoading = MutableLiveData<Boolean>()
    fun getPosts(): MutableLiveData<PostList> {
        val call = RetrofitInstance.apiInterface.getPosts()
        call.enqueue(object: Callback<PostList> {
            override fun onResponse(call: Call<PostList>, response: Response<PostList>) {
                if(response.isSuccessful){
                  isLoading.postValue(false)
                    val body= response.body()
                    listpost.value = body!!
                }else{
                isLoading.postValue(false)
                    Log.d("ERROR","onResponse:"+response.message())
                }
            }
            override fun onFailure(call: Call<PostList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)
                isLoading.postValue(false)
                Log.d("FAIL","OnFailure: "+t.message)
            }
        })
        return listpost
    }

    val listAlbum = MutableLiveData<AlbumList>()
    fun getAlbum(): MutableLiveData<AlbumList> {
        val call = RetrofitInstance.apiInterface.getAblums()
        call.enqueue(object : Callback<AlbumList> {
            override fun onResponse(call: Call<AlbumList>, response: Response<AlbumList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listAlbum.value = body!!
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<AlbumList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }
        })
        return listAlbum
    }



    val listComment = MutableLiveData<CommentList>()
    fun getComment(): MutableLiveData<CommentList> {
        val call = RetrofitInstance.apiInterface.getComment()
        call.enqueue(object : Callback<CommentList> {
            override fun onResponse(call: Call<CommentList>, response: Response<CommentList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listComment.value = body!!
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<CommentList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }

        })
        return listComment
    }
    val listuser = MutableLiveData<UserList>()
    fun getUser(): MutableLiveData<UserList> {
        val call = RetrofitInstance.apiInterface.getUser()
        call.enqueue(object : Callback<UserList> {
            override fun onResponse(call: Call<UserList>, response: Response<UserList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listuser.value = body!!
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<UserList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }

        })
        return listuser
    }
    val listPhoto = MutableLiveData<PhotoList>()
    fun getPhoto(): MutableLiveData<PhotoList> {
        val call = RetrofitInstance.apiInterface.getPhoto()
        call.enqueue(object : Callback<PhotoList> {
            override fun onResponse(call: Call<PhotoList>, response: Response<PhotoList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listPhoto.value = body!!
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<PhotoList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }
        })
        return listPhoto
    }
    val listTodo = MutableLiveData<TodoList>()
    fun getTodo(): MutableLiveData<TodoList> {
        val call = RetrofitInstance.apiInterface.getTODO()
        call.enqueue(object : Callback<TodoList> {
            override fun onResponse(call: Call<TodoList>, response: Response<TodoList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listTodo.value = body!!
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<TodoList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }
        })
        return listTodo
    }
    val listproduct = MutableLiveData<ProductList>()
    fun getProducts(): MutableLiveData<ProductList> {
        val call = RetrofitInstance.apiInterfacefake.getProducts()
        call.enqueue(object : Callback<ProductList> {
            override fun onResponse(call: Call<ProductList>, response: Response<ProductList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listproduct.value = body!!
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<ProductList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }
        })
        return listproduct
    }
    val listjwerly = MutableLiveData<jeweleryList>()
    fun getjewelery(): MutableLiveData<jeweleryList> {
        val call = RetrofitInstance.apiInterfacefake.getjewelery()
        call.enqueue(object : Callback<jeweleryList> {
            override fun onResponse(call: Call<jeweleryList>, response: Response<jeweleryList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listjwerly.value = body!!
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<jeweleryList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }
        })
        return listjwerly
    }
    val listquotes = MutableLiveData<quotesList>()
    fun getquotes(): MutableLiveData<quotesList> {
        val call = RetrofitInstance.apiInterfacequote.getquotes()
        call.enqueue(object : Callback<quotesList> {
            override fun onResponse(call: Call<quotesList>, response: Response<quotesList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listquotes.value = body!!
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<quotesList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }
        })
        return listquotes
    }

// Popularperson

    val listpopperson = MutableLiveData<ArrayList<PopularPerson>>()

    fun getpopularperson(Key:String): MutableLiveData<ArrayList<PopularPerson>> {

        val call = RetrofitInstance.apiInterfacepopularpeople.getPopular(Key)

        call.enqueue(object : Callback<PopularPersonList> {

            override fun onResponse(call: Call<PopularPersonList>, response: Response<PopularPersonList>) {
                if (response.isSuccessful) {
                    isLoading.postValue(false)
                    val body = response.body()
                    listpopperson.value = body!!.peopleResult
                } else {
                    isLoading.postValue(false)
                    Log.d("Error", "onResponse: " + response.message())
                }
            }

            override fun onFailure(call: Call<PopularPersonList>, t: Throwable) {
                Toast(context).showCustomToast("No internet ", context as Activity)

                isLoading.postValue(false)
                Log.d("FAIL", "onFailure: " + t.message)
            }
        })
        return listpopperson
    }






    //  method is for custom Toast
    private fun Toast.showCustomToast(message: String, activity: Activity) {
        val layout = activity.layoutInflater.inflate (R.layout.custom_toast, activity.findViewById(R.id.linearLayout))
        val textView = layout.findViewById<TextView>(R.id.custom_toast_message)
        textView.text = message
        this.apply {
            setGravity(Gravity.BOTTOM, 0, 40)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }
}