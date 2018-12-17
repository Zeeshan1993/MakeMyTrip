Feature: TC is to find the homestays in a perticular area

Scenario: Find the homestays in a perticular area

Given Login url
Then Click on the HomeStyas button
Then Enter Destination place as "Goa"
Then Enter Checkin date as "28 Jan, 2019" and Chekout date as "31 Jan, 2019"
Then Enter the no of Guest as "3"
Then Click on the Search button
Then close the pop up
Then verify that list of hotels are displayed

