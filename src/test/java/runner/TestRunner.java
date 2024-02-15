package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",glue = "stepDefinition", dryRun = true, monochrome = true,plugin = "pretty")
@RunWith(Cucumber.class)
public class TestRunner {

	
}
