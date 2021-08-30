@apply @smoke
Feature: Home Page

  Background: HomePage URL
    Given User goes to newsela.com Homepage "base_URL"

  Scenario: Apply for joining newsela team
    Given User Hover over to the Company link
    Then User Clicks the Career link
    And User Clicks the Join our Team Button
    And User scroll down till TECHNOLOGY cathegory
    Then User clicks Quality Engineer link
