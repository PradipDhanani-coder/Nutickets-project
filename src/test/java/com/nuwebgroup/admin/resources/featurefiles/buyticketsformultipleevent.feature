Feature: Buy tickets for one or multiple events functionality
  As a user
  I want to buy tickets for one or multiple events from nutickets
  so I can visit events


  Background: User is Signed In
    Given User is on nu web group home page
    And User click on sign in feature
    And User Enter Email address on Email field "pdhanani44@hotmail.com"
    And User Enter Password on Password field "Nutickets123"
    And User click on Sign In button

  @Smoke
  Scenario: Verify user is able to Buy tickets for one or multiple events
    When User click on manage events feature
    And User click on Sample Event
    And User click on View event feature
