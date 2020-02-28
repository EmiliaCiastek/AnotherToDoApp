Feature: Displaying tasks list

  Scenario: Displaying task list after opening app
    Given I start the application
    And Task task1 exists
    Then Task task1 is displayed on list

  Scenario: Displaying few tasks on list
    Given I start the application
    And I have defined tasks
      | taskName |
      | task1    |
      | task2    |
      | task3    |
    Then Tasks are displayed on list


