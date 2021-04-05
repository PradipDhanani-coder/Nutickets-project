Feature: Event attendance and order section functionality
  As a user
  I want to check the event attendance list and the orders section
  So I can see event attendance list and order


  Background: User is Signed In
    Given User is on nu web group home page
    And User click on sign in feature
    And User Enter Email address on Email field "pdhanani44@hotmail.com"
    And User Enter Password on Password field "Nutickets123"
    And User click on Sign In button


  @Smoke
  Scenario: Verify Event organiser can see Event attendance list and the orders section
    When User click on orders feature
    And User click on customer orders from given list of orders
    Then User should see their order successfully
