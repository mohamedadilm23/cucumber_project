Feature: Bookcart application demo

  Scenario: Loginshould be success
    Given user should navigate the application
    And user click on login button
    And user enter the username as mohamed
    And user enter the username as adil
    When user click the login button
    Then login should be success
