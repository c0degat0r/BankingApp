package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = "stepDefinition", 
		dryRun = false, 
		monochrome = true,
		plugin = {
				"pretty",
				"html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-reports/cucumber.json"
		},tags="@application"
		)

@RunWith(Cucumber.class)
public class TestRunner {

	
}
