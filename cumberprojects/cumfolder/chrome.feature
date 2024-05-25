Feature: google search is scenario

  Scenario: this is to test google search
    Given user is entering googlecoin
    When user is typing search term "mohamedadil"
    And enters the return key
    Then then user should see the search results
