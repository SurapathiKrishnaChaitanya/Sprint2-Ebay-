package runner;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions( 
	features={"Features"},
	glue= {"stepDefinitions"},
	plugin= {"html:target/destination"},
	tags= {"@Buy"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
	
}
