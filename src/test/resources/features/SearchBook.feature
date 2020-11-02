@searchBook
Feature: As a user I should be able to search books under "Books" tab.

  Background:   login
    Given user is on dashboard page
    And user clicks "Books" tab

      @searchByName
      Scenario: search by book's name
        And user enters book name
        Then selection of the books related to that name appears

      @searchByAuthor
      Scenario: search by book's author
        And user enters book author
        Then selection of the books related to that author appears

      @search_by_book_categories
      Scenario: Search books by Book Categories
        When user clicks and selects the Book Categories dropdown
        Then user should be able to see all Romance books









