@ScenerioOutlineUsage
Feature: Scenario Outline Usage

  Background: Go to homepage of N11 and click Giris Yap button
    Given User clicks to Giris Yap button
    And User enters valid username and password
    When User clicks to Giris Yap button below

  Scenario Outline: Product Search with product name
    Given Search <ProductName> in search bar.
    When Click the first result
    Then Verify product details contains <ProductName> in productName
    Then Verify product price contains <currency>
    Then Verify brand rate point is visible
    Then Verify product details contains <ProductName> in Product Tab
    Examples:
      | ProductName          | currency |
      | Samsung Cep Telefonu | TL       |
      | Nokia Cep Telefonu   | TL       |
      | Apple Cep  Telefonu  | TL       |