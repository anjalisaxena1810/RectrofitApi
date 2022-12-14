package com.example.rectrofitapisproject

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rectrofitapisproject.Adapters.TodoRecyclerViewAdapter
import com.example.rectrofitapisproject.JsonPlaceHolderFactory.JsonPlaceHolderFactory
import com.example.rectrofitapisproject.Repository.JsonPlaceHolderRepository
import com.example.rectrofitapisproject.ViewModel.JsonPlaceHolderViewModel
import com.example.rectrofitapisproject.databinding.ActivityAlbumBinding
import com.example.rectrofitapisproject.databinding.ActivityTodoBinding

class TodoActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityTodoBinding
    private  lateinit var factory: JsonPlaceHolderFactory
    private lateinit var  viewModel: JsonPlaceHolderViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_todo)


        factory = JsonPlaceHolderFactory(JsonPlaceHolderRepository(this))
        viewModel= ViewModelProvider(this, factory)[JsonPlaceHolderViewModel::class.java]

        val progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Processing.")

        viewModel.isLoading.observe(this, Observer {
            if(it) progressDialog.show()
            else progressDialog.hide()
        })



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.getTodo().observe(this, Observer {
            val adapter = TodoRecyclerViewAdapter(it)
            binding.recyclerView.adapter = adapter
        })
    }
}