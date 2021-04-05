Feature: Sign In functionality
  As a user
  I want to Sign In on nutickets
  so I can visit My Home Page of nutickets

  @Smoke, @Regression
  Scenario Outline: Verify user is able to Sign In with correct credentials
    Given User is on nu web group home page
    And User click on sign in feature
    And User Enter Email address on Email field "<Email address>"
    And User Enter Password on Password field "<Password>"
    When User click on Sign In button
    Then User should Sign In successfully

    Examples:
      | Email address          | Password     |
      | pdhanani44@hotmail.com | Nutickets123 |

  @Smoke, @Regression
  Scenario Outline: Verify user is not able to Sign In with incorrect credentials
    Given User is on nu web group home page
    And User click on sign in feature
    And User Enter Email address on Email field "<Email address>"
    And User Enter Password on Password field "<Password>"
    When User click on Sign In button
    Then User should not Sign In to system and shows Error message "<Error message>"

    Examples:
      | Email address          | Password      | Error message                               |
      | pdhana44@hotmail.com   | Nutickets123  | These credentials do not match our records. |
      | pdhanani44@hotmail.com | nutickets1234 | These credentials do not match our records. |



