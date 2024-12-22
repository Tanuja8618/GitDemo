@PaymentCalculator
Feature: Payment calculator validations

  @PaymentCalculator
  Scenario Outline: Validate mandatory field error messages in Payment calculator
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enter username, password and click on login
    Then user select, read and enter eMail OTP
    Then User logs into Dashboard and click on Logout
    Then user click on payment calculator
    Then user click on compute button
    Then user validates error messages in payment calculator page
    Then user click on Logout

    Examples:
      | User_ID   |
      | Auto_User |

  @PaymentValidation
  Scenario Outline: Validate Estimated Monthly Payment and Payment Schedule in Payment calculator
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user captures username API response
    Then user enter username, password and click on login
    Then user select, read and enter eMail OTP
    Then User logs into Dashboard and click on Logout
    Then user captures calculator API response
    Then user click on payment calculator
    Then user enter payment primary data for <Payment_Key> and validate Estimated monthly payment, Payment Schedule
    Then user click on Logout

    Examples:
      | User_ID   | Payment_Key      |
      | Auto_User | OrientalPayment  |
      | Auto_User | Conventional     |
      | Auto_User | OrientalPayment1 |
      | Auto_User | Conventional1    |