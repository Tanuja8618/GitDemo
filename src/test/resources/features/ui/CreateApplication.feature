Feature: Create application validations

  Background:
    Given user launches Auto home page in browser

  @CreateApplication
  Scenario Outline: Create Application E2E flow and validate Application status
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enter username, password and click on login
    Then user select, read and enter eMail OTP
    Then user navigates to Dashboard
    Then user validate dashboard page
 #   Then user captures json response for API "getSpecificDetails"
#    Then user edit application id <Application_ID>, <Action> from draft applications
#    Then user validates draft application status " basic information request" in draft popup
    Then user click on create new application
  #  Then user validates mandatory fields in create application page
  #  Then user captures Application ID from create API response
    Then user enters create application details with application <Key>
    Then user selects application type
    Then user needs to wait for 10 seconds
  #  Then user validates mandatory fields in primary applicant page
    Then user enters primary applicant details with application <Key>
   Then user validates co-applicant and co-signer page
    Then user enter co-applicant and co-signer details with application <Key>
    Then user selects preference for application <Key>
    Then user needs to wait for 20 seconds
    Then user validates Information on Request page for applicant type as "Applicant" and application <Key>
    Then user enters "Applicant" applicant type data in Information on Request for <Key>
    Then user needs to wait for 20 seconds
    Then user validates Information on Request page for applicant type as "Co-applicant" and application <Key>
    Then user enters "Co-applicant" co-applicant data in Information on Request for <Key>
    Then user validates Information on Request page for applicant type as "Co-signer 1" and application <Key>
    Then user enters "Co-signer 1" co-applicant data in Information on Request for <Key>
    Then user validates Information on Request page for applicant type as "Co-signer 2" and application <Key>
    Then user enters "Co-signer 2" co-applicant data in Information on Request for <Key>
    Then user validates Employment Information for applicant type as "Applicant"
    Then user enters "Applicant" applicant type data in Employment Information page on Request for <Key>
    Then user validates Employment Information for applicant type as "Co-applicant"
    Then user enters "Co-applicant" applicant type data in Employment Information page on Request for <Key>
    Then user validates Employment Information for applicant type as "Co-signer 1"
    Then user enters "Co-signer 1" applicant type data in Employment Information page on Request for <Key>
    Then user validates Employment Information for applicant type as "Co-signer 2"
    Then user enters "Co-signer 2" applicant type data in Employment Information page on Request for <Key>
    Then user click on Value lookup
    Then user click on Value Guide lookup
    Then user enter lookup data for <Key> and validate vehicle details
    Then user click on save value
    Then user validates collateral information page
    Then user click on continue button
    Then user validates Financing terms page
    Then user captures calculator API response
    Then user click on Payment calculator button
    Then user enter payment primary data for <Key> and validate Estimated monthly payment, Payment Schedule
    Then user click on save value and continue
    Then user validates Financing page fields post payment calculation
    Then user click on continue button
    Then user validate fields in review and submit page for applicant type as "Applicant", "", "", ""
    Then user selects consent in review and submit page
    Then user captures json response for API "getSpecificDetails"
    Then user validate Application under review page
    Then user click on View Application button
    Then User validates application id "New" with status <Decision_Status> from My Loan Applications
    Then user click on Logout
    Examples:
      | User_ID   | Key          | Application_ID | Action       | Decision_Status |
      | Auto_User | Application1 | 1234-1528      | WhereYouLeft | Pending         |


  @InvitationFlow
  Scenario Outline: Create Application with Primary applicant using invitation flow
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enter username, password and click on login
    Then user select, read and enter eMail OTP
    Then user navigates to Dashboard
    Then user captures json response for API "getSpecificDetails"
#    Then user click on create new application
#    Then user validates mandatory fields in create application page
#    Then user captures Application ID from create API response
#    Then user enters create application data for <Key>
#    Then user selects application type
#    Then user needs to wait for 10 seconds
#    Then user validates mandatory fields in primary applicant page
#    Then user enters primary applicant details with application <Key>
#    Then user selects preference for application <Key>
#    Then user validate invitation sent success message and captured application reference ID
#    Then user captures invitation url from mail
#    Then user navigates to invitation URL
#    Then user needs to wait for 5 seconds
#    Then user validates invitation flow Information on Request page for applicant type as "Applicant" and application <Key>
#    Then user enters invitation flow "Applicant" data in basic information page for <Key>
#    Then user validates invitation employment information page
#    Then user enters "Applicant" applicant type data in invitation flow Employment Information page for <Key>
#    Then user validates invitation flow your concert page
#    Then user submit invitation flow your concert
#    Then user captures invitation url from mail
#    Then user navigates to invitation URL
#    Then user validates invitation submitted page
#    Then user needs to wait for 20 seconds
    Then user edit application id <Application_ID>, <Action> from draft applications for invitation flow
