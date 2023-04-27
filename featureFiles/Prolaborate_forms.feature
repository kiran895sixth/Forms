#Project designed by  : Kiran Kumar
#project purpose : Prolaborate Forms Testing


Feature: This is verifiying prolaborate forms
@tag1
	Scenario: Verifiying prolaborate take a trial request successfully sended
		Given User is open the URL
		When 	User click on Take a trial button
		Then  User enter vaild details 
		And 	User click on Submit button
		Then user should see Welcome to Prolaborate Message and My Account button
		
@tag2
	Scenario: Verifiying prolaborate book a demo request successfully sended
		Given User is open the URL
		When 	User click on book a demo button
		Then  User enter vaild details in book a demo form 
		And 	User click on Submit button 
		Then 	user should see thankyou Message 

@tag3
	Scenario: Verifiying prolaborate book a demo request successfully sended
		Given User is open the URL
		When 	User click on setup a PoC button
		Then  User enter vaild details in setup a PoC form 
		And 	User click on Submit button 
		Then 	user should see thankyou Message Poc submit

@tag4
	Scenario: Verifiying user click on book a demo from menu redirected to related page 
		Given User is open the URL
		When  User mouse over on start here  
		And 	User click on book a demo button from menu
		Then  User should see book a demo form
		
@tag5
		Scenario: Verifiying user click on Take a trial from menu redirected to related page 
		Given User is open the URL
		When  User mouse over on start here  
		And 	User click on Take a trial button from menu
		Then  User should see Take a trial form	
		
@tag6
Scenario: Verifiying user click on setup a PoC from menu redirected to related page 
		Given User is open the URL
		When  User mouse over on start here  
		And  	User click on setup a PoC button from menu
		Then  User should see setup a PoC form	

@tag7
Scenario: Verifiying user click on contact us from home page is redirected to related page 
		Given User is open the URL
		When  User is click on the contact us link
		Then  User sholud redirected to related page	

@tag8
Scenario: Verifiying prolaborate contact us request successfully sended
		Given User is open the URL
		When  User is click on the contact us link
		Then  User enter vaild details in contact us form 	
		And 	User click on Submit button 			
		Then 	User should see thankyou Message for submit
		
@tag9
Scenario: Verifiying user click on my account from home page is redirected to login page 
		Given User is open the URL
		When  User is click on the my account link
		Then  User sholud redirected to login page			
		
		
@tag10
Scenario: Verifiying user click on my account from home page is redirected to login page 
		Given User is open the URL
		When  User is click on the my account link
		And 	User click on the Register for a Trial link
		Then  User should see Take a trial form	from login page
		
@tag11
Scenario: Verifiying user click on premises learn more link from home page is redirected to premises page 
		Given User is open the URL
		When  User is click on the premises learn more link
		Then  User should redirect to premises page
		
@tag12
Scenario: Verifiying user click on cloud saas learn more link from home page is redirected to cloud saas page 
		Given User is open the URL
		When  User is click on the cloud saas learn more link
		Then  User should redirect to cloud saas page
		
@tag13
Scenario: Verifiying user clinking on the take a trial from premises page redirects to the take a trial form page
		Given User is open the URL
		When  User is click on the premises learn more link
		And 	User is click on take a trial button
		Then  User should redirect to take a trial form page
		
@tag14
Scenario: Verifiying user clinking on the setup poc from premises page redirects to the related page
		Given User is open the URL
		When  User is click on the premises learn more link
		And 	User is click on setup poc button
		Then  User should redirect to setup poc related page
		
@tag15
Scenario: Verifiying user clinking on the check faq from cloud saas page redirects to the related page
		Given User is open the URL
		When  User is click on the cloud saas learn more link
		And 	User is click on check FQA button
		Then  User should redirect to check FQA related page
				
@tag16
Scenario: Verifiying user clinking on the  setup poc from cloud saas page redirects to the related page
		Given User is open the URL
		When  User is click on the cloud saas learn more link
		And 	User is click on setup poc button
		Then  User should redirect to setup poc related page from cloud saas
		
		
