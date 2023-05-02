package RunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\main\\java\\FeatureFiles"},
		glue = {"Hooks", "StepsDefinitions"},
		plugin = {"pretty"}
		
		
	
		)


public class TestRunner {
	
	
	

}
