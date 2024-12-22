@TSI
Feature: Validate all Trouble signing in flows

  Scenario Outline: User validates Forgot User ID flow
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user click on Trouble sign in link
    Then user navigates to Trouble Signing In page
    Then user enters email and click on continue
    Then user selects eMail from dropdown in verification page
    Then user clicks on send code to email
    Then user captures OTP from eMail
    Then user enters OTP and clicks next button
    Then user captures User ID from eMail
    Then user validates User_ID
    Then user validates page and message displayed

    Examples:
      | User_ID   |
      | Auto_User |


  Scenario Outline: User validates Forgot my password journey
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user click on Trouble sign in link
    Then user navigates to Trouble Signing In page
    Then user clicks on I forgot my password
    Then user enters UserID and click on continue
    Then user selects eMail from dropdown in verification page
    Then user clicks on send code to email
    Then user captures OTP from eMail
    Then user enters OTP and clicks next button
    Then user validates temporary password alert message
    Then user needs to wait for 10 seconds
    Then user captures temporary password from eMail

    Examples:
      | User_ID   |
      | Auto_User |


  Scenario Outline: User login with temporary password and changes new password
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enters userID
    Then user enters temporary password
    Then user clicks on login Button
    Then user selects eMail from dropdown in verification page
    Then user clicks on send code to email Button
    Then user captures OTP from eMail
    Then user enters OTP and clicks next button
    Then user enters old password as temporary password
    Then user enters new password
    Then user enters confirm password
    Then user click on next Button in Change password screen


    Examples:
      | User_ID   |
      | Auto_User |
@LockAccount
  Scenario Outline:  User enters wrong password and locks the account
#    FIRST WRONG ATTEMPT
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enters userID
    Then user enters wrong password
    Then user clicks on login Button
    Then user needs to wait for 12 seconds
    Then user validates invalid password error message from User ID page
##    SECOND WRONG ATTEMPT
    Then user enters userID
    Then user enters wrong password
    Then user clicks on login Button
    Then user needs to wait for 12 seconds
    Then user validates invalid password error message from User ID page
##    THIRD WRONG ATTEMPT
    Then user enters userID
    Then user enters wrong password
    Then user clicks on login Button
    Then user needs to wait for 12 seconds
    Then user validates wrong password account locked message

    Examples:
      | User_ID   |
      | Auto_User |


  Scenario Outline:  User Validates of My Account locked journey
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user click on Trouble sign in link
    Then user navigates to Trouble Signing In page
    Then user clicks on my account is locked.
    Then user enters UserID and click on continue
    Then user selects eMail from dropdown in verification page
    Then user clicks on send code to email
    Then user captures OTP from eMail
    Then user enters OTP and clicks next button
    Then user needs to wait for 30 seconds
    Then user captures Accountlock URL from mail
    Then user navigates to unlock account URL
    Then user validates Account Reset message in homepage

    Examples:
      | User_ID   |
      | Auto_User |


