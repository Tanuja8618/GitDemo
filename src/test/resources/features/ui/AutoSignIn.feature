Feature:SignIn to Auto Dealer Portal

  Scenario Outline: Delete existing user details from PolicyAgreement
    Given user reads credentials data with <User_ID> from excel
    Then user deletes <User_ID> from PolicyAgreement table from DynamoDB


    Examples:
      | User_ID   |
      | Auto_User |

  @Signin
  Scenario Outline: Validate Signin to Digital Auto Dealer Portal
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enters userID
    Then user enters password
    Then user clicks on login Button
    Then user selects eMail from dropdown in verification page
    Then user clicks on send code to email Button
    Then user captures OTP from eMail1
    Then user enters OTP and clicks next button
#    Then user clicks on check box and agrees policy
    Then User logs into Dashboard and click on Logout
#    Then user validates Auto Idm Login Page for verification
    Then user click on payment calculator
    Then user click on compute button
    Then user validates error messages in payment calculator page
    Examples:
      | User_ID   |
      | Auto_User |


