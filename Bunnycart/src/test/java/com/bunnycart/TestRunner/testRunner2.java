package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.feature\\Signin_AddProduct_to_cart.feature",
glue= {"com.bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report1.html"},
monochrome=true)
public class testRunner2 extends AbstractTestNGCucumberTests{

}
