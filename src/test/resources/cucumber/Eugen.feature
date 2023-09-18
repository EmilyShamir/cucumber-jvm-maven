#Auto generated Octane revision tag
@BSPID31013REV0.0.1
Feature: Calculator Emily1
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

@TSCID2116084
  Scenario: Add two numbers
    Given I have a calculator
    When I add 2 and 3
    Then the result should be 5
     
@TSCID2116084
  Scenario Outline: As a client user I want to see that the special "FractionPriceRule" rule is applied to my order
      Given a client user on the dashboard page of the application
      Given a Emily client user on the dashboard page of the application
      When client adds to cart a number of "<M>" units of "<product>", more or equal than "<N>" units
      Then the client sees in his cart that instead of the original price "<original_price>" per unit of "<product>" he has to pay a new price which is "<X>" percentage of the original price "<original_price>"
      And total price is computed as "<M>" times "<X>"

      Examples: Products
        | N | product   | original_price | X    | M |
        | 3 | Green Tea | £3.11          | 75   |6  |
        |100| Green Tea | £3.11          | 50   |101|
        |1  | Coffee    |£11.23          | 120  |1  |
        |2  | Apple     |£5.44           | 12   |3  |
