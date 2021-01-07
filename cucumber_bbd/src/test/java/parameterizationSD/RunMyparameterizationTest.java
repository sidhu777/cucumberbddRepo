package parameterizationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
	
		//dryRun=true,
		// features is related , when v place the feature file in someother folder with the help of the features , v can share the path
		features = {"src/test//resources/parameterizationFF"},
		// glue is meant for the step definitions 
		glue= {"parameterizationSD"},
				monochrome=true,
			
		// plugin is meant for the cucumbe  and json reports plugin which v give in cucumber options 
		plugin = {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json8",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html8"
		}
		
		)

public class RunMyparameterizationTest {

}
