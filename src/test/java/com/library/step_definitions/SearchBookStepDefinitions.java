package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.LoginPage;
import com.library.utils.BrowserUtil;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SearchBookStepDefinitions {

    LoginPage loginPage = new LoginPage();
    BooksPage booksPage = new BooksPage();


    @Given("user is on dashboard page")
    public void user_is_on_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("librarian");
    }

    @And("user clicks {string} tab")
    public void user_clicks_tab(String string) {
        BrowserUtil.wait(2);
        booksPage.click_books_tab();
    }

    @And("user clicks {string} button")
    public void user_clicks_button(String string) {
        BrowserUtil.wait(2);
        booksPage.click_addBook();
    }

}
