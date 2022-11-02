package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/exchange_rates.feature",
glue ={"utils","stepdefinitions"},dryRun = false,
plugin ={"com.cucumber.listener.ExtentCucumberFormatter:reports/exchangeRates.html"})


public class CurrencyConversionTest extends AbstractTestNGCucumberTests
{

}
