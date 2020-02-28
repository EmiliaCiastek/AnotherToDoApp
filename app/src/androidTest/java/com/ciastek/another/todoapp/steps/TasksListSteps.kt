package com.ciastek.another.todoapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.contrib.RecyclerViewActions.scrollTo
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import com.ciastek.another.todoapp.MainActivity
import com.ciastek.another.todoapp.R
import com.ciastek.another.todoapp.TaskViewHolder
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then

class TasksListSteps {

    private val activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java, false, false)

    @Given("I start the application")
    fun startApp() {
        activityRule.launchActivity(null)
    }

    @And("Task task1 exists")
    fun taskExists() {

    }

    @Then("Task task1 is displayed on list")
    fun taskIsDisplayed() {
        onView(withId(R.id.tasks_list))
            .perform(scrollTo<TaskViewHolder>(withText("task1")))
    }
}
