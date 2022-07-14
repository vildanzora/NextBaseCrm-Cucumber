package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = { "json:target/json-report/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "junit:target/MyReports-report.xml"
        },

        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        //true = for get snippets
        tags = "@userstory4"  // it will run all @smoke tags scenarios
        //I will determine common tag for all of my future. @Regression and not @student
)
public class CukesRunner {
}