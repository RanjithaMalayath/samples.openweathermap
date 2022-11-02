package testrunners;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import stepdefinitions.ValidateStatusCodeLibrary;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/ValidateStatusCode.feature",
glue ={"stepdefinitions"},dryRun = false, monochrome=true,
plugin ={"com.cucumber.listener.ExtentCucumberFormatter:reports/validatestatuscode.html"})


public class ValidateStatusCodeTest extends AbstractTestNGCucumberTests
{
	
	
}



