package com.library.pages;
import com.library.utils.BrowserUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage{

    @FindBy(xpath = "//span[.='Books']")
    private WebElement booksTab;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    private WebElement addBookButton;


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

}