@tag17
Scenario: Verifiying user clinking on the Cloud Proof of Concept link from Proof of Concept page redirects to the related page
		Given User is open the URL
		When  User is click on the premises learn more link
		And 	User is click on setup poc button
		And 	User is click on cloud proof of concept link
		Then  User should redirect to cloud proof of concept related page 
		
@tag18
Scenario: Verifiying user clinking on the setup poc  link from Cloud Proof of Concept page redirects to the related page
		Given User is open the URL
		When  User is click on the cloud saas learn more link
		And 	User is click on setup poc button
		And 	User is click on setup poc form link
		Then  User should see setup a PoC form from cloud proof of concept page
		
@tag19
Scenario: Verifiying user clicking on the take a trial on bottom of home page is redirects to the related page
		Given User is open the URL
		When  User is click on the take a trial link bottom on the home page
		Then  User should see take a trial form 		
		
@tag20
Scenario: Verifiying user click on my account from home page is redirected to login page 
		Given User is open the URL
		When  User is click on the my account link
		And 	User click on the forgot password link
		Then  User should see forgot password page
		
@tag21
Scenario: Verifiying user clicking on blog post link from setup poc form page is redirect to the related page
		Given User is open the URL
		When  User mouse over on start here  
		And  	User click on setup a PoC button from menu
		And 	User click on blog post link
		Then 	User should see blog post link related page
		
@tag22
	Scenario: Verifiying user clicking on preview ea diagram link is redirect to related page
		Given User is open the URL
		When 	User click on Take a trial button
		Then  User click preview ea diagram link 
		Then 	User should see prolaborate ea digaram page
		
@tag23
	Scenario: Verifiying user clicking on preview model link is redirect to related page
		Given User is open the URL
		When 	User click on Take a trial button
		Then  User click preview model link 
		Then 	User should see prolaborate model page
		
@tag24
	Scenario: Verifiying user clicking on preview dashboard link is redirect to related page
		Given User is open the URL
		When 	User click on Take a trial button
		Then  User click preview dashboard link
		Then 	User should see prolaborate dashboard page
		
@tag25
	Scenario: Verifiying user clicking on preview my diagrams link is redirect to related page
		Given User is open the URL
		When 	User click on Take a trial button
		Then  User click preview my diagrams link
		Then 	User should see prolaborate my diagrams page
		
@tag26
	Scenario: Verifiying user clicking on start here is redirects to the start here home page
		Given User is open the URL
		When 	User click on start here link
		Then 	User should see start here home page
		
@tag27
	Scenario: Verifiying user clicking on customers is redirects to the start here home page
		Given User is open the URL
		When 	User click on customers link
		Then 	User should see customers home page
		
@tag28
	Scenario: Verifiying user clicking on resources is redirects to the start here home page
		Given User is open the URL
		When 	User click on resources link
		Then 	User should see resources home page
		
@tag29
	Scenario: Verifiying user clicking on get started with ea cloud from float menu is redirects to the related page
		Given User is open the URL
		When 	User click on get started with ea cloud link from float menu
		Then 	User should see get started with ea cloud related page
		
@tag30
	Scenario: Verifiying user clicking on get started with prolaborate from float menu is redirects to the related page
		Given User is open the URL
		When 	User click on get started with prolaborate link from float menu
		Then 	User should see get started with prolaborate related page
		
@tag31
	Scenario: Verifiying user clicking on contact us from float menu is redirects to the related page
		Given User is open the URL
		When 	User click on contact us link from float menu
		Then 	User should see contact us related page
		
@tag32
	Scenario: Verifiying the purchase ea cloud rquest successfully  sended
		Given User is open the URL
		When 	User click on get started with ea cloud link from float menu
		Then  User enter the valid details in purchase form
		And 	User click on Submit button in purchase
		Then 	User should see thank you success message
		
@tag33
	Scenario: Verifiying the purchase prolaborate rquest successfully  sended
		Given User is open the URL
		When 	User click on get started with prolaborate link from float menu
		Then  User enter the valid details in purchase prolaborate form
		And 	User click on Submit button in purchase prolaborate
		Then 	User should see thank you success message purchase prolaborate
		
