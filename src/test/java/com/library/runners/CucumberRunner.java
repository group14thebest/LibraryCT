package com.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features", // path from content root
        glue="com/library/step_definitions", // path from source root
        dryRun=false,   // when we run for our step scenario we make it "true"
                        // when we run our code we need to make it "false"
        tags="@login" // your scenario we will get this from that
)

public class CucumberRunner {

}
