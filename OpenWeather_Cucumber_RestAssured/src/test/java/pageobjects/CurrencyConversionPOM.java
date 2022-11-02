package pageobjects;

import org.openqa.selenium.By;


public class CurrencyConversionPOM 
{
	
	//define WebPage Elements
	public By amount = By.id("amount");
	public By fromCurrency = By.id("midmarketFromCurrency");
	public By spann = By.className("dark-text");
	public By fromCurrencyValue = By.id("midmarketFromCurrency-descriptiveText");
	//public By fromCurrencyValue = By.id("midmarketFromCurrency-current-selection");
	public By toCurrency = By.id("midmarketToCurrency");
	public By toCurrencyValue = By.tagName("div");
	//public By toCurrencyValue = By.id("midmarketToCurrency-descriptiveText");

	//public By convertButton = By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button");
	//public By result = By.className("result__BigRate-sc-1bsijpp-1 iGrAod");
	
	public By convertButton = By.xpath("//*[@id='__next']/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button");
	public By result = By.xpath("//*[@id='__next']/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[2]");
}
