package com.example.rectrofitapisproject

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rectrofitapisproject.Adapters.quotesRecyclerViewAdapter
import com.example.rectrofitapisproject.JsonPlaceHolderFactory.JsonPlaceHolderFactory
import com.example.rectrofitapisproject.Repository.JsonPlaceHolderRepository
import com.example.rectrofitapisproject.ViewModel.JsonPlaceHolderViewModel
import com.example.rectrofitapisproject.databinding.ActivityQuotesApiBinding

class QuotesApiActivity : AppCompatActivity() {
    private lateinit var binding : ActivityQuotesApiBinding
    private lateinit var factory : JsonPlaceHolderFactory
    private  lateinit var viewModel: JsonPlaceHolderViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_quotes_api)

        factory = JsonPlaceHolderFactory(JsonPlaceHolderRepository(this))
        viewModel = ViewModelProvider(this, factory)[JsonPlaceHolderViewModel::class.java]


        var progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Processing.")


        viewModel.isLoading.observe(this, Observer {
            if(it) progressDialog.show()
            else progressDialog.hide()
        })
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.getquotes().observe(this, Observer {
            val adapter = quotesRecyclerViewAdapter(it)
            binding.recyclerView.adapter = adapter
        })

    }
}