Feature: User registration on Bunnycart
Background:
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/aquatic-plants/duckweed" webpage
Then User clicks on creat account 
And User enters '<First name>' in First name
And User enters '<Last name>' in Last name
And User enters '<Email>' in Email
And User enters '<Password>' in Password
Scenario: To check invalid data registration 
And User enters invaliddata in Confirm Password '<Confirm Password>'
And User enters '< WhatsApp Number>' in WhatsApp Number
And User click on the creat button
And User verify an error message
And user close the browser
Scenario Outline: To check valid data registration
And User enters validata in Confirm Password '<Confirm Password>
And User enters '< WhatsApp Number>' in WhatsApp Number
And User click on the creat button
And User verify an successfully registered message
And user close the browser
Examples:
|First name|Last name|Email|Password|Confirm Password|WhatsApp number|
|Banishma|D V|banishmadurai@gmail.com|Bani2000@| |9150802602|
|Banishma|D V|banishmadurai@gmail.com|Bani2000@|Bani2000@|9150802602|