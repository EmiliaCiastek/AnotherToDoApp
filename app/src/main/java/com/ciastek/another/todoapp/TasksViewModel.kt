package com.ciastek.another.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class TasksViewModel(private val taskRepository: TaskRepository) : ViewModel() {

    private val mutableTasks: MutableLiveData<List<Task>> = MutableLiveData()
    val tasks: LiveData<List<String>> = Transformations.map(mutableTasks) {
        it.map { task ->
            task.title
        }
    }

    fun fetchTasks() {
        mutableTasks.postValue(taskRepository.getAllTasks())
    }
}
