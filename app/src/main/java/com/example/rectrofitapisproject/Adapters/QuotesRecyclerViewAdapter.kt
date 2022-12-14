package com.example.rectrofitapisproject.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapisproject.Models.quotesList
import com.example.rectrofitapisproject.R
import com.example.rectrofitapisproject.databinding.QuotesCustomViewBinding

class quotesRecyclerViewAdapter (private val quotesList: quotesList): RecyclerView.Adapter<quotesRecyclerViewAdapter.QuotesViewHolder>() {

    inner class QuotesViewHolder( var quotesCustomViewBinding: QuotesCustomViewBinding): RecyclerView.ViewHolder(quotesCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuotesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.quotes_custom_view, parent, false)

        return QuotesViewHolder(QuotesCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: QuotesViewHolder, position: Int) {

        holder.quotesCustomViewBinding.tvText.text = quotesList.get(position).text.toString()
        holder.quotesCustomViewBinding.tvAuthor.text = quotesList.get(position).author
    }

    override fun getItemCount(): Int {
        return quotesList.size
    }

}