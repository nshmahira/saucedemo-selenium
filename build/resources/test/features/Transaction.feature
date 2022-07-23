@Web
Feature: Transaction Feature
  Background: Login
    Given user input "standard_user" and "secret_sauce"
    And user click login button
    Then user success login
    When user click "Sauce Labs Backpack" to cart
  @sortir
 Scenario: Choose product sorting
    When user select sorting "Name (Z to A)"
    And user click "Test.allTheThings() T-Shirt (Red)" to cart
    And user click cart button
    Then user can see the shopping cart added
    When user remove item "Test.allTheThings() T-Shirt (Red)" from cart
    Then "Test.allTheThings() T-Shirt (Red)" success remove
    When user can click continue shopping


