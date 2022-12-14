package com.example.rectrofitapisproject.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapisproject.Models.CommentList
import com.example.rectrofitapisproject.R
import com.example.rectrofitapisproject.databinding.CommentCustomViewBinding

class CommentRecyclerViewAdapter(val commentList: CommentList):
    RecyclerView.Adapter<CommentRecyclerViewAdapter.CommentViewHolder>() {

    inner class CommentViewHolder(var commentCustomViewBinding: CommentCustomViewBinding):
        RecyclerView.ViewHolder(commentCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.comment_custom_view, parent, false)
        return CommentViewHolder(CommentCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        holder.commentCustomViewBinding.tvCmId.text = commentList[position].id.toString()
        holder.commentCustomViewBinding.tvCmName.text = commentList[position].name
        holder.commentCustomViewBinding.tvCmEmail.text = commentList[position].email
        holder.commentCustomViewBinding.tvCmBody.text = commentList[position].body
    }

    override fun getItemCount(): Int {
        return commentList.size
    }
}