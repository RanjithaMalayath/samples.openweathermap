# Cucumber Framework

> Note: All the assignments are added in the same project.

 

## 1.Execute this API call in a browser (Do it manually)
https://samples.openweathermap.org/data/2.5/history/city?q=London,UK&appid=b1b15e88fa797225412429c1c50c122a1

  - The above API call was hit in a browser manually and convert the json to excel format.
  - The converted excel is attached to this project and named as "api.xlsx".
 
## 2.Now setup a project in Java and parse the JSON content 
  - The class for parsing the JSON content is written in "JSONParseTest.java" class under "com.openweathermap.parse" package.

RESULT:
https://github.com/RanjithaMalayath/samples.openweathermap/blob/master/OpenWeather_Cucumber_RestAssured/Screenshot%20(239).png

## 3. Read data from Excel file – 5 columns but all rows in the file.
  - The runner class is created under "com.openweathermap.readxl" package and named as "TestExcelUtils.java".
  - The excel utilities class, "ExcelUtils.java" can be seen under "Utils" package.

RESULT:
https://github.com/RanjithaMalayath/samples.openweathermap/blob/master/OpenWeather_Cucumber_RestAssured/Screenshot%20(240).png
  
## 4. Execute the below API calls by creating a cucumber framework and validate the status code and get the values of following fields: latitude ,longitude,description, pressure, country and name.

- Step I : Created Maven Project and added relevant dependencies in "pom.xml" file.
- Step II : Create feature file (ValidateStatusCode.feature) in Gherkin Syntax by creating a new folder "features" under "src/test/resources"
- Step III : Create the following packages and classes
           Package 1: stepdefinitions (Library class for feature file)
                      Class Name: ValidateStatusCodeLibrary
           Package 2: testrunners (test case class)
                      Class Name: ValidateStatusCodeTest  
                      
 >  The results can be viewed inside "reports" folder as validatestatuscode.html

![image](https://user-images.githubusercontent.com/47724104/199488009-fd6acf54-0565-4036-b95e-5ac71bb0dd6a.png)
![image](https://user-images.githubusercontent.com/47724104/199488092-21b66f7e-fbf8-45bf-ae1a-953984396b17.png)
![image](https://user-images.githubusercontent.com/47724104/199488123-dc4baaef-5d62-4e2b-b685-781c52e9b01e.png)
![image](https://user-images.githubusercontent.com/47724104/199488195-9c88958c-7893-4945-b567-7042376ce690.png)
![image](https://user-images.githubusercontent.com/47724104/199488224-ec2c7619-d26e-4edb-8eed-9a716f2c7276.png)
![image](https://user-images.githubusercontent.com/47724104/199488273-400e774d-15d5-4c89-b850-c803c6ed8ead.png)
![image](https://user-images.githubusercontent.com/47724104/199488302-e63f640f-2822-4010-ad36-0a256bec3947.png)
![image](https://user-images.githubusercontent.com/47724104/199488334-7caa1cc7-01dc-435e-86bb-19d5faf7bfe1.png)
![image](https://user-images.githubusercontent.com/47724104/199488361-25e14d60-71eb-49b8-a782-7bb159bf8c20.png)


 
 ## 5. With Java and selenium launch browser and launch http://www.xe.com Enter the 5$ in “Amount" field and select US in “From” dropdown and select the INR from “To" field and click on the convert button.Read the converted value and display the value 
  
  - All common utils are placed inside "Utils" package.
  - Used cucumber framework to execute this project.
  
- Step I : Added relevant dependencies in "pom.xml" file.
- Step II : Create feature file (exchange_rates.feature) in Gherkin Syntax by creating a new folder "features" under "src/test/resources"
- Step III : Create the following packages and classes

           Package 1: pageobjects (To keep all page objects)
                      Class Name: CurrencyConversionPOM
           Package 1: stepdefinitions
                      Class Name: CurrencyConversionLibrary
           Package 2: testrunners
                      Class Name: CurrencyConversionTest 
             
   >  The results can be viewed inside "reports" folder as exchangeRates.html             

https://github.com/RanjithaMalayath/samples.openweathermap/blob/master/OpenWeather_Cucumber_RestAssured/exchangeRates.pdf


