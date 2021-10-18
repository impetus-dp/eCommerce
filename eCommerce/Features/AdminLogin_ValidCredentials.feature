Feature: eCom Admin Account Login: Valid Credentails

   Scenario: Login with valid credentials
    Given User launch Chrome Browser
    When User opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters username: "admin@yourstore.com"
    And User enters Password: "admin"
    Then Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    And User click on Logout link
    And close chrome browser

  Scenario Outline: Login with valid credentials -> Data Driven
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
      | admin@yourstore.com |  admin  |
      | admin@yourstore.com |  admin  |