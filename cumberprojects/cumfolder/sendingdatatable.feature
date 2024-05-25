Feature: This is the login feature of sendingdatatable

  Scenario: this is the login scenario
    Given user is on the login page to login the correct clientname
    When the users enter the correct login credential letcode website
      | username                 | Password    |
      | md.mohamedadil@gmail.com | Mohamed@123 |
    And clicks on client user the login users