@tag34
	Scenario: Verifiying user clicking on features from start here home page is redirect to related page
		Given User is open the URL
		When 	User click on start here link
		Then 	User click on features view button 
		Then 	User should see features related page
		
@tag35
	Scenario: Verifiying user clicking on pricing from start here home page is redirect to related page
		Given User is open the URL
		When 	User click on start here link
		Then 	User click on pricing view button 
		Then 	User should see pricing related page
		
@tag36
	Scenario: Verifiying user clicking on tour from start here home page is redirect to related page
		Given User is open the URL
		When 	User click on start here link
		Then 	User click on tour view button 
		Then 	User should see tour related page
		
@tag37
	Scenario: Verifiying user clicking on prolaborate on premises from start here home page is redirect to related page
		Given User is open the URL
		When 	User click on start here link
		Then 	User click on prolaborate on premises view button 
		Then 	User should see prolaborate on premises related page
		
@tag38
	Scenario: Verifiying user clicking on cloud platfrom from start here home page is redirect to related page
		Given User is open the URL
		When 	User click on start here link
		Then 	User click on cloud platfrom view button 
		Then 	User should see cloud platfrom related page
		
@tag39
	Scenario: Verifiying user clicking on ea saas from start here home page is redirect to related page
		Given User is open the URL
		When 	User click on start here link
		Then 	User click on ea saas view button 
		Then 	User should see ea saas related page
		
@tag40
	Scenario: Verifiying user clicking on articles from resources home page is redirect to related page
		Given User is open the URL
		When 	User click on resources link
		Then 	User click on articles view button 
		Then 	User should see articles related page
		
@tag41
	Scenario: Verifiying user clicking on  release notes from resources home page is redirect to related page
		Given User is open the URL
		When 	User click on resources link
		Then 	User click on  release notes view button 
		Then 	User should see  release notes related page
		
@tag42
	Scenario: Verifiying user clicking on vth documentation from resources home page is redirect to related page
		Given User is open the URL
		When 	User click on resources link
		Then 	User click on third version documentation view button 
		Then 	User should see third version documentation related page
		
@tag43
	Scenario: Verifiying user clicking on v4 documentation from resources home page is redirect to related page
		Given User is open the URL
		When 	User click on resources link
		Then 	User click on fourth version documentation view button 
		Then 	User should see fourth version documentation related page
		
@tag44
	Scenario: Verifiying user clicking on prolaborate FAQ from resources home page is redirect to related page
		Given User is open the URL
		When 	User click on resources link
		Then 	User click on prolaborate FAQ view button 
		Then 	User should see prolaborate FAQ related page
		
@tag45
	Scenario: Verifiying user clicking on events from resources home page is redirect to related page
		Given User is open the URL
		When 	User click on resources link
		Then 	User click on events view button 
		Then 	User should see events related page
		
@tag46
	Scenario: Verifiying user clicking on videos from resources home page is redirect to related page
		Given User is open the URL
		When 	User click on resources link
		Then 	User click on videos view button 
		Then 	User should see videos related page
		
@tag47
	Scenario: Verifiying user scroll down in ea saas page request a quote popup is visible or not
		Given User is open the URL
		When 	User click on start here link
		And  	User click on ea saas view button 
		And 	User scroll down the page
		Then 	User should see request quote popup
		
@tag48
	Scenario: Verifiying user scroll down in ea saas page request a quote popup is visible or not
		Given User is open the URL
		When 	User click on start here link
		And  	User click on ea saas view button 
		And 	User scroll down the page
		And 	User click request a quote link from popup
		Then 	User should see request quote related page
		
@tag49
	Scenario: check if the prolaborate Installer request successfully  sended from the release-notes page
		Given User is open the URL
		When 	User click on resources link
		Then 	User click on  release notes view button
		Then 	User click on latest version 
		Then  User click Request Installer button
		Then  User enter vaild details in request installer form
		And 	User click on Submit button
		Then 	User should see thankyou Message for request installer submit
		
		