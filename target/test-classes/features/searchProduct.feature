Feature: search and place the order for the products

Scenario Outline: Search experience for product search in both home and offers page

@OfferPage
Given User is in the greencart home page
When user searched with shortname <Name> and extracted product name in home page
Then user searched the shortname <Name> in offers page to check if product exist
And Validate product name of home page matches with product in offers page

Examples:
| Name |
| Tom  |
| Beet |
