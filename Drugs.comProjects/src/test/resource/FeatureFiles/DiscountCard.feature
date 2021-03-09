@regression
Feature: Drugs.com Discount Card funtionality

Scenario: Drugs.com Discount Card Validation

Given Open Drugs.com Website
When clicks on Discount Card
And user should land on discount Card page
And user should able to see the print my discount coupon
And user need to fill the coupon and continue
Then user should be able to see all the  discount