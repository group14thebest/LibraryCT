package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.LoginPage;
import com.library.utils.BrowserUtil;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ManageBookStepDefinitions {
    BooksPage booksPage = new BooksPage();

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        BrowserUtil.wait(2);
        booksPage.click_addBook(); //comment
    }
}
