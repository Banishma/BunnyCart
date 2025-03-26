package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.feature\\Signin _add_Multipleproducts.feature",
glue= {"com.bunnycart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report3.html"},
monochrome=true)
public class testRunner4 extends AbstractTestNGCucumberTests{

}
