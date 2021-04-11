@operation_test
Feature: calculator addition, subtraction, division, multiplying tests

  Background: turn on calculator
    Given calculator app is up and running

  Scenario Outline: user tries to get the result of <arg02> of two numbers
    When number one equals <arg0>
    And number two equals <arg01>
    And op_type equals <arg02>
    Then result equals <expectedResult>
    Examples:
      | arg0 | arg01 | arg02 | expectedResult |
      | 10   | 7     | "-"   | 3              |
      | 3    | 5     | "+"   | 8              |
      | 10   | 15    | "-"   | -5             |
      | 7    | 23    | "*"   | 161            |
      | -5   | -5    | "/"   | 1              |
      | 100  | 75    | "-"   | 25             |
      | 133  | 167   | "+"   | 300            |
      | 105  | 15    | "-"   | 90             |
      | 71   | 230   | "*"   | 16330          |
      | -60  | 12    | "/"   | -5             |
      | 50   | 0     | "/"   | -1             |
      | 13   | 0     | "*"   | 0              |

