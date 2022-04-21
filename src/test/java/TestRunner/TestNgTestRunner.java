package TestRunner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/FeatureFiles",
		glue="StepDefinitions",
		monochrome=true,
		tags="@SearchItem", 
//		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		plugin= {"rerun:target/test_failed.txt"}
		
		)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
	
	/* For Parallel Execution*/
//	@Override
//	@DataProvider(parallel=true)
//	public Object [][] scenarios(){
//		return super.scenarios();
//	}

}
