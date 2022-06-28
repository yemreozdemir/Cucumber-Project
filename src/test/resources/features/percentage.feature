@smoke
Feature: Calculate different percentage values

  Scenario: User calculates %5 results
    Given User is on percentage calculator page
    Then User should see following calculation results
      | 100  | 5   |
      | 500  | 25  |
      | 1300 | 65  |
      | 2100 | 105 |