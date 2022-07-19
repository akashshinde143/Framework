# Please test freecrm.com
Feature: Test login functionality

  Scenario: Check login with valid credentials
    Given Browser is open
    And User is on login page
    When User enters username and password
    Then user is navigated  to Homepage then to settings and then Logout
