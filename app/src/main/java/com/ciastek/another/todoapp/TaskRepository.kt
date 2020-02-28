package com.ciastek.another.todoapp

interface TaskRepository {

    fun getAllTasks(): List<Task>
}

