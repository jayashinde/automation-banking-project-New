@Manager
Feature: login feature
Background:
   Given open url in the browser

  @SC01
  Scenario: Manager should be login with valid details

    When enter "mngr446207" And "UpujUbe" And click on login
    Then login should be successful

    @SC02
    Scenario:  Manager should be login with Invalid details
      When enter userid And do not enter password And click on login
      Then error message should be displayed

  @SC03
  Scenario: Manager should be login with Invalid details
    When  do not userid And enter password And click on login
    Then error message should be display

  @SC04
  Scenario: Manager should be login with Invalid details
    When  do not userid And do not enter password And click on login
    Then error message should be show


#  @VV
#  Scenario Outline: Validate unsername field
#    Given open url in the browser
#    When I enter '<InvalidValue>' in username field
#    Then I should get '<ErrorMessage>'
#
#    Examples:
#      |InvalidValue|ErrorMessage|
#      |     test       |      abc      |




