@regression
Feature: Drugs.com Compare Drugs funtionality

Scenario: Drugs.com compare Drugs Validation
Given Open Drugs.com Website
When clicks on Compare Drugs
And user should land on compare Drugs page
And clicks on Claritin vs Zyrtec
Then user should be able to see the compare between Claritin vs Zyrtec
