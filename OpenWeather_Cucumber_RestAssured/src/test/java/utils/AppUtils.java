package utils;



import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import stepdefinitions.ValidateStatusCodeLibrary;

public class AppUtils extends BasePage

{
	  private static final Logger LOGGER = LogManager.getLogger(AppUtils.class);
 
   
   @Before
 
	public static void launchApp()
{
	   LOGGER.info("logging started");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.xe.com/");
	}
	
	//close App
   @After
	
	public static void closeApp()
	{
		driver.quit();
	}
	
}
