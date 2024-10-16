package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src/test/resources/cucumber.feature",
		glue = "stepDefinition",
		dryRun = true
		
		)
public class Runner {
	
	

}
