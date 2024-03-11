package stepDefenitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetUp;

public class hooks {
	TestContextSetUp testContextSetUp;
	
	public hooks(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
		
	}
	
	
	@After
	public void AfterScenario() throws IOException
	{
		testContextSetUp.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = testContextSetUp.testBase.WebDriverManager();
		if(scenario.isFailed())
		{
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
}
