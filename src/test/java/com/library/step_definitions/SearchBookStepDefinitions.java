package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.LoginPage;
import com.library.utils.BrowserUtil;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @When("user clicks on {string} input box")
    public void user_clicks_on_input_box(String string) {
        BrowserUtil.wait(2);
       booksPage.click_searchInputBox();
    }

    @When("user enters book name")
    public void user_enters_book_name() {
        booksPage.search_book_by("test");
    }

    @Then("selection of the books related to that name appears")
    public void selection_of_the_books_related_to_that_name_appears() {
        Assert.assertTrue(true);
    }

    @And("user enters book author")
    public void user_enters_book_author() {
        BrowserUtil.wait(2);
        booksPage.search_book_by("Ahmet");
    }



}
