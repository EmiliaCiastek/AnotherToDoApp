Feature: Displaying tasks list

  Scenario: Displaying tasks list after opening app
    Given I start the application
    And Task task1 exists
    Then Task task1 is displayed on list


