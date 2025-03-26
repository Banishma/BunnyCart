package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.feature\\CreateAccount.feature",
glue= {"com.bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report.html"},
monochrome=true)
public class testRunner1 extends AbstractTestNGCucumberTests {

}
