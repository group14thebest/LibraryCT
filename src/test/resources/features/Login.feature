Feature: As user I want to be able to login under different roles

  @login
  Scenario: Login as a librarian
    Given user is on the login page
    When user logs in as a "librarian"
    Then user should see dashboard page


