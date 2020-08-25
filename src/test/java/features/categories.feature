Feature: MyWorld com categories

  Scenario: Search for all categories page
    Given User is on MyWorld com home page
    When User opens All Categories dropdown menu
    And User clicks on All Categories
    Then All Categories page is populated

  Scenario: Search for Computer subcategory from Elektronik category
    Given All categories page is opened
    When User clicks on computer subcategory from Electronic category
    And User click on list view button
    Then List view computer products representation is displayed

  Scenario: Sort computer products by most relevant
    Given List view computer products representation
    When User select most relevant option
    Then Computer products are sorted by most relevant products

  Scenario: Sort computer products by cheapest
    Given List view computer products representation
    When User select cheapest option
    Then Computer products are sorted starting from cheapest products

  Scenario: Sort computer products by newest
    Given List view computer products representation
    When User select newest option
    Then Computer products are sorted starting from newest products