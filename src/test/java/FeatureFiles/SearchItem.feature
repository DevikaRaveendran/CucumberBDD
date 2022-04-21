Feature: Search and order products

@SearchItem
Scenario Outline: Search and order the required item from the ecommerce website
Given User is on lulu hypermarket landing page
When User searches the required item <item>
Then User go and checks lulu hypermarket kerala facebook page and send message

Examples:
|item|
|tomato|
|Beeeeeeetroot|