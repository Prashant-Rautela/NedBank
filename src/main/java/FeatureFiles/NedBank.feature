@feature
Feature: NedBank
  
 @UI 
  Scenario: Place order from the website
  Given User launces application url "https://eqaroloflow.co.za/wp/"
  When User clicks on My Account link.
  When User enters username 'TestUser' and password 'Tester5027#'
  When User clicks on Shop icon at the top
  And User goes to technology link
  When User searches for the product "HP Smart Tank 670 Duplex"
  When User places order for the product
   
   
  @API
  Scenario: Verify API response
  Given User hits endpoint "http://universities.hipolabs.com/search?country=South+Africa"
    
   @API
   Scenario: testing git commands.
   Given I test the file. 
   When I rename the file.
   Then File is renamed.
    
  