package com.ciastek.another.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TasksAdapter : RecyclerView.Adapter<TaskViewHolder>() {

    private val tasks: MutableList<String> = mutableListOf()

    fun setTasks(tasks: List<String>) {
        this.tasks.clear()
        this.tasks.addAll(tasks)

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder =
        TaskViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.task_item_view, parent, false))

    override fun getItemCount(): Int = tasks.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(tasks[position])
    }
}
