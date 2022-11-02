package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.Before;

public class Common_stepdefinitions {
	
	public final static Logger LOGGER = LogManager.getLogger(ValidateStatusCodeLibrary.class);
	@Before
	public void beforeScenario()
	
	{
		LOGGER.info("hello logger");
		try{
			//System.out.println("started....");
			LOGGER.info("hello logger");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
