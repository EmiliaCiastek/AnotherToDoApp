package com.ciastek.another.todoapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.tasks_list as tasksList

class MainActivity : AppCompatActivity() {

    private val tasksViewModel: TasksViewModel by viewModels {
        TaskViewModelFactory(
            HardcodedTaskRepository()
        )
    }
    private val adapter = TasksAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tasksList.adapter = adapter
        tasksList.layoutManager = LinearLayoutManager(this)

        tasksViewModel.tasks.observe(this, Observer<List<String>> { tasks ->
            adapter.setTasks(tasks)
        })
    }

    override fun onStart() {
        super.onStart()

        tasksViewModel.fetchTasks()
    }
}