#    Then user edit application id <Application_ID>, <Action> from draft applications
#    Then user validates draft application status "collateral information" in draft popup
    Then user needs to wait for 10 seconds
    Then user click on continue button
    Then user needs to wait for 10 seconds
    Then user click on continue button
    Then user needs to wait for 10 seconds
    Then user click on Value lookup
    Then user click on Value Guide lookup
    Then user enter lookup data for <Key> and validate vehicle details
    Then user click on save value
    Then user validates collateral information page
    Then user click on continue button
    Then user validates Financing terms page
    Then user captures calculator API response
    Then user click on Payment calculator button
    Then user enter payment primary data for <Key> and validate Estimated monthly payment, Payment Schedule
    Then user click on save value and continue
    Then user validates Financing page fields post payment calculation
    Then user click on continue button
    Then user validate fields in review and submit page for applicant type as "Applicant", "", "", ""
    Then user selects consent in review and submit page
    Then user captures json response for API "getSpecificDetails"
    Then user validate Application under review page
    Then user click on View Application button
    Then User validates application id "new" with status "Pending" from My Loan Applications
    Then user click on Logout
    Examples:
      | User_ID   | Key         | Application_ID | Action       |
      | Auto_User | Invitation1 |                | WhereYouLeft |

  @DeleteDraftApplication
  Scenario Outline: Delete draft application
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enter username, password and click on login
    Then user select, read and enter eMail OTP
    Then user navigates to Dashboard
    Then user click on create new application
    Then user validates mandatory fields in create application page
    Then user captures Application ID from create API response
    Then user deletes application id <Application_ID> from draft applications
    Then user click on Logout
    Examples:
      | User_ID   | Application_ID |
      | Auto_User |                |

  @EditDraftApplication
  Scenario Outline: Edit draft application
    Given user launches Auto home page in browser
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enter username, password and click on login
    Then user select, read and enter eMail OTP
    Then user navigates to Dashboard
    Then user edit application id <Application_ID>, <Action> from draft applications
    Then user click on save as draft application with the option "Exit"
    Then user click on Logout
    Examples:
      | User_ID   | Application_ID | Action       |
      | Auto_User | 0001-422       | WhereYouLeft |

  @SaveDraft
  Scenario Outline: Validating save and edit the application from draft applications
    Then user selects language
    Then user reads credentials data with <User_ID> from excel
    Then user enter username, password and click on login
    Then user select, read and enter eMail OTP
    Then user navigates to Dashboard
    Then user captures json response for API "getSpecificDetails"
    Then user click on create new application
    Then user validates mandatory fields in create application page
    Then user captures Application ID from create API response
    Then user enters create application details with application <Key>
    Then user needs to wait for 10 seconds
    Then user click on cancel button from create application popup
    Then user click on edit button on application id <Application_ID> from draft applications
    Then user validates draft application status "basic information request" in draft popup
    Then user select edit option <Action> from draft applications
    Then user selects application type
    Then user click on close button from create application popup
    Then user click on edit button on application id <Application_ID> from draft applications
    Then user validates draft application status "basic information request" in draft popup
    Then user select edit option <Action> from draft applications
    Then user needs to wait for 10 seconds
    Then user validates mandatory fields in primary applicant page
    Then user enters primary applicant details with application <Key>
    Then user needs to wait for 10 seconds
    Then user selects preference for application <Key>
    Then user needs to wait for 20 seconds
#    Then user click on save as draft application with the option "Exit"
    Then user click on edit button on application id <Application_ID> from draft applications
#    Then user validates draft application status "information on request" in draft popup
    Then user validates draft application status "basic information request" in draft popup


    Then user select edit option <Action> from draft applications

    Examples:
      | User_ID   | Key        | Application_ID | Action       |
      | Auto_User | SaveDraft1 |       | WhereYouLeft |