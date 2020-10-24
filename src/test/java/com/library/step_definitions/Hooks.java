package com.library.step_definitions;

import com.library.utils.BrowserUtil;
import com.library.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println("Starting Automation");
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        BrowserUtil.wait(3);
        Driver.closeDriver();
        System.out.println("::: End of test execution (*_*):::");
    }

}
