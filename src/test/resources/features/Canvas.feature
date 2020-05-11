@regression
Feature: Canvas Program Library

  Verify Canvas Program Library feature
  Background:

    Given I am on the Program Library page
    Then I see program library page is launched

  Scenario Outline: Visit Program Library page and verify all the programs listed in library

    When I tap on "<program>" listed in program library page
    Then I see canvas program and build section of the "<program>" program

  @motorPower_program
    Examples:

      | program                     |
      | MotorPower                  |

  @increaseSpeed_program
    Examples:

      | program                     |
      | IncreaseSpeed               |

  @motorDirectionAndMotorTime_program
    Examples:

      | program                     |
      | MotorDirectionAndMotorTime  |