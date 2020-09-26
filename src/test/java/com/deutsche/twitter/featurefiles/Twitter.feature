Feature: Twitter Functionaity 



@BeforeTest
Scenario: Navigate to Login Screen 
	Given User  is  on Twitter Login Screen 
	
	
#@Test	
#Scenario: Successful Login
#When User  enters credentials  and  login

#@Test
#Scenario: Mandatory fields on Login Screen
#When no credentilas are  entered
#When User enters only UserName
#When User enters only Password


#@Test
#Scenario: UpdateProfile Successful
#When User  enters credentials  and  login
#When user  navigates to EditProfileScreen
#When user updates  the details
#Then Profile Updated

@Test
Scenario: UpdateProfilePhoto Successful
When User  enters credentials  and  login
When user  navigates to EditProfileScreen
When user updates  the ProfilePhoto




#@Test
#Scenario:
#When User  enters credentials  and  login
#When user  navigates to EditProfileScreen
#When user updates  the  profilephoto






@AfterTest
Scenario: Succssful Session closure
Given user loggedout
	




	
	