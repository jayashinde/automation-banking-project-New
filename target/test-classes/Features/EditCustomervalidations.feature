@EC
Feature: Edit Customer Validations
  Background:
    Given open url in the browser
    When enter "mngr446207" And "UpujUbe" And click on login
  @SC01
  Scenario: edit new customer
     When click on edit customer And enter customer id
     And  click on submit button
     Then customer edit successful
