package com.ciastek.another.todoapp

class HardcodedTaskRepository : TaskRepository {

    private val tasks by lazy {
        mutableListOf(
            Task("task1"),
            Task("task2"),
            Task("task3")
        )
    }

    override fun getAllTasks(): List<Task> = tasks.toList()
}
