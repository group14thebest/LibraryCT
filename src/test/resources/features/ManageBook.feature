@manageBook
Feature: As a user I should be able to manage books

  Background:   login
Given user is on dashboard page
And user clicks "Books" tab

@addBook
Scenario: add book
When user clicks "Add Book" button
