package com.ciastek.another.todoapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.task_item_view.view.*

class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val taskTitle = itemView.task_title

    fun bind(task: String) {
        taskTitle.text = task
    }
}
