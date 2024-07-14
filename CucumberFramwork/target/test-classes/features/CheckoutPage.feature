Feature: Place the order for product

  @placeOrderPage
  Scenario Outline: Search Experience for product in both home and Offers page
    Given User is on Greenkart Landing page
    When User searched with shortname <product> and extracted actual name of product
    And Added the "3" items of the selected product to cart
    Then User proceeds to checkout and validate the <product> items in checkout page
    And Verify user has ability to enter promo code and place the order

    Examples: 
      | product |
      | Tom     |
