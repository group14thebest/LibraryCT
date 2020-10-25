package com.library.pages;
import com.library.utils.BrowserUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static com.library.utils.BrowserUtil.clickOnElement;
import static com.library.utils.BrowserUtil.enterText;


public class BooksPage extends BasePage{

    @FindBy(xpath = "//span[.='Books']")
    private WebElement booksTab;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    private WebElement addBookButton;

    @FindBy (xpath = "//input[@placeholder='Book Name']")
    private WebElement bookNameInputBox;

    @FindBy (xpath = "//input[@placeholder='ISBN']")
    private WebElement ISBNInputBox;

    @FindBy (xpath = "//input[@placeholder='Year']")
    private WebElement yearInputBox;

    @FindBy (xpath = "//input[@placeholder='Author']")
    private WebElement authorInputBox;

    @FindBy (id= "description")
    private WebElement descriptionInputBox;

    @FindBy(id="book_group_id")
    private WebElement bookCategoryDropDown;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveChangesBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    private WebElement confirmationMessage;

    public void click_books_tab(){
        booksTab.click();
    }


    public void search_book_by(String string){
        BrowserUtil.wait(2);
        searchInputBox.click();
        searchInputBox.sendKeys(string);
    }
    public void click_addBook(){
        addBookButton.click();
    }

    public void addBookName(String bookName){
    BrowserUtil.enterText(bookNameInputBox,bookName);
    }
    public void addISBN(String ISBN){
        BrowserUtil.enterText(ISBNInputBox,ISBN);
    }
    public void addYear(String year){
        BrowserUtil.enterText(yearInputBox,year);
    }
    public void addAuthor(String author){
        BrowserUtil.enterText(authorInputBox,author);
    }
    public void addDescription(String description){
        BrowserUtil.enterText(descriptionInputBox,description);
    }

    public void clickSaveChangesBtn(){
        clickOnElement(saveChangesBtn);
    }

    public boolean confirmationMessageCheck(){
        BrowserUtil.wait(2);
        return confirmationMessage.isDisplayed();
    }



}
