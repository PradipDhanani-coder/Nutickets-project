Feature:Create a new user role that can access all the Events functionality
  As a user
  I want to Create a new user role in nutickets
  so I can access to all the Events, Venues and Orders.

  Background: User is Signed In
    Given User is on nu web group home page
    And User click on sign in feature
    And User Enter Email address on Email field "pdhanani44@hotmail.com"
    And User Enter Password on Password field "Nutickets123"
    And User click on Sign In button

  @Sanity
  Scenario: Verify User is able to Create a new user role that can access all the Events, Venues and Orders
    When User click on Manage users feature
    And User click on Add user feature
    And User enter Name on Name field
    And User enter Email on Email field
    And User enter Password on Password field
    And User click on submit Feature
    Then User should created successfully



