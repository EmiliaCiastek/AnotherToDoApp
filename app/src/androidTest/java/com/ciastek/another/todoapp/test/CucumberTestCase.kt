package com.ciastek.another.todoapp.test

import cucumber.api.CucumberOptions

@CucumberOptions(
    features = ["features"],
    glue = ["com.ciastek.another.todoapp.steps"]
)
@SuppressWarnings("unused")
class CucumberTestCase