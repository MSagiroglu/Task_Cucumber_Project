@N11
@N11_SearchKeyWord
Feature: Search a Keyword Test For N11

  Background: Login to N11
    Given User navigates to "url"

  @SuccesfulSearch @P3
  Scenario: Search a keyword with results
    When User searches for a keyword in the search box finding results
    Then Verify that search results should be displayed in the Browser

  @UnSuccesfulSearch @P4
  Scenario: Search a keyword with no results
    When User searches for a keyword in the search box finding no results
    Then Verify that no search results should be displayed in the Browser



