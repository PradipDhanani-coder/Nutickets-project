Feature: Check and download sales report functionality
  As a user
  I want to check sales report
  so I can download sales report


  Background: User is Signed In
    Given User is on nu web group home page
    And User click on sign in feature
    And User Enter Email address on Email field "pdhanani44@hotmail.com"
    And User Enter Password on Password field "Nutickets123"
    And User click on Sign In button

  @Sanity
  Scenario: Verify user is able to check and download sales report
    When User click on Reports feature
    And User click on Company sales report feature
    And User Click on Download as feature to download XLSX Report
    And User click on Download as feature to download CSV Report
    And User click on Download as feature to download TSV Report
    And User click on Download as feature to download ODS Report
    And User click on Download as feature to download XLS Report
    And User click on Download as feature to download HTML Report
    Then User should download Reports successfully











#  Scenario: Verify user is able to check and download sales report
#    Given User is on nu web group home page
#    And User click on sign in feature
#    And User Enter Email address on Email field "<Email address>"
#    And User Enter Password on Password field "<Password>"
#    And User click on Sign In button
