@PaymentCalculator
Feature: Lookup functionalities validations

  @Lookup
  Scenario Outline: Validate Vehicle values using Look up functionality
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enter username, password and click on login
    Then user select, read and enter eMail OTP
    Then user navigates to Dashboard
    Then user click on Lookup
    Then user click on lets Lookup
    Then user enter lookup data for <key> and validate vehicle details
    Then user validate vehicle general info details
    Then user validate vehicle values details
    Then user click on Logout

    Examples:
      | User_ID   | key     |
      | Auto_User | Lookup1 |
#      | Auto_User | Lookup2 |
#      | Auto_User | Lookup3 |
#      | Auto_User | Lookup4 |