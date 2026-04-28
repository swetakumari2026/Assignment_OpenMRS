Feature: Login functionality

  Background:
    Given user is on MRS login page
    When user enter username on MRS login page "admin"
    And wait 3 seconds
    And user enter password on MRS login page "Admin123"
    And wait 3 seconds
    And user click on inpatientWard button
    And wait 2 seconds
    And user click on login button

 # Scenario: TC1- verify login with valid credentials
#    Given user is on MRS login page
#    When user enter username on MRS login page "admin"
#    And wait 3 seconds
#    And user enter password on MRS login page "Admin123"
#    And wait 3 seconds
#    And user click on inpatientWard button
#    And wait 2 seconds
#    And user click on login button
  #  Then home page is visible with text "Inpatient Ward"

    Scenario: TC2- verify user can register
      And wait 2 seconds
      And user click on register button
      And wait 2 seconds
      And registration page is visible with text "Register a patient"
      And wait 2 seconds
      And user enter firstname on given field as "Sammy"
      And wait 2 seconds
      And user enter middlename on middle field as "Dick"
      And wait 2 seconds
      And user enter lastname on family name field as "Jason"
      And wait 2 seconds
      And user click on arrow next button
      And wait 2 seconds
      And user click on gender button
      And wait 2 seconds
      And User select on female
      And wait 2 seconds
      And user click on arrow next button
      And wait 2 seconds
      And user enter date in day field as "21"
      And wait 2 seconds
      And user click on select tab
      And wait 2 seconds
      And user click on select button
      And wait 2 seconds
      And user select month as "March"
      And wait 2 seconds

