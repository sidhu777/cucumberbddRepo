package tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,	
		//dryRun=true,
		
	//  tags= {"@Important"}, // All scenarios will be excuted when use this tag 
		
	//	tags= {"@Smoke"}, //All the smoke secenarios will be excuted in the feature file when we use this tag
		
	//	tags={"@Regression"}, //All the regression secenarios will be excuted in the feature file when we use this tag
		
	//	tags= {"@Smoke","@Regression"}, // 'And' condition this scenario is having tags of both "@smoke, @regression then it will exctute  
		
		
	 tags={"@Smoke,@Regression"}, // 'OR' condition if any of the scenarios has any of tag condition it will excute 	
		
// note: if any of scenario wount have any tag condition means it wount excute that scenario
	 
	 
		// features is related , when v place the feature file in someother folder with the help of the features , v can share the path
		features = {"src/test//resources/tagsFF"},
		// glue is meant for the step definitions 
		glue= {"tagsSD"},
				
			
		// plugin is meant for the cucumbe  and json reports plugin which v give in cucumber options 
		plugin = {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json10",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html10"
		}
		
		)

public class RunMyTagsTest {

}
