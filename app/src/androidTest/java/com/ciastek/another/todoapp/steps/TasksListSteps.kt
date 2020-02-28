package com.ciastek.another.todoapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.contrib.RecyclerViewActions.scrollTo
import androidx.test.espresso.contrib.RecyclerViewActions.scrollToHolder
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import com.ciastek.another.todoapp.MainActivity
import com.ciastek.another.todoapp.R
import com.ciastek.another.todoapp.TaskViewHolder
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import io.cucumber.datatable.DataTable

class TasksListSteps {

    private val activityRule =
        ActivityTestRule<MainActivity>(MainActivity::class.java, false, false)
    private val tasks = mutableListOf<String>()

    @Given("I start the application")
    fun startApp() {
        activityRule.launchActivity(null)
    }

    @Then("Task task1 is displayed on list")
    fun taskIsDisplayed() {
        onView(withId(R.id.tasks_list))
            .perform(scrollTo<TaskViewHolder>(withText("task1")))
    }

    @Then("Tasks are displayed on list")
    fun displaysTasks(data: DataTable) {
        val tasks = mutableListOf<String>()
        tasks.addAll(data.asList())
        tasks.removeAt(0)
        tasks.forEach {
            verifyTaskOnList(it)
        }
    }

    private fun verifyTaskOnList(taskTitle: String) {
        onView(withId(R.id.tasks_list))
            .perform(
                scrollToHolder(
                    withTaskTitle(taskTitle)
                )
            )
    }
}
