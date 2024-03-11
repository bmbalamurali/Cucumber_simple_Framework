Using this read me to tell how step by step i have created this sample framework

Maven project
Add dependencies – Test Ng, Selenium, Cucumber, pico container (to connect separated stepdefenition which is dependency injection in cucumber)
New Package for Feature files
-	Adding Feature file
New package for StepDefenition
-	Adding stepdefenition
-	Writing selenium codes with locators and action
New package for Cucumber Options
-	TestNGTestRunner to run the feature scenarios
New package for page object file
-	Page object java file for each step definition
-	Put all locators of the respective pages and constructor to bring driver
-	Create methods for selenium action, that can be reused in StepDefenition and simplify
New package for utilities
-	TestContextSetUp (put common variables, driver)
Modify StepDefenition
-	Constructor to bring every common thing (driver, variables) we have in utilities - TestContextSetUp to the stepdefenition
In each StepDefenition we create object for each page object file to access the selenium action methods we wrote in page objects
StepDefenition should not have unwanted things like creating objects because Step definition was intended to do only the particular and don’t want to confuse the people who reading the stepdefenition
Create new page object manager class
-	Here creates object for each page objects
-	This object is used in the step definition to access the selenium action
-	This was the concept of creating object inside step definition is eliminated

New classes base test and generic utilities in utilities pack
-	Test base now has the WebDriver manager and we invoke the driver from here not from Step Definition
-	Generic utilities have generic methods like switch to windows etc

New pack resources
-	Global.properties file for storing global browser and url the extention should be properties
-	File input stream class is used to retrive detail from the global file
-	The browser and ither details are retrived and used in base test
The code is specific to user who wrote the bdd framework so it works in that system only, to make to run in everyone system
-	Place gthe browser exe inside resources
-	Use System.getproperty(“user.dir”)+path of file folder

Hooks class
-	After annotation for browser quit
Scenario Outline for multiple test data
-	<column name> in feature file
-	“^……(.+)….$”  in Step Defenition
To run test parallel using testNG runner, we have to use method inside the parent class AbstractTestNGCucumberTests
@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
		
	}

Add another feature file and page object and step definition for that

We should use @tag to run specific feature

Html reports or extent reports

Add extent report dependency but adapter is required to generate reports for cucumber, so we use adapter developed by grasshopper

New properties file for extent report and tell where to store the report and to generate new report for every run

Hooks @After Step
This runs after every step so we can capture screenshot after evry step if that step is failed
There is one class in cucumber “Scenario” which have all informations about a scenario, so we can use that know the step is failed or not and if failed we take screenshot

Java ternary operator

Result = condition ? value1: value2
