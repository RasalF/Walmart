Feature: Buy a shoe from Walmart

  @hb
  Scenario: Add a shoe to the cart
    Given I am on the Walmart website
    When I search for "running shoes"
    And I click on the product "Nike Running Shoes"
    And I add the product to the cart
    Then the product should be in the cart
