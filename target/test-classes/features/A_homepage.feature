@homepage @smoke
Feature: Home Page

  Background: HomePage URL
    Given User goes to newsela.com Homepage "base_URL"


  Scenario: Homepage navigation and check all links
    Given User close the announcement bar
    And User hover over to the header links one by one
    Then User clicks learn more button
    And User scroll down to the bottom of the page
    Then User hover over to the links one by one at the top of the page



