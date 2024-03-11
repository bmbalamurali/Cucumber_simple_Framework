package CucumberOptrions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="stepDefenitions"
,monochrome=true, tags ="@PlaceOrder or @OfferPage",
plugin= {"html:target/cucumber.html", "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
		
	}
}
//	src\test\java\features
//	src/test/java/features


//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//"rerun:target/failed_scenarios.txt"