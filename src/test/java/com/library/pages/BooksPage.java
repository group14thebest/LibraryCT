package com.library.pages;
import com.library.utils.BrowserUtil;
import com.library.utils.BrowserUtil.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(xpath="//select[@id='book_categories']")
    private WebElement bookCategoryDropDown;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveChangesBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    private WebElement confirmationMessage;

    @FindBy(xpath = "//select[@id='book_categories']/option[@value='16']")
    private WebElement romance;

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    private WebElement editBookBtn;



    public void click_books_tab(){
        booksTab.click();
    }
    public void search_book_by(String string){
        BrowserUtil.wait(2);
        searchInputBox.click();
        searchInputBox.sendKeys(string);
    }
    public void click_addBook(){
       clickOnElement(addBookButton);
    }
    public void add_edit_bookName(String bookName){
    BrowserUtil.enterText(bookNameInputBox,bookName);
    }
    public void add_edit_ISBN(String ISBN){
        BrowserUtil.enterText(ISBNInputBox,ISBN);
    }
    public void add_edit_year(String year){
        BrowserUtil.enterText(yearInputBox,year);
    }
    public void add_edit_author(String author){
        BrowserUtil.enterText(authorInputBox,author);
    }
    public void add_description(String description){
        BrowserUtil.enterText(descriptionInputBox,description);
    }
    public void clickSaveChangesBtn(){
        clickOnElement(saveChangesBtn);
    }
    public boolean confirmationMessageCheck(){
        BrowserUtil.wait(2);
        return confirmationMessage.isDisplayed();
    }
    public void clickAndSelectBookCategories(){
        Select bookCategory = new Select(bookCategoryDropDown);
        BrowserUtil.wait(3);
        bookCategory.selectByVisibleText("Romance");
    }
    public void clickEditBookBtn(){
        clickOnElement(editBookBtn);
    }
}
