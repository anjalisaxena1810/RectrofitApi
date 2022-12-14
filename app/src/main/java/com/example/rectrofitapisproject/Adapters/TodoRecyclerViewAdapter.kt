package com.example.rectrofitapisproject.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rectrofitapisproject.Models.TodoList
import com.example.rectrofitapisproject.R
import com.example.rectrofitapisproject.databinding.TodoCustomViewBinding

class TodoRecyclerViewAdapter(val todoList: TodoList):
    RecyclerView.Adapter<TodoRecyclerViewAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(var todoCustomViewBinding: TodoCustomViewBinding): RecyclerView.ViewHolder(todoCustomViewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_custom_view, parent, false)
        return TodoViewHolder(TodoCustomViewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.todoCustomViewBinding.tvTdId.text = todoList[position].id.toString()
        holder.todoCustomViewBinding.tvTdTitle.text = todoList[position].title
        holder.todoCustomViewBinding.tvTdComplete.text = todoList[position].completed
    }

    override fun getItemCount(): Int {
        return todoList.size
    }
}