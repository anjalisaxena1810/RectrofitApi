package com.example.rectrofitapisproject.Adapters

import android.content.Context
import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapisproject.Models.PhotoList
import com.example.rectrofitapisproject.R

import com.example.rectrofitapisproject.databinding.PhotoCustomViewBinding
import com.squareup.picasso.Picasso

class PhotoRecyclerViewAdapter(val context: Context, val photoList: PhotoList ):
    RecyclerView.Adapter<PhotoRecyclerViewAdapter.PhotoViewHolder>() {



    inner class PhotoViewHolder(var photoCustomViewBinding: PhotoCustomViewBinding):
        RecyclerView.ViewHolder(photoCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photo_custom_view, parent, false)
        return PhotoViewHolder(PhotoCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.photoCustomViewBinding.tvPhId.text = photoList[position].id.toString()
        holder.photoCustomViewBinding.tvPhTitle.text = photoList[position].title
        holder.photoCustomViewBinding.tvPhUrl.text = photoList[position].url
        val imageUri = photoList[position].thumbnailUrl
        Picasso.with(context).load(imageUri).into( holder.photoCustomViewBinding.tvPhThumbnail)
    }

    override fun getItemCount(): Int {
        return photoList.size
    }

}


