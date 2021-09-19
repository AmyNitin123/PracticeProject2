@Search-Cars
Feature: Acceptance testing to validate Search Cars page is working fine
  In order to validate that the search cars page is working fine,we will do the acceptance testing

  @Search-Cars-Positive
  Scenario Outline: Validate Search Cars page
    Given User is on home page of "https://www.carsguide.com.au/" Cars Guide Website
    When User navigate to the menu
      | menu          |
      | buy + sell    |
      | reviews       |
      | news          |
      | advice        |
      | pricing+specs |
    And User clicks on "Search Cars" link
    And Selects make as "BMW" from the dropdown
    And Selects model as "1 Series" from the dropdown
    And Selects location as "Any Location" from the dropdown
    And Selects price max as "$200,000"
    And Click on "Find My Next Car" button
    Then Validate the page title as "Bmw 1 Series Under 200000 for Sale | carsguide"
    And validate the list of search cars in the result page
