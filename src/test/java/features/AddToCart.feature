@AddToCart
Feature: This feature is used to test Add to cart funcationality of Swags Lab

  Background: 
    Given I have launched the application
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on login button

  Scenario: Login scuccess scenario using parameters
    When I clcik on product "Sauce Labs Backpack"
    And I click on add to cart
    When I click on Shopping cart link
    Then I should be able to see the item as "Sauce Labs Backpack"
