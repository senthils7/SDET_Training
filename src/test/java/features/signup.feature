Feature: Google search functionality

  Background: This step will always execute before test case execution
    Given login to the application

  Scenario Outline: Verify the google search with different values
    Given User is on the google page
    When User search "<value1>"
    And clicks on Search button
    Then Results will be populated

    Examples: 
      | value1     |
      | facebook   |
      | IBM        |
      | Sacremento |
