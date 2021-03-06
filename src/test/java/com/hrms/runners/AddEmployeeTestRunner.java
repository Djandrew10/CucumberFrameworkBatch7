package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features\\AddEmployee.feature",
            glue = "com/hrms/stepDefinitions",
            dryRun = false,
            monochrome = true,
            tags = "",
            strict = false,
            plugin = {"pretty",
            		"html:target/cucumber-default-reports",
            		"rerun:target/FailedTests.txt"})

public class AddEmployeeTestRunner {
	
}