# Playground Android project with Cucumber

## To run cucumber tests

* run all tests

    `./gradlew connectedCheck -Pcucumber`

* run tests by scenario name

    `./gradlew connectedCheck -Pcucumber -Pscenario="Scenario name"`

* run tests by tag

    `./gradlew connectedCheck -Pcucumber -Ptags="@tag_name"`

### Necessary plugins for Android studio

* Gherkin plugin by JetBrains
* Cucumber for Kotlin
