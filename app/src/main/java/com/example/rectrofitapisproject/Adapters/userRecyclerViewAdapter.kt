package com.example.rectrofitapisproject.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapisproject.Models.UserList
import com.example.rectrofitapisproject.R
import com.example.rectrofitapisproject.databinding.UserCustomViewBinding

class userRecyclerViewAdapter (val userList: UserList) :
    RecyclerView.Adapter<userRecyclerViewAdapter.UserViewHolder>() {
    inner class UserViewHolder(val userCustomViewBinding: UserCustomViewBinding) :
        RecyclerView.ViewHolder(userCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.user_custom_view, parent, false)
        return UserViewHolder(UserCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.userCustomViewBinding.tvUsrId.text = userList[position].id.toString()
        holder.userCustomViewBinding.tvUsrName.text = userList[position].name
        holder.userCustomViewBinding.tvUsrAddress.text = userList[position].address.city
        holder.userCustomViewBinding.tvUsrCompany.text = userList[position].company.name
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}