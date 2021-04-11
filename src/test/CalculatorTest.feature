Feature: calculator addition tests
  Scenario: user tries to get result of two numbers addition
    Given calculator app is up and running
    When number one equals 3
    And number two equals 5
    Then result equals 5
