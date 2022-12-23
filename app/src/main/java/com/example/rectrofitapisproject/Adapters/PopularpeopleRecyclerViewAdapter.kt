package com.example.rectrofitapisproject.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.rectrofitapisproject.Models.KnownForList
import com.example.rectrofitapisproject.Models.PopularPerson
import com.example.rectrofitapisproject.Models.PopularPersonList
import com.example.rectrofitapisproject.R
import com.example.rectrofitapisproject.databinding.PopularpeopleCustomViewBinding
import com.squareup.picasso.Picasso

class PopularpeopleRecyclerViewAdapter(var context :Context, var popularPersonList: ArrayList<PopularPerson>):
    Adapter<PopularpeopleRecyclerViewAdapter.PopularpersonViewHolder>() {

     inner class PopularpersonViewHolder(val popularpeopleCustomViewBinding: PopularpeopleCustomViewBinding) :
         RecyclerView.ViewHolder(popularpeopleCustomViewBinding.root)

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularpersonViewHolder {
         val view = LayoutInflater.from(parent.context)
             .inflate(R.layout.popularpeople_custom_view, parent, false)
         return PopularpersonViewHolder(PopularpeopleCustomViewBinding.bind(view))
     }

     override fun onBindViewHolder(holder: PopularpersonViewHolder, position: Int) {

         var  imageUrl:String="https://image.tmdb.org/t/p/w500" + popularPersonList[position].profile_path



         if (popularPersonList[position].adult == false) {
             holder.popularpeopleCustomViewBinding.tvMovieRated.text = ""
         } else {
             holder.popularpeopleCustomViewBinding.tvMovieRated.text = "A"
         }


         holder.popularpeopleCustomViewBinding.gender.text= popularPersonList[position].gender.toString()
         Picasso.with(context).load(imageUrl).into(holder.popularpeopleCustomViewBinding.imageView)
         holder.popularpeopleCustomViewBinding.tvId.text = popularPersonList[position].id.toString()
         holder.popularpeopleCustomViewBinding.knowndata.text  = popularPersonList[position].known_for_department
         holder.popularpeopleCustomViewBinding.tvName.text= popularPersonList[position].name
         holder.popularpeopleCustomViewBinding.tvPopularity.text=popularPersonList[position].popularity.toString()

     }

     override fun getItemCount(): Int {
         return popularPersonList.size
     }
 }