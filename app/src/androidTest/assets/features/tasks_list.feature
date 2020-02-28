Feature: Displaying tasks list

  Scenario: Displaying few tasks on list
    Given I start the application
    Then Tasks are displayed on list
      | taskName |
      | task1    |
      | task2    |
      | task3    |


