@Regression
Feature: Home Page Validations

  Background:
    Given Auto Home Page is Launched in browser
    Then user selects language


  Scenario Outline: User validates "Log in with different User ID" link
    Given user reads credentials data with <User_ID> from excel
    Then user click on Trouble sign in link
    Then user navigates to Trouble Signing In page
    Then user click on Login in with a different user link
    Then user navigates to user id page
    Then user needs to wait for 5 seconds
    Then user click on Trouble sign in link
    Then user navigates to Trouble Signing In page
    Then user clicks on my account is locked.
    Then user enters UserID and click on continue
    Then user navigates to Additional Verification Required page
    Then user click on Login in with a different user link in TSI page
    Then user navigates to user id page
    Then user needs to wait for 5 seconds
    Then user click on Trouble sign in link
    Then user navigates to Trouble Signing In page
    Then user clicks on my account is locked.
    Then user enters UserID and click on continue
    Then user navigates to Additional Verification Required page
    Then user selects eMail from dropdown in verification page
    Then user clicks on send code to email
    Then user needs to wait for 5 seconds
    Then user click on Login in with a different user link in OTP page
    Then user navigates to user id page
    Examples:
      | User_ID   |
      | Auto_User |

  @UIDPWDValidations
  Scenario Outline: Validates user ID page  error messages
    Given user launches Auto home page in browser
    Then user selects language
    Given user reads credentials data with <User_ID> from excel
    Then user validates Auto Home Page
    Then user clicks on login Button
    Then user validates user id error message
    Then user enters userID
    Then user clicks on login Button
    Then user validates password error message

    Examples:
      | User_ID   |
      | Auto_User |

