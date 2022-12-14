package com.example.rectrofitapisproject

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rectrofitapisproject.Adapters.CommentRecyclerViewAdapter
import com.example.rectrofitapisproject.JsonPlaceHolderFactory.JsonPlaceHolderFactory
import com.example.rectrofitapisproject.Repository.JsonPlaceHolderRepository
import com.example.rectrofitapisproject.ViewModel.JsonPlaceHolderViewModel
import com.example.rectrofitapisproject.databinding.ActivityAlbumBinding
import com.example.rectrofitapisproject.databinding.ActivityCommentBinding

class CommentActivity : AppCompatActivity() {
    private lateinit var  dataBinding : ActivityCommentBinding
    private  lateinit var factory: JsonPlaceHolderFactory
    private lateinit var  viewModel: JsonPlaceHolderViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil. setContentView(this,R.layout.activity_comment)


        factory = JsonPlaceHolderFactory(JsonPlaceHolderRepository(this))
        viewModel = ViewModelProvider(this,factory)[JsonPlaceHolderViewModel::class.java]

        val progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Processing...")

        viewModel.isLoading.observe(this, Observer {
            if(it) progressDialog.show()
            else progressDialog.hide()
        })
        dataBinding.recyclerView.layoutManager = LinearLayoutManager(this)
        viewModel.getComment().observe(this, Observer {
            val adapter = CommentRecyclerViewAdapter(it)
            dataBinding.recyclerView.adapter = adapter

        })
    }
}