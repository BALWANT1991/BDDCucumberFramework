Feature: Application Login
Background:
Given Clear All Cache
When Launch the browser


@RegressionTest
  Scenario Outline: Admin Page Default login
    Given User is on Netbanking Landing Page
    When User login into application with "<username>" and "<password>"
    Then Home page is displayed
    And Card are displayed

    Examples: 
      | username | password |
      | balwant  |      123 |
      | balwant1 |      423 |
      | balwant2 |      523 |
      
      
@smokeTest @Netbanking @Mortage
    Scenario Outline: Admin Page Default login
    Given User is on Netbanking Landing Page
    When User login into application with "Ram" and "123"
    Then Home page is displayed
    And Card are displayed
      