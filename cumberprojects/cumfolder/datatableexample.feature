Feature: Login functionality letcode

  Scenario Outline: User logs in with different credentials
    Given User is on the login page
    When User enters "<username>" and "<password>"
    Then User should be logged in successfully

    Examples: 
      | username                 | password    |
      | md.mohamedadil@gmail.com | Mohamed@123 |
      | user2@example.com        | password2   |
      | user3@example.com        | password3   |
