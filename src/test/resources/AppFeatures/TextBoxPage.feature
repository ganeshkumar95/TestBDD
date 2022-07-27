Feature: TextBox Element Feature

Scenario: TextBox Element
Given user is on Demo QA Elements page
When user gets the title of the page
Then page title should be "ToolsQA"

Scenario: Click on TextBox Element
Given user is on Demo QA Elements page
Then click on TextBox element

Scenario: Validate Textbox Fields
Given user is on Demo QA Elements page
When click on TextBox element
Then user enters data into columns
| Fullname | Email | CurrentAddress | PermanentAddress |
| Tester1 | test1@gmail.com | Test1 | Test2 |
| Tester2 | test2@gmail.com	| Test3 | Test4 |
#Then user enters full name "tester1"
#And user enters email "email1@gmail.com"
#And user enters current address "Current Address"
#And user enters permanent address "Permanent Address"
#And clicks on submit button