package stepdefinitions;
import org.openqa.selenium.Keys;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.CurrencyConversionPOM;
import utils.BasePage;

public class CurrencyConversionLibrary extends BasePage
{
    CurrencyConversionPOM rate = new CurrencyConversionPOM();
    
    
    @Given("^launch http://www\\.xe\\.com$")
    public void launch_http_www_xe_com() {
     
         System.out.println("User launched www.xe.com");
    }

    @When("^enter \"([^\"]*)\" in Amount field$")
    public void enter_in_Amount_field(String amt)  {
    
        driver.findElement(rate.amount).sendKeys(amt);
    	
    }

    @When("^select \"([^\"]*)\" in From dropdown$")
     public void select_in_From_dropdown(String baseCurrency) {
     
         driver.findElement(rate.fromCurrency).sendKeys(baseCurrency);
    	
    }

    @When("^select \"([^\"]*)\" in To dropdown$")
    public void select_in_To_dropdown(String targetCurrency) throws InterruptedException  {
    
    	driver.findElement(rate.toCurrency).sendKeys(targetCurrency, Keys.ENTER);
    }

    @When("^click on the convert button$")
    public void click_on_the_convert_button()  {
      
    	driver.findElement(rate.convertButton).click();
    }

    @Then("^read the converted value and display the value$")
    public void read_the_converted_value_and_display_the_value() {
    
       Object convertedVal = driver.findElement(rate.result).getText();
       System.out.println("The converted value is:" +convertedVal);
    }

	
}
