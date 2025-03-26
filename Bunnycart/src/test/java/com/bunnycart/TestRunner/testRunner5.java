package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.feature\\Signin_Logout.feature",
glue= {"com.bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report4.html"},
monochrome=true)

public class testRunner5 extends AbstractTestNGCucumberTests{

}
 