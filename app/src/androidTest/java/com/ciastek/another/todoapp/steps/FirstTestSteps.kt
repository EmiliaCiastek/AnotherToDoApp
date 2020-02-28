package com.ciastek.another.todoapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.ciastek.another.todoapp.MainActivity
import com.ciastek.another.todoapp.R
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then

class FirstTestSteps {

    private val activityRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Given("^I start the application$")
    fun startApp() {
        activityRule.launchActivity(null)
    }

    @Then("^I see hello world$")
    fun verifyTextView() {
        onView(withId(R.id.text))
            .check(matches(isDisplayed()))
    }
}
