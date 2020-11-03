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

import java.util.Map;

public class ManageBookStepDefinitions {
    BooksPage booksPage = new BooksPage();

    @When("user clicks {string} button")
    public void user_clicks_button(String button) {
        if(button.equals("Add Books")){
            booksPage.click_addBook();
        }else if(button.equals("Edit Book")){
            booksPage.clickEditBookBtn();
        }
    }

    @And("user enters book information")
    public void user_enters_book_information(Map<String,String> map) {

        String bookName = map.get("Book Name");
        String ISBN = map.get("ISBN");
        String year = map.get("Year");
        String author = map.get("Author");
        String description = map.get("Description");

        booksPage.add_edit_bookName(bookName);
        booksPage.add_edit_ISBN(ISBN);
        booksPage.add_edit_year(year);
        booksPage.add_edit_author(author);
        booksPage.add_description(description);
    }

    @And("user clicks on Save changes button")
    public void user_clicks_on_save_changes_button() {
        booksPage.clickSaveChangesBtn();
    }

    @Then("confirmation message appears")
    public void appears() {
        Assert.assertTrue(booksPage.confirmationMessageCheck());
    }

    @And("user edits book information")
    public void userEditsBookInformation(Map<String,String> map) {
        String bookName = map.get("Book Name");
        String ISBN = map.get("ISBN");
        String year = map.get("Year");
        String author = map.get("Author");
        String description = map.get("Description");
        booksPage.add_edit_bookName(bookName);
        booksPage.add_edit_ISBN(ISBN);
        booksPage.add_edit_year(year);
        booksPage.add_edit_author(author);
        booksPage.add_description(description);
    }


}
