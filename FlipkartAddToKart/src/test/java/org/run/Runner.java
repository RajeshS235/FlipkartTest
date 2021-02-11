package org.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Customers.feature",
glue= {"com.stepdefinitions"}, plugin= {"html: test-output/html"},
dryRun=false, monochrome=true)
public class Runner {

}
