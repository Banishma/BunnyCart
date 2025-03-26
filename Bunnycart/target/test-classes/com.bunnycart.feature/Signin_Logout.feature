Feature:
Scenario: To check the user signout process
Given User opens the browser
And User navigates to the "https://www.bunnycart.com/aquatic-plants/duckweed" webpage
Then User clicks on Sign in 
And User enter the '<Email>' Email field
And User enters the '<Password>' Password field
And User click on Sign in button to login
And User click on Sign out button
And User closes the browser
Examples:
|Email|Password|
|banishmadurai@gmail.com|Banishma2000@|