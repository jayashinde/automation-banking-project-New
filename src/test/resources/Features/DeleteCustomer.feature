@DC
Feature: Delete Customer Validations

  @DC01
  Scenario: delete  customer

    Given open url in the browser
    When enter "mngr446207" And "UpujUbe" And click on login
    And click on delete customer And enter customer id
    And  click on submit button
    Then customer delete successful