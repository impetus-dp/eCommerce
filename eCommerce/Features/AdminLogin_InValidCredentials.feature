Feature: eCom Admin Account Login: InValid Credentails

 
   Scenario: Login with valid invalid credentials
    Given User launch Chrome Browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters username: "admin@yourstore2.com"
    And User enters Password: "admin2"
    Then Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    And User click on Logout link
    And close chrome browser
    
    Scenario Outline: Login with invalid credentials -> Data Driven
    Given User launch Chrome Browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters username: "<email>"
    And User enters Password: "<password>"
    Then Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    And User click on Logout link
    And close chrome browser

    Examples:
      | email | password |
      | admin@yourstore3.com |  admin  |
      | admin@yourstore4.com |  admin  |