@tag
Feature: Test http status code
  I want to use this template to validate response status code and get values of specified fields

  @validateSC
  Scenario Outline: Validate response status code
    Given User sets the base API request
    When User sends the API request to get the weather details "<endpoint>"
    Then User validates the response status is "<code>"
    And get field value of latitude
    And get field value of longitude
    And get field value of description
    And get field value of pressure
    And get field value of country
    And get field value of name

    Examples: 
      | endpoint                                                        | code |
      | /weather?q=London&appid=b1b15e88fa797225412429c1c50c122a1       |  200 |
      | /weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1    |  200 |
      | /weather?id=2172797&appid=b1b15e88fa797225412429c1c50c122a1     |  200 |
      | /weather?lat=35&lon=139&appid=b1b15e88fa797225412429c1c50c122a1 |  200 |
      | /weather?zip=94040,us&appid=b1b15e88fa797225412429c1c50c122a1   |  200 |
