@manageBook
Feature: As a user I should be able to manage books

  Background:   login
Given user is on dashboard page
And user clicks "Books" tab

@addBook
Scenario: add book
When user clicks "Add Book" button
  And user enters book information
  |Book Name  |Harry Potter|
  |ISBN       |1234567890  |
  |Year       |2001        |
  |Author     |J.Rouling   |
  |Description|test        |
  And user clicks on Save changes button
  Then confirmation message appears

  @editBook
  Scenario: edit book
    When user clicks "Edit Book" button
    And user enters book information
      |Book Name  |Edit Book   |
      |ISBN       |1133557799  |
      |Year       |2010        |
      |Author     |Somebody    |
      |Description|Edit Test   |
    And user clicks on Save changes button
    Then confirmation message appears



