Feature: TC to search the hotels present in a given city

Scenario: User search for the hotels

Given Login url
Then click on Hotels link
Then Veify that Hotels page is displayed
Then Enter City, Hotel or Area as "Hyderbad"
Then Enter Checkin as "31 Jan, 2019" and Chekout as "3 Feb, 2019"
Then Enter no.of Rooms as "<Room>" and no.of Guests as "<Guests>"
Then Click on Search button
Then verify that list of Hotels are displayed