package com.example.rectrofitapisproject

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rectrofitapisproject.Adapters.PhotoRecyclerViewAdapter
import com.example.rectrofitapisproject.Adapters.jewelryRecyclerViewAdapter
import com.example.rectrofitapisproject.JsonPlaceHolderFactory.JsonPlaceHolderFactory
import com.example.rectrofitapisproject.Repository.JsonPlaceHolderRepository
import com.example.rectrofitapisproject.ViewModel.JsonPlaceHolderViewModel
import com.example.rectrofitapisproject.databinding.ActivityJeweleryrBinding

class jeweleryrActivity : AppCompatActivity() {
    private lateinit var binding:ActivityJeweleryrBinding
    private lateinit var factory: JsonPlaceHolderFactory
    private lateinit var viewModel : JsonPlaceHolderViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_jeweleryr)
        factory = JsonPlaceHolderFactory(JsonPlaceHolderRepository(this))
        viewModel= ViewModelProvider(this, factory)[JsonPlaceHolderViewModel::class.java]

        val progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Processing.")

        viewModel.isLoading.observe(this, Observer {
            if(it) progressDialog.show()
            else progressDialog.hide()
        })


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.getjewelery().observe(this, Observer {
            val adapter = jewelryRecyclerViewAdapter(this,it)
            binding.recyclerView.adapter = adapter
        })

    }
}