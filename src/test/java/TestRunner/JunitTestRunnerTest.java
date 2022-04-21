package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/FeatureFiles",
		glue="StepDefinitions",
		monochrome=true
//		tags="@AddItemToCart" 
//		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		plugin= {"rerun:target/test_failed.txt"}
		
		)
public class JunitTestRunnerTest {
	

}
