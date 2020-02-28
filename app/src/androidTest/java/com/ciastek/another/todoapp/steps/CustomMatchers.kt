package com.ciastek.another.todoapp.steps

import com.ciastek.another.todoapp.TaskViewHolder
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher

fun withTaskTitle(title: String): Matcher<TaskViewHolder> =
    object : TypeSafeMatcher<TaskViewHolder>() {
        override fun describeTo(description: Description?) {
            description?.appendText("with title: $title")
        }

        override fun matchesSafely(item: TaskViewHolder): Boolean =
            item.taskTitle.text == title
    }