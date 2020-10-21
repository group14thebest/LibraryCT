package com.library.pages;

import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {

    @FindBy (xpath = "//span[@class='title']")
    protected WebElement pageSubTitle;

    @FindBy (xpath = "/a[@class=‘navbar-brand’]")
    protected WebElement homePageTitleURL;


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


    public String getPageSubTitleText(){
        return pageSubTitle.getText().trim();
    }

    public String gethomePageTitleURL(){
        return homePageTitleURL.getText().trim();
    }
}
