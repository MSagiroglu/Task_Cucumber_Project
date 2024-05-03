@N11 @NEW
Feature: Search Product Details

  Scenario: Search Product Details
    Given Search product named  in search bar
    And Click the first result
    Then Verify product details contains productName
    Then Verify product price contains currency
    Then Verify brand rate point is visible
