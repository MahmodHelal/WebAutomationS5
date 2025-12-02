Feature: Login Functionality

  Scenario:  Verify that user will redirect to secure area page after enter valid credentials
    Given  User in LoginPage
    When User entr Valid Credentials and click login button
    Then User redirected to secure area page


  Scenario:  Verify that error message wiil display when user enter invalid credentials
    Given  User in LoginPage
    When User entr invalid Credentials and click login button
    Then error message wiil display