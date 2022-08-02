Feature: Check Web Table Element
  Scenario: Click on WebTable Element
    Given user is on Demo QA Elements page
    Then click on WebTable element

  Scenario: Register new user
    Given user is on Demo QA Elements page
    When click on WebTable element
    Then click on Add user
    And user enter data into columns
    | FirstName | LastName | Email | Age | Salary | Department |
    | Tester1 | Tester2 | test@gmail.com | 22 | 25000 | Technical |

  Scenario: Search a user
    Given user is on Demo QA Elements page
    When click on WebTable element
    Then user enters a valid input "Cierra" in the searchbox

  Scenario Outline: Edit a user
    Given user is on Demo QA Elements page
    When click on WebTable element
    Then user clicks on edit button
    And user updates firstname as <fname>
    Examples:
      | fname    |
      | "Sierra" |

  Scenario: Delete a user
    Given user is on Demo QA Elements page
    When click on WebTable element
    Then user clicks on delete button