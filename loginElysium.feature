Feature: Login to Elysium

Scenario: Successful Login with Valid Credentials
	Given User Launch Chrome Browser
	When User Opens "http://23.100.66.76/"
	And Userenters Email as "sstech.admin@sstech.us" and Password as "password"
	And Click on Login
	Then Page Title should be "EA SAAS"
	When User click on Edit Profile
 	And User click on Logout link
 	Then Page Title should be "EA SAAS"
 	And close browser