package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:src\\test\\java\\TestResults\\Cucumber-report\\cucumber.html"},
        monochrome = true,
		features = "src/test/java/features", 
		glue = {"stepDefinitions"})
       

public class TestRunner extends AbstractTestNGCucumberTests {

}
