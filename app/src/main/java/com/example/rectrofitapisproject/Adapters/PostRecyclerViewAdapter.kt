package com.example.rectrofitapisproject.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapisproject.Models.PostList
import com.example.rectrofitapisproject.R
import com.example.rectrofitapisproject.databinding.PostCustomLayoutBinding

class PostRecyclerViewAdapter(private val postList:PostList): RecyclerView.Adapter<PostRecyclerViewAdapter.PostViewHolder>() {

    inner class PostViewHolder( var postCustomLayoutBinding: PostCustomLayoutBinding):RecyclerView.ViewHolder(postCustomLayoutBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_custom_layout, parent, false)

        return PostViewHolder(PostCustomLayoutBinding.bind(view))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
//        val post = postList[position]
        holder.postCustomLayoutBinding.tvUserId.text = postList.get(position).userId.toString()
        holder.postCustomLayoutBinding.tvTitle.text = postList.get(position).title
    }

    override fun getItemCount(): Int {
        return postList.size
    }

}