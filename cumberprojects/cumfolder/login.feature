@logindatacredentials
Feature: This is the login feature of letcodexpath

  @loginvalid
  Scenario: this is the login scenario valid
    Given user is on the login page
    When the users enter the validate username & password
    And clicks on the login button
    Then then user should be navigate the homepage

  @logininvalid
  Scenario: this is the login scenario is invalid
    Given user is on the login page
    When the users enter the validate username & password
    And clicks on the login button
    Then then user should be navigate the homepage

  @loginvalidmismatch
  Scenario: this is the login scenario mismatch
    Given user is on the login page
    When the users enter the validate username & password
    And clicks on the login button
    Then then user should be navigate the homepage
