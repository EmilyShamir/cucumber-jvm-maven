#Auto generated Octane revision tag
@BSPID33002REV0.2.0
Feature: Calculator Emily1
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

@TSCID2117083
  Scenario: Add two numbers Emily
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5
     
