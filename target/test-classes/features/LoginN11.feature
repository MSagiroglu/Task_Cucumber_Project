@N11
@N11_Login
Feature: Basic Login-Logout Test For N11

 Background: Go to homepage of N11 and click Giris Yap button
      Given User clicks to Giris Yap button

  @SuccesfulLogin @P1
  Scenario: Successful Login and Logout
    And User enters valid username and password
    When User clicks to Giris Yap button below
    Then Verify that user should be logged in successfully
    When User logs out
    Then Verify that user should be logged out successfully

  @UnSuccesfulLogin @P2
  Scenario: Unsuccessful Login and Logout
    And User enters invalid username and password
    When User clicks to Giris Yap button below
    Then Verify that user should see an error message












