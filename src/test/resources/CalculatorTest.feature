@addition_test
Feature: calculator addition tests

  Background: turn on calculator
    Given calculator app is up and running

  Scenario Outline: user tries to get result of two numbers addition
#    Given calculator app is up and running
    When number one equals <arg0>
    And number two equals <arg01>
    Then result equals <expectedResult>
    Examples:
      | arg0 | arg01 | expectedResult |
      | 3    | 5     | 8              |
      | 10   | 15    | 25             |
      | 7    | 23    | 30             |
      | -5   | -5    | -10            |

#@subtraction_test
#Feature: calculator subtraction tests
#
#  Scenario Outline: user tries to get result of two numbers subtraction
#    Given calculator app is up and running
#    When number one equals <arg0>
#    And number two equals <arg01>
#    Then result equals <expectedResult>
#    Examples:
#      | arg0 | arg01 | expectedResult |
#      | 3    | 5     | -2             |
#      | 10   | 15    | -5             |
#      | 7    | 23    | -16            |
#      | -5   | -5    | 0              |