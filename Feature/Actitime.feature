#Author: Rajesh.rajesh.thakur@mobiotics.com

@tag
Feature: This feature is used to test the login feature
  

  @Login
  Scenario: Login Scenario
   Given Open the browser
   And Pass URL
   Then user should enter into the login page
   When user pass username and password and click  on login
   Then User will come in home page

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
