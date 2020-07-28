Feature: Search for a random user

  Scenario: The Facebook has a profile for a random user
    Given a random User was generated
    When search for the User in the Google is made
    Then the User has a profile on the Facebook