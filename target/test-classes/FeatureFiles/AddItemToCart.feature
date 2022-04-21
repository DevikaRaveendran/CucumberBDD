Feature: Search and add products to cart

@AddItemToCart
Scenario Outline: Search and order the required item from the ecommerce website
Given User is on lulu hypermarket landing page
When User searches the required item <item>
And Verifies the product name <item> is displayed
And Add the quantity <quantity> of the required product and Add it to cart
Then User enters <username> and <password> to log in to place order

Examples:
|item		 |quantity |username     |password|
|Beetroot|			10 |abc@gmail.com|abcd@12 |