Feature: search and place the order for the products

@PlaceOrder
Scenario Outline: Search experience for product search in both home and offers page

Given User is in the greencart home page
When user searched with shortname <Name> and extracted product name in home page
And user add "3" quantity of the product and add to cart
Then user proceeds to checkout page and validate <Name> in check out page
And user Validate the button for apply promotion code and place order

Examples:
| Name  |
| Tom 	|