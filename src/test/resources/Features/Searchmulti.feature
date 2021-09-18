Feature: Search functionality


@Coffee2
Scenario: VERIFY USER CAN NOT LOGIN WITH INVALID CARD- NAGATIVE

Given OPEN FB URL
Then ENTER INVlid USER AND PASSWORD
Then CLICK ON LOGIN
Then VERIFY USER SHOULD NOT LOGIN


@Coffee2
Scenario: Verify FB Logo & text under logo

Given OPEN FB URL 
Then Verify FB logo
Then text under logo

