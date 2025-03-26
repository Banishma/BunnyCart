Feature:
Scenario: To sign in and add multiple product to cart
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/aquatic-plants/duckweed" webpage
Then User clicks on Sign in
And User enter the '<Email>' in Email field
And User enters the '<Password>' in Password field
And User click the Sign in button to login
Then User search for product1
And User add product1 to cart
Then User search for product2
And User add product2 to cart
Then User search for product3
And User add product3 to cart
And User close the browser
Examples:
|Email|Password|Product1|Product2|Product3|
|banishmadurai@gmail.com|Banishma2000@|Duckweed|HairGrass|Guppy grass|