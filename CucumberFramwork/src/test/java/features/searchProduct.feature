Feature: Search and Place the order for product

@OffersPage
  Scenario Outline: Search Experience for product in both home and Offers page
    Given User is on Greenkart Landing page
    When User searched with shortname <product> and extracted actual name of product
    Then User searched for <product> shortname in offers page
    And Validate product name in offers page matchs with landing page

    Examples: 
      | product |
      | Tom     |
      | Pot     |
