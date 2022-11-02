@currencyConversion
Feature: Exchange Rates
  Display the conversion value from USD to INR

  @USDtoINR
  Scenario: Get currency USD/INR rate
  
    Given launch http://www.xe.com
    When enter "5$" in Amount field
    And select "US" in From dropdown
    And select "INR" in To dropdown
    And click on the convert button
    Then read the converted value and display the value