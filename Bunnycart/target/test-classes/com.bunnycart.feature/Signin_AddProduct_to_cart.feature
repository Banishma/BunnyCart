Feature:
Scenario: To sign in and add a product to cart
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/aquatic-plants/duckweed" webpage
Then User clicks on Sign in
And User enters the Sign in datas
|bunnycart data.xlsx|
And User clicks on Sign in button
And User search for a product
Then User select a product
And User add a product to cart
And User close the browser
Examples:
|Email|Password|
|banishmadurai@gmail.com|Bani2000@|