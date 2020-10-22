package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login(string);
    }


    @Then("user should see dashboard page")
    public void user_should_see_dashboard_page() {
       String expected = "Login - Library";
       String actual = loginPage.getTitle();
        System.out.println(loginPage.getTitle());

       Assert.assertEquals("Title is not correct, verification FAILED!", expected, actual);
        System.out.println("I see the the Librarian page dashboard");
        Driver.closeDriver();


    }


}
