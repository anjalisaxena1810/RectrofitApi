package com.example.rectrofitapisproject.JsonPlaceHolderFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.rectrofitapisproject.Repository.JsonPlaceHolderRepository
import com.example.rectrofitapisproject.ViewModel.JsonPlaceHolderViewModel

class JsonPlaceHolderFactory(val repository :JsonPlaceHolderRepository) :ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(JsonPlaceHolderViewModel::class.java)){
            return JsonPlaceHolderViewModel(repository)as T
        }
        throw IllegalArgumentException("Unknown class")
    }
}
