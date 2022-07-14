package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber/report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",},

        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions",
        publish = true,
        //true = for get snippets
        tags = "@smoke"  // it will run all @smoke tags scenarios
        //I will determine common tag for all of my future. @Regression and not @student
)
public class CukesRunner {
}