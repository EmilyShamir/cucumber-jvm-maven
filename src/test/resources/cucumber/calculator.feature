#Auto generated Octane revision tag
@TID2119003REV0.0.1
Feature: Calculator Emily1
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

@TSCID2118002
  Scenario: Add two numbers Emily7
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5
