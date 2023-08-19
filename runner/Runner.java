package www.app.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kaviy\\eclipse-workspace\\Sample\\src\\test\\java\\www\\app\\feature"
		, glue = "www.app.stepdefinition", dryRun = false, monochrome = true)

public class Runner {
}
