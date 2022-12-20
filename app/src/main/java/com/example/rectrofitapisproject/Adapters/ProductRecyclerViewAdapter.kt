package com.example.rectrofitapisproject.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.rectrofitapisproject.Models.ProductList
import com.example.rectrofitapisproject.R

import com.example.rectrofitapisproject.databinding.ProductCustomViewBinding
import com.squareup.picasso.Picasso
import java.nio.file.Files.size


class ProductRecyclerViewAdapter (val context: Context, private val productList: ProductList): RecyclerView.Adapter<ProductRecyclerViewAdapter.ProductViewHolder>() {

    inner class ProductViewHolder( var productCustomViewBinding: ProductCustomViewBinding): RecyclerView.ViewHolder(productCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_custom_view, parent, false)

        return ProductViewHolder(ProductCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        holder.productCustomViewBinding.tvId.text = productList.get(position).id.toString()
        holder.productCustomViewBinding.tvTitle.text = productList.get(position).title
        holder.productCustomViewBinding.price.text = productList.get(position).price.toString()
        holder.productCustomViewBinding.tvDescription.text= productList.get(position).description
        holder.productCustomViewBinding.tvCategory.text= productList.get(position).category

        val imageUri = productList[position].image
        Picasso.with(context).load(imageUri).into( holder.productCustomViewBinding.imageView)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

}