package com.example.rectrofitapisproject.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapisproject.Models.AlbumList

import com.example.rectrofitapisproject.R
import com.example.rectrofitapisproject.databinding.AlbumCustomViewBinding


class AlbumRecyclerViewAdapter(private val albumList: AlbumList):
    RecyclerView.Adapter<AlbumRecyclerViewAdapter.AlbumViewHolder>() {
    inner class AlbumViewHolder( var albumCustomViewBinding: AlbumCustomViewBinding):RecyclerView.ViewHolder(albumCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.album_custom_view, parent, false)

        return AlbumViewHolder(AlbumCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.albumCustomViewBinding.tvAlId.text = albumList.get(position).userId.toString()
        holder.albumCustomViewBinding.tvAlTitle.text = albumList.get(position).title
    }

    override fun getItemCount(): Int {
        return albumList.size
    }    }


