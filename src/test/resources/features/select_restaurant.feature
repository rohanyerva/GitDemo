Feature: Zomato login and add item to cart
 
Scenario Outline: Select food item and bookmark restaurant with least delivery time
 
    Given User is on the Zomato HomePage and open Sign In page
    When User logins with credentials from Excel
    And User searches for "<food_item>" in the search box
    And User selects "<food_item>" with least delivery time from the search results
    And User bookmarks the selected restaurant
    Then User should see the bookmarked restaurant from profile page
    
Examples:

|food_item|
|Dal Tadka|