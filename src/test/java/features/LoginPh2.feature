Feature: This feature is used to test the login funcationality of saucedemo.com
@Login
  Scenario: Login success scenario using parameters
    Given I have launched the application
    When I enter username
    And I enter password 
    And I click on login button
    Then I should land on home page

  Scenario Outline: Login Failure scenario using examples 
    Given I have launched the application
    When I enter username as "<Username>"
    And I enter password as "<Pwd>"
    And I click on login button
    Then I should get error message as "<Error>"

    Examples: 
      | Username        | Pwd          | Error                                                                     |
      | standard_user   |        12345 | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
