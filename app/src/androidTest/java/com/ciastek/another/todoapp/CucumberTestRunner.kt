package com.ciastek.another.todoapp

import android.os.Bundle
import cucumber.api.android.CucumberAndroidJUnitRunner

class CucumberTestRunner : CucumberAndroidJUnitRunner() {

    companion object {

        private const val CUCUMBER_TAGS_KEY = "tags"
        private const val CUCUMBER_SCENARIO_KEY = "name"
    }

    override fun onCreate(bundle: Bundle) {
        val tags: String = BuildConfig.TEST_TAGS
        var scenario: String = BuildConfig.TEST_SCENARIO
        if(tags.isNotEmpty()) {
            bundle.putString(CUCUMBER_TAGS_KEY, tags.replace("\\s".toRegex(), ""))
        }
        if(scenario.isNotEmpty()) {
            scenario = scenario.replace(" ".toRegex(), "\\\\s")
            bundle.putString(CUCUMBER_SCENARIO_KEY, scenario)
        }

        super.onCreate(bundle)
    }
}