package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import testrunners.ValidateStatusCodeTest;

public class ValidateStatusCodeLibrary {
	RequestSpecification req;
	Response response;
	
	
	@Given("^User sets the base API request$")
	public void user_sets_the_base_API_request(){
    
	RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5";
	}

	@When("^User sends the API request to get the weather details \"([^\"]*)\"$")
	public void user_sends_the_API_request_to_get_the_weather_details(String endpoint)  {
		req =RestAssured.given();
		
	    response=req.request(Method.GET,endpoint);
	    String responseBody= response.getBody().asString();
	 
     System.out.println(responseBody);
	}


    @Then("^User validates the response status is \"([^\"]*)\"$")
	public void user_validates_the_response_status_is(int co) 
	{
	 int re = response.getStatusCode();
	 System.out.println(re);
		Assert.assertEquals(co, response.getStatusCode());   
	}

	@Then("^get field value of latitude$")
	public void get_field_value_of_latitude() {
		double lat = com.jayway.jsonpath.JsonPath.read(response.asString(), "$.coord.lat");
        System.out.println("Latitude=" +lat);
	}

	@Then("^get field value of longitude$")
	public void get_field_value_of_longitude() {
		double lon = com.jayway.jsonpath.JsonPath.read(response.asString(), "$.coord.lon");
        System.out.println("Longitude=" +lon);
	}

	@Then("^get field value of description$")
	public void get_field_value_of_description() {
		 String desc = com.jayway.jsonpath.JsonPath.read(response.asString(), "$.weather[0].description");
	        System.out.println("description=" +desc);
	}

	@Then("^get field value of pressure$")
	public void get_field_value_of_pressure()  {
		Object pressure = com.jayway.jsonpath.JsonPath.read(response.asString(), "$.main.pressure");
        System.out.println("Pressure=" +pressure);
	}

	@Then("^get field value of country$")
	public void get_field_value_of_country() {
		String country = com.jayway.jsonpath.JsonPath.read(response.asString(), "$.sys.country");
        System.out.println("country=" +country); 
	}

	@Then("^get field value of name$")
	public void get_field_value_of_name() {
		 String name = com.jayway.jsonpath.JsonPath.read(response.asString(), "$.name");
	       System.out.println("name=" +name);
	}

}
