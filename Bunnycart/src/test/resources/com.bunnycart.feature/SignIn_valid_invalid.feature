Feature: To check sing in with valid and invalid datas
Background:
Given User opens the browser
And User navigates to the "https://www.bunnycart.com/aquatic-plants/duckweed" webpage
Then User clicks on sign in
And User enter the '<Email>' in Email
Scenario: To check login with invalid data
And User enters the invalid '<Wrong Password>' in Password
And User click on sign in button 
And User closes the browser
Scenario Outline: To check login with valid datas
And User enters the valis data '<Password>' in Password
And User click on sign in button
Examples:
|Email|Wrong Password|Password|
|banishmadurai@gmail.com|Bani|Bani2000@|