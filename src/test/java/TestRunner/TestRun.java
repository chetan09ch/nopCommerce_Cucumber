package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// feature file having corresponding steps in stepdefination or not
	    
		features=".//Features/Customers.feature",
		glue="stepDefinations",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"html:test-output" }
				
		)

	
public class TestRun {
  
}
