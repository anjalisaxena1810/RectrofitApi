package com.example.rectrofitapisproject.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.rectrofitapisproject.Models.ProductList
import com.example.rectrofitapisproject.R

import com.example.rectrofitapisproject.databinding.ProductCustomViewBinding
import java.nio.file.Files.size


class ProductRecyclerViewAdapter (private val productList: ProductList): RecyclerView.Adapter<ProductRecyclerViewAdapter.ProductViewHolder>() {

    inner class ProductViewHolder( var productCustomViewBinding: ProductCustomViewBinding): RecyclerView.ViewHolder(productCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_custom_layout, parent, false)

        return ProductViewHolder(ProductCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {

        holder.productCustomViewBinding.tvText.text = productList.get(position).text.toString()
        holder.productCustomViewBinding.tvAuthor.text = productList.get(position).author
    }

    override fun getItemCount(): Int {
        return productList.size
    }

}