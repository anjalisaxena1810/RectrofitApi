package com.example.rectrofitapisproject

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rectrofitapisproject.Adapters.PopularpeopleRecyclerViewAdapter
import com.example.rectrofitapisproject.Adapters.quotesRecyclerViewAdapter
import com.example.rectrofitapisproject.JsonPlaceHolderFactory.JsonPlaceHolderFactory
import com.example.rectrofitapisproject.Repository.JsonPlaceHolderRepository
import com.example.rectrofitapisproject.ViewModel.JsonPlaceHolderViewModel
import com.example.rectrofitapisproject.databinding.ActivityPopularPeopleApiBinding
import java.security.Key

class PopularPeopleApi : AppCompatActivity() {
    private lateinit var binding :ActivityPopularPeopleApiBinding
    private lateinit var factory : JsonPlaceHolderFactory
    private  lateinit var viewModel: JsonPlaceHolderViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding=DataBindingUtil.setContentView(this,R.layout.activity_popular_people_api)
        factory = JsonPlaceHolderFactory(JsonPlaceHolderRepository(this))
        viewModel = ViewModelProvider(this, factory)[JsonPlaceHolderViewModel::class.java]

        var key:String = "2769feec65e80bb9a7c1b4e9d6095c73"


        var progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Processing.")


        viewModel.isLoading.observe(this, Observer {
            if(it) progressDialog.show()
            else progressDialog.hide()
        })
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.getpopularperson(key).observe(this, Observer {

            val adapter = PopularpeopleRecyclerViewAdapter(this,it)
            binding.recyclerView.adapter = adapter
        })
    }
}
