$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/nuwebgroup/admin/resources/featurefiles/buyticketsformultipleevent.feature");
formatter.feature({
  "line": 1,
  "name": "Buy tickets for one or multiple events functionality",
  "description": "As a user\r\nI want to buy tickets for one or multiple events from nutickets\r\nso I can visit events",
  "id": "buy-tickets-for-one-or-multiple-events-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10046853000,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User is Signed In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Enter Email address on Email field \"pdhanani44@hotmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Enter Password on Password field \"Nutickets123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on Sign In button",
  "keyword": "And "
});
formatter.match({
  "location": "SignInTest.userIsOnNuWebGroupHomePage()"
});
formatter.result({
  "duration": 227030900,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInFeature()"
});
formatter.result({
  "duration": 267389000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdhanani44@hotmail.com",
      "offset": 41
    }
  ],
  "location": "SignInTest.userEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 660639400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nutickets123",
      "offset": 39
    }
  ],
  "location": "SignInTest.userEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 287120800,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 171357000,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify user is able to Buy tickets for one or multiple events",
  "description": "",
  "id": "buy-tickets-for-one-or-multiple-events-functionality;verify-user-is-able-to-buy-tickets-for-one-or-multiple-events",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User click on manage events feature",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User click on Sample Event",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on View event feature",
  "keyword": "And "
});
formatter.match({
  "location": "BuyTicketsForEventsTest.userClickOnManageEventsFeature()"
});
formatter.result({
  "duration": 2148427400,
  "status": "passed"
});
formatter.match({
  "location": "BuyTicketsForEventsTest.userClickOnSampleEvent()"
});
formatter.result({
  "duration": 2225092900,
  "status": "passed"
});
formatter.match({
  "location": "BuyTicketsForEventsTest.userClickOnViewEventFeature()"
});
formatter.result({
  "duration": 2001304400,
  "status": "passed"
});
formatter.after({
  "duration": 1580753000,
  "status": "passed"
});
formatter.uri("src/test/java/com/nuwebgroup/admin/resources/featurefiles/checkanddownloadsalesreport.feature");
formatter.feature({
  "line": 1,
  "name": "Check and download sales report functionality",
  "description": "As a user\r\nI want to check sales report\r\nso I can download sales report",
  "id": "check-and-download-sales-report-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7927857000,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User is Signed In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Enter Email address on Email field \"pdhanani44@hotmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Enter Password on Password field \"Nutickets123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on Sign In button",
  "keyword": "And "
});
formatter.match({
  "location": "SignInTest.userIsOnNuWebGroupHomePage()"
});
formatter.result({
  "duration": 37900,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInFeature()"
});
formatter.result({
  "duration": 218122400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdhanani44@hotmail.com",
      "offset": 41
    }
  ],
  "location": "SignInTest.userEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 599813900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nutickets123",
      "offset": 39
    }
  ],
  "location": "SignInTest.userEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 282642500,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 166672100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify user is able to check and download sales report",
  "description": "",
  "id": "check-and-download-sales-report-functionality;verify-user-is-able-to-check-and-download-sales-report",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User click on Reports feature",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User click on Company sales report feature",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Click on Download as feature to download XLSX Report",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User click on Download as feature to download CSV Report",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on Download as feature to download TSV Report",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User click on Download as feature to download ODS Report",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on Download as feature to download XLS Report",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User click on Download as feature to download HTML Report",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User should download Reports successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userClickOnReportsFeature()"
});
formatter.result({
  "duration": 1934872600,
  "status": "passed"
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userClickOnCompanySalesReportFeature()"
});
formatter.result({
  "duration": 1035878500,
  "status": "passed"
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userClickOnDownloadAsFeatureToDownloadXLSXReport()"
});
formatter.result({
  "duration": 1907570000,
  "status": "passed"
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userClickOnDownloadAsFeatureToDownloadCSVReport()"
});
formatter.result({
  "duration": 605138300,
  "status": "passed"
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userClickOnDownloadAsFeatureToDownloadTSVReport()"
});
formatter.result({
  "duration": 1030476200,
  "status": "passed"
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userClickOnDownloadAsFeatureToDownloadODSReport()"
});
formatter.result({
  "duration": 724131200,
  "status": "passed"
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userClickOnDownloadAsFeatureToDownloadXLSReport()"
});
formatter.result({
  "duration": 855337400,
  "status": "passed"
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userClickOnDownloadAsFeatureToDownloadHTMLReport()"
});
formatter.result({
  "duration": 774986200,
  "status": "passed"
});
formatter.match({
  "location": "CheckAndDownloadReportTest.userShouldDownloadReportsSuccessfully()"
});
formatter.result({
  "duration": 95925000,
  "status": "passed"
});
formatter.after({
  "duration": 6885161300,
  "status": "passed"
});
formatter.uri("src/test/java/com/nuwebgroup/admin/resources/featurefiles/createevents.feature");
formatter.feature({
  "line": 1,
  "name": "Create events functionality",
  "description": "As a user an Event Organiser\r\nI want to create one or several events\r\nSo I can least one ticket type with limited stock and unlimited stock",
  "id": "create-events-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Verify User is able to create one or several events with at least one tickets type with limited stock",
  "description": "",
  "id": "create-events-functionality;verify-user-is-able-to-create-one-or-several-events-with-at-least-one-tickets-type-with-limited-stock",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Smoke,"
    },
    {
      "line": 14,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User click on Add new event feature",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enter event name on event name field \"\u003cEvent name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enter event description on event description field \"\u003cEvent description\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on Venue",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select venue from select existing venue",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on Start date calendar enter Start date \"24/12/2021\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User click on Start time field and enter Start time \"01:00\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User click on End time field and enter End time \"06:00\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on Next button feature",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Enter Ticket name on Ticket name field \"PDD ticket\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Enter Ticket description on Ticket description field \"With Limited stock\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User click on next btn",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click on Pricing GBP feature",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enter any Base price in Base price field \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User click on Preview event",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User click on save and publish button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Event organiser should published event successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "create-events-functionality;verify-user-is-able-to-create-one-or-several-events-with-at-least-one-tickets-type-with-limited-stock;",
  "rows": [
    {
      "cells": [
        "Event name",
        "Event description"
      ],
      "line": 36,
      "id": "create-events-functionality;verify-user-is-able-to-create-one-or-several-events-with-at-least-one-tickets-type-with-limited-stock;;1"
    },
    {
      "cells": [
        "Dhanani Event",
        "Limited stock"
      ],
      "line": 37,
      "id": "create-events-functionality;verify-user-is-able-to-create-one-or-several-events-with-at-least-one-tickets-type-with-limited-stock;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8783997400,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "User is Signed In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Enter Email address on Email field \"pdhanani44@hotmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Enter Password on Password field \"Nutickets123\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Sign In button",
  "keyword": "And "
});
formatter.match({
  "location": "SignInTest.userIsOnNuWebGroupHomePage()"
});
formatter.result({
  "duration": 30600,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInFeature()"
});
formatter.result({
  "duration": 185291800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdhanani44@hotmail.com",
      "offset": 41
    }
  ],
  "location": "SignInTest.userEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 602055800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nutickets123",
      "offset": 39
    }
  ],
  "location": "SignInTest.userEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 345036500,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 171067700,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Verify User is able to create one or several events with at least one tickets type with limited stock",
  "description": "",
  "id": "create-events-functionality;verify-user-is-able-to-create-one-or-several-events-with-at-least-one-tickets-type-with-limited-stock;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@Sanity"
    },
    {
      "line": 14,
      "name": "@Smoke,"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User click on Add new event feature",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enter event name on event name field \"Dhanani Event\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enter event description on event description field \"Limited stock\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on Venue",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select venue from select existing venue",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on Start date calendar enter Start date \"24/12/2021\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User click on Start time field and enter Start time \"01:00\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User click on End time field and enter End time \"06:00\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on Next button feature",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Enter Ticket name on Ticket name field \"PDD ticket\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Enter Ticket description on Ticket description field \"With Limited stock\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User click on next btn",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click on Pricing GBP feature",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enter any Base price in Base price field \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User click on Preview event",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User click on save and publish button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Event organiser should published event successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateEventTest.userClickOnAddNewEventFeature()"
});
formatter.result({
  "duration": 1943847000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dhanani Event",
      "offset": 43
    }
  ],
  "location": "CreateEventTest.userEnterEventNameOnEventNameField(String)"
});
formatter.result({
  "duration": 1536725300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Limited stock",
      "offset": 57
    }
  ],
  "location": "CreateEventTest.userEnterEventDescriptionOnEventDescriptionField(String)"
});
formatter.result({
  "duration": 450985800,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.userClickOnNextButton()"
});
formatter.result({
  "duration": 240943600,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.userClickOnVenue()"
});
formatter.result({
  "duration": 1085765500,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.userSelectVenueFromSelectExistingVenue()"
});
formatter.result({
  "duration": 258690000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24/12/2021",
      "offset": 52
    }
  ],
  "location": "CreateEventTest.userClickOnStartDateCalendarEnterStartDate(String)"
});
formatter.result({
  "duration": 707433000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01:00",
      "offset": 53
    }
  ],
  "location": "CreateEventTest.userClickOnStartTimeFieldAndEnterStartTime(String)"
});
formatter.result({
  "duration": 551936500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "06:00",
      "offset": 49
    }
  ],
  "location": "CreateEventTest.userClickOnEndTimeFieldAndEnterEndTime(String)"
});
formatter.result({
  "duration": 337028200,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.userClickOnNextButtonFeature()"
});
formatter.result({
  "duration": 238829600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PDD ticket",
      "offset": 45
    }
  ],
  "location": "CreateEventTest.userEnterTicketNameOnTicketNameField(String)"
});
formatter.result({
  "duration": 1616979300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "With Limited stock",
      "offset": 59
    }
  ],
  "location": "CreateEventTest.userEnterTicketDescriptionOnTicketDescriptionField(String)"
});
formatter.result({
  "duration": 556679200,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.userClickOnNextBtn()"
});
formatter.result({
  "duration": 139673400,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.userClickOnPricingGBPFeature()"
});
formatter.result({
  "duration": 1271282200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 47
    }
  ],
  "location": "CreateEventTest.userEnterAnyBasePriceInBasePriceField(String)"
});
formatter.result({
  "duration": 715134700,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.userClickOnPreviewEvent()"
});
formatter.result({
  "duration": 256061500,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.userClickOnSaveAndPublishButton()"
});
formatter.result({
  "duration": 1801479100,
  "status": "passed"
});
formatter.match({
  "location": "CreateEventTest.eventOrganiserShouldPublishedEventSuccessfully()"
});
formatter.result({
  "duration": 1883004600,
  "status": "passed"
});
formatter.after({
  "duration": 3105658800,
  "status": "passed"
});
formatter.uri("src/test/java/com/nuwebgroup/admin/resources/featurefiles/createnewuserrole.feature");
formatter.feature({
  "line": 1,
  "name": "Create a new user role that can access all the Events functionality",
  "description": "As a user\r\nI want to Create a new user role in nutickets\r\nso I can access to all the Events, Venues and Orders.",
  "id": "create-a-new-user-role-that-can-access-all-the-events-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8558868500,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "User is Signed In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Enter Email address on Email field \"pdhanani44@hotmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Enter Password on Password field \"Nutickets123\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Sign In button",
  "keyword": "And "
});
formatter.match({
  "location": "SignInTest.userIsOnNuWebGroupHomePage()"
});
formatter.result({
  "duration": 65400,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInFeature()"
});
formatter.result({
  "duration": 260391900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdhanani44@hotmail.com",
      "offset": 41
    }
  ],
  "location": "SignInTest.userEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 761843100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nutickets123",
      "offset": 39
    }
  ],
  "location": "SignInTest.userEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 248825800,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 224518000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify User is able to Create a new user role that can access all the Events, Venues and Orders",
  "description": "",
  "id": "create-a-new-user-role-that-can-access-all-the-events-functionality;verify-user-is-able-to-create-a-new-user-role-that-can-access-all-the-events,-venues-and-orders",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User click on Manage users feature",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User click on Add user feature",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enter Name on Name field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enter Email on Email field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enter Password on Password field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on submit Feature",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User should created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUserRoleTest.userClickOnManageUsersFeature()"
});
formatter.result({
  "duration": 1882634800,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRoleTest.userClickOnAddUserFeature()"
});
formatter.result({
  "duration": 1269963200,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRoleTest.userEnterNameOnNameField()"
});
formatter.result({
  "duration": 908423600,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRoleTest.userEnterEmailOnEmailField()"
});
formatter.result({
  "duration": 453732900,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRoleTest.userEnterPasswordOnPasswordField()"
});
formatter.result({
  "duration": 303667200,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRoleTest.userClickOnSubmitFeature()"
});
formatter.result({
  "duration": 167213000,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRoleTest.userShouldCreatedSuccessfully()"
});
formatter.result({
  "duration": 1039171400,
  "status": "passed"
});
formatter.after({
  "duration": 1274683300,
  "status": "passed"
});
formatter.uri("src/test/java/com/nuwebgroup/admin/resources/featurefiles/eventattendanceandorders.feature");
formatter.feature({
  "line": 1,
  "name": "Event attendance and order section functionality",
  "description": "As a user\r\nI want to check the event attendance list and the orders section\r\nSo I can see event attendance list and order",
  "id": "event-attendance-and-order-section-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8913277900,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User is Signed In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Enter Email address on Email field \"pdhanani44@hotmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Enter Password on Password field \"Nutickets123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on Sign In button",
  "keyword": "And "
});
formatter.match({
  "location": "SignInTest.userIsOnNuWebGroupHomePage()"
});
formatter.result({
  "duration": 36200,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInFeature()"
});
formatter.result({
  "duration": 179788100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdhanani44@hotmail.com",
      "offset": 41
    }
  ],
  "location": "SignInTest.userEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 632057400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nutickets123",
      "offset": 39
    }
  ],
  "location": "SignInTest.userEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 272872100,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 184337800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Event organiser can see Event attendance list and the orders section",
  "description": "",
  "id": "event-attendance-and-order-section-functionality;verify-event-organiser-can-see-event-attendance-list-and-the-orders-section",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User click on orders feature",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User click on customer orders from given list of orders",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should see their order successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "EventAttendanceAndReportTest.userClickOnOrdersFeature()"
});
formatter.result({
  "duration": 1972754900,
  "status": "passed"
});
formatter.match({
  "location": "EventAttendanceAndReportTest.userClickOnCustomerOrdersFromGivenListOfOrders()"
});
formatter.result({
  "duration": 1466080700,
  "status": "passed"
});
formatter.match({
  "location": "EventAttendanceAndReportTest.userShouldSeeTheirOrderSuccessfully()"
});
formatter.result({
  "duration": 1466518600,
  "status": "passed"
});
formatter.after({
  "duration": 4120432800,
  "status": "passed"
});
formatter.uri("src/test/java/com/nuwebgroup/admin/resources/featurefiles/signin.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In functionality",
  "description": "As a user\r\nI want to Sign In on nutickets\r\nso I can visit My Home Page of nutickets",
  "id": "sign-in-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verify user is able to Sign In with correct credentials",
  "description": "",
  "id": "sign-in-functionality;verify-user-is-able-to-sign-in-with-correct-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke,"
    },
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Enter Email address on Email field \"\u003cEmail address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Enter Password on Password field \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on Sign In button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should Sign In successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "sign-in-functionality;verify-user-is-able-to-sign-in-with-correct-credentials;",
  "rows": [
    {
      "cells": [
        "Email address",
        "Password"
      ],
      "line": 16,
      "id": "sign-in-functionality;verify-user-is-able-to-sign-in-with-correct-credentials;;1"
    },
    {
      "cells": [
        "pdhanani44@hotmail.com",
        "Nutickets123"
      ],
      "line": 17,
      "id": "sign-in-functionality;verify-user-is-able-to-sign-in-with-correct-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9113134100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify user is able to Sign In with correct credentials",
  "description": "",
  "id": "sign-in-functionality;verify-user-is-able-to-sign-in-with-correct-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Regression"
    },
    {
      "line": 6,
      "name": "@Smoke,"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Enter Email address on Email field \"pdhanani44@hotmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Enter Password on Password field \"Nutickets123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on Sign In button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should Sign In successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.userIsOnNuWebGroupHomePage()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInFeature()"
});
formatter.result({
  "duration": 232653800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdhanani44@hotmail.com",
      "offset": 41
    }
  ],
  "location": "SignInTest.userEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 1160070800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nutickets123",
      "offset": 39
    }
  ],
  "location": "SignInTest.userEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 298138300,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 179121400,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userShouldSignInSuccessfully()"
});
formatter.result({
  "duration": 1697548700,
  "status": "passed"
});
formatter.after({
  "duration": 2248384200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Verify user is not able to Sign In with incorrect credentials",
  "description": "",
  "id": "sign-in-functionality;verify-user-is-not-able-to-sign-in-with-incorrect-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@Smoke,"
    },
    {
      "line": 19,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Enter Email address on Email field \"\u003cEmail address\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Enter Password on Password field \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on Sign In button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User should not Sign In to system and shows Error message \"\u003cError message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "sign-in-functionality;verify-user-is-not-able-to-sign-in-with-incorrect-credentials;",
  "rows": [
    {
      "cells": [
        "Email address",
        "Password",
        "Error message"
      ],
      "line": 29,
      "id": "sign-in-functionality;verify-user-is-not-able-to-sign-in-with-incorrect-credentials;;1"
    },
    {
      "cells": [
        "pdhana44@hotmail.com",
        "Nutickets123",
        "These credentials do not match our records."
      ],
      "line": 30,
      "id": "sign-in-functionality;verify-user-is-not-able-to-sign-in-with-incorrect-credentials;;2"
    },
    {
      "cells": [
        "pdhanani44@hotmail.com",
        "nutickets1234",
        "These credentials do not match our records."
      ],
      "line": 31,
      "id": "sign-in-functionality;verify-user-is-not-able-to-sign-in-with-incorrect-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8923882800,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Verify user is not able to Sign In with incorrect credentials",
  "description": "",
  "id": "sign-in-functionality;verify-user-is-not-able-to-sign-in-with-incorrect-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@Regression"
    },
    {
      "line": 19,
      "name": "@Smoke,"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Enter Email address on Email field \"pdhana44@hotmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Enter Password on Password field \"Nutickets123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on Sign In button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User should not Sign In to system and shows Error message \"These credentials do not match our records.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.userIsOnNuWebGroupHomePage()"
});
formatter.result({
  "duration": 32100,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInFeature()"
});
formatter.result({
  "duration": 191682200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdhana44@hotmail.com",
      "offset": 41
    }
  ],
  "location": "SignInTest.userEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 651046900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nutickets123",
      "offset": 39
    }
  ],
  "location": "SignInTest.userEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 268837900,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 165603800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "These credentials do not match our records.",
      "offset": 59
    }
  ],
  "location": "SignInTest.userShouldNotSignInToSystemAndShowsErrorMessage(String)"
});
formatter.result({
  "duration": 343598000,
  "status": "passed"
});
formatter.after({
  "duration": 1236731500,
  "status": "passed"
});
formatter.before({
  "duration": 10396400000,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Verify user is not able to Sign In with incorrect credentials",
  "description": "",
  "id": "sign-in-functionality;verify-user-is-not-able-to-sign-in-with-incorrect-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@Regression"
    },
    {
      "line": 19,
      "name": "@Smoke,"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on nu web group home page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User click on sign in feature",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Enter Email address on Email field \"pdhanani44@hotmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Enter Password on Password field \"nutickets1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User click on Sign In button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User should not Sign In to system and shows Error message \"These credentials do not match our records.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.userIsOnNuWebGroupHomePage()"
});
formatter.result({
  "duration": 36600,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInFeature()"
});
formatter.result({
  "duration": 229743100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pdhanani44@hotmail.com",
      "offset": 41
    }
  ],
  "location": "SignInTest.userEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 645158000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nutickets1234",
      "offset": 39
    }
  ],
  "location": "SignInTest.userEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 321184500,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.userClickOnSignInButton()"
});
formatter.result({
  "duration": 174196500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "These credentials do not match our records.",
      "offset": 59
    }
  ],
  "location": "SignInTest.userShouldNotSignInToSystemAndShowsErrorMessage(String)"
});
formatter.result({
  "duration": 413281000,
  "status": "passed"
});
formatter.after({
  "duration": 5271876600,
  "status": "passed"
});
});