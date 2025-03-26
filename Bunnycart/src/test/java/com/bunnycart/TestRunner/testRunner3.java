package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.feature\\SignIn_valid_invalid.feature",
glue= {"com.bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report2.html"},
monochrome=true)
public class testRunner3 extends AbstractTestNGCucumberTests{

}
