@N11 @NEW
Feature: Search Product Details

  Background: Go to homepage of N11 and click Giris Yap button
    Given User clicks to Giris Yap button
    And User enters valid username and password
    When User clicks to Giris Yap button below

  Scenario: Search Product Details
    Given Search product named  in search bar
    And Click the first result
    Then Verify product details contains productName
    Then Verify the product price contains currency
    Then Verify brand rate point is visible

  Scenario: Search Product Details
    Given Search "Samsung"  in search bar
    And Click the first result
    Then Verify the product details contains "Samsung" in productName
    Then Verify the product price contains currency
    Then Verify brand rate point is visible
