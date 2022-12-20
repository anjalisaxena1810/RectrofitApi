package com.example.rectrofitapisproject.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapisproject.Models.AlbumList
import com.example.rectrofitapisproject.Models.jeweleryList
import com.example.rectrofitapisproject.R
import com.example.rectrofitapisproject.databinding.AlbumCustomViewBinding
import com.example.rectrofitapisproject.databinding.JewelryCustomViewBinding
import com.squareup.picasso.Picasso

class jewelryRecyclerViewAdapter (val context:Context, val jeweleryList: jeweleryList):
    RecyclerView.Adapter<jewelryRecyclerViewAdapter.jewelryViewHolder>() {
    inner class jewelryViewHolder( var jewelryCustomViewBinding: JewelryCustomViewBinding): RecyclerView.ViewHolder(jewelryCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): jewelryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.jewelry_custom_view, parent, false)

        return jewelryViewHolder(JewelryCustomViewBinding.bind(view))
    }


    override fun onBindViewHolder(holder: jewelryViewHolder, position: Int) {


        holder.jewelryCustomViewBinding.id.text = jeweleryList.get(position).Id.toString()
        holder.jewelryCustomViewBinding.title.text = jeweleryList.get(position).title
        holder.jewelryCustomViewBinding.price.text = jeweleryList.get(position).price.toString()
        holder.jewelryCustomViewBinding.description.text = jeweleryList.get(position).description
        holder.jewelryCustomViewBinding.category.text = jeweleryList.get(position).category
//        holder.jewelryCustomViewBinding.rating.text = jeweleryList.get(position).rating.toString()
//        holder.jewelryCustomViewBinding.count.text = jeweleryList.get(position).rating.count
//        holder.jewelryCustomViewBinding.rate.text = jeweleryList.get(position).rating.rate.toString()

        val imageUri = jeweleryList[position].image
        Picasso.with(context).load(imageUri).into( holder.jewelryCustomViewBinding.imageView)
    }

    override fun getItemCount(): Int {
        return jeweleryList.size
    }
}
