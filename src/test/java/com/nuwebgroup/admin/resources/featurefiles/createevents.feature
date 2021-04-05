Feature: Create events functionality
  As a user an Event Organiser
  I want to create one or several events
  So I can least one ticket type with limited stock and unlimited stock

  Background: User is Signed In
    Given User is on nu web group home page
    And User click on sign in feature
    And User Enter Email address on Email field "pdhanani44@hotmail.com"
    And User Enter Password on Password field "Nutickets123"
    And User click on Sign In button


  @Smoke, @Sanity
  Scenario Outline: Verify User is able to create one or several events with at least one tickets type with limited stock
    When User click on Add new event feature
    And User enter event name on event name field "<Event name>"
    And User enter event description on event description field "<Event description>"
    And User click on next button
    And User click on Venue
    And User select venue from select existing venue
    And User click on Start date calendar enter Start date "24/12/2021"
    And User click on Start time field and enter Start time "01:00"
    And User click on End time field and enter End time "06:00"
    And User click on Next button feature
    And User Enter Ticket name on Ticket name field "PDD ticket"
    And User Enter Ticket description on Ticket description field "With Limited stock"
    And User click on next btn
    And User click on Pricing GBP feature
    And User enter any Base price in Base price field "1"
    And User click on Preview event
    And User click on save and publish button
    Then Event organiser should published event successfully

    Examples:
      | Event name    | Event description |
      | Dhanani Event | Limited stock     |