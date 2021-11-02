
#normal Valiadation datadriven
#Feature: To validate login functionality of facebook
#Scenario: Validate with invalid username and invalid password
#Given  The user should launch the chrome browser
#When The user should type the url
#And The user should maxmize the window
#And The user should type the invalid username and invalid password
#And The user should click the login button
#And The user should get the title of the incorrect credential page
#Then The user should naviage to incorrect credential page
@smoke
Feature: To validate login functionality of facebook
Background:
Given  The user should launch the chrome browser
When The user should type the url
And The user should maxmize the window

#Scenario: Validate with invalid username and invalid password
#And The user should type the invalid username and invalid passwords
          #1D List *******WithOut Header
          #|sai|sai@123|varahi|varagi@123|
          
#Scenario: Validate with invalid username and invalid password Using 2 Dimensioanl DataTable
#And The user should type the invalid username and invalid passwords
          #2D List *******WithOut Header
          #|sai|sai@123|varahi|varagi@123|
          #|saibaba|saibaba@123|varahiamman|varagiamman@123|
          
#Scenario: Validate with invalid username and invalid password Using  1 Dimensioanl DataTable
#And The user should type the invalid username and invalid passwords
          #1D Map *******With Header
          #|User|sai|
          #|Passs|saibaba@123|
          #|User1|varagi|
          #|Passs1|varagi@123|
 @sanity     
Scenario: Validate with invalid username and invalid password Using  2 map Dimensioanl DataTable
And The user should type the invalid username and invalid passwords
          |first|last|user|pass|data|storage|
          |saibaba|saibaba@123|varahiamman|varagiamman@123|shanbaba|shanraja@123|
          |jothi|jothi@123|karthi|kathikumar@123|jai|jai@123|
          |saha|sahadevan@123|karthi|karthikeyan@123|shan|shanraja@123|
          
          
And The user should click the login button
And The user should get the title of the incorrect credential page
Then The user should naviage to incorrect credential page
@regression
Scenario Outline: Validate with invalid username and invalid password

And The user should type the invalid username"<user>" and invalid password"<pass>"
And The user should click the login button
And The user should get the title of the incorrect credential page
Then The user should naviage to incorrect credential page

Examples:
|user|pass|
|shan|raja@123|
|varagi|varagi@123|
|sai|sai@123|

