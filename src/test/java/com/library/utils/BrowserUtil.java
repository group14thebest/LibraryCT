package com.library.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BrowserUtil {
        public static void wait (int seconds){
            try{
                Thread.sleep(seconds*1000);
            }catch(
                    InterruptedException e
            ){
                e.printStackTrace();
            }
        }

    public static void scrollTo(WebElement element){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
    }

    public static void scrollBy(){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("scroll(0,100)");
    }


}
