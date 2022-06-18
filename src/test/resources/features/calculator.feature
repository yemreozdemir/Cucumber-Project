Feature: Calculator Tests

  Background:
    Given User is on calculator page

  Scenario: Test Adding
    Given User is on calculator page
    When User clicks "5" on calculator
    And User clicks "+" on calculator
    And User clicks "5" on calculator
    Then Result "10" should be displayed

  Scenario: Test Subtracting
    Given User is on calculator page
    When User clicks "9" on calculator
    And User clicks "–" on calculator
    And User clicks "5" on calculator
    Then Result "4" should be displayed
