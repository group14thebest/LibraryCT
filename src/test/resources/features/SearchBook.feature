@searchBook
Feature: As a user I should be able to search books under "Books" tab.

  Background:   login
    Given user is on dashboard page
    And user clicks "Books" tab
    When user clicks on "search" input box

      @searchByName
      Scenario: search by book's name
        And user enters book name
        Then selection of the books related to that name appears

      @searchByYear
      Scenario: search by book's year
        And user enters book year

