@team @smoke
Feature: Home Page

  Background: HomePage URL
    Given User goes to newsela.com Homepage "base_URL"

  Scenario: Checking Team members of Newsela and find the Duplicated one
    Given User Hover over to the Company link
    Then User Clicks the Team link
    And User gets the team members name
    When Check the names for duplicated one
    Then Write the duplicated names to the 'Some Details About Newsela.com Text File' if there is.
