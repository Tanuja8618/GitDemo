package com.auto.util;

public class BaseClass {

    public static String BaseURI = "https://digital-auto-idm-ui-qa.orientalbank.com/";

//    static {
//        if (AccessToken == null) {
//            String newtoken = SerenityRest.given().auth().preemptive().basic(clientID, clientsecret)
//                    .formParam("grant_type", "client_credentials")
//                    .post(tokenURL).then().extract().response().getBody().jsonPath().get("access_token");
//            System.out.println("TOKEN......" + newtoken);
//            AccessToken = newtoken;
//        }
//    }
//    static {
//        if (OTPAccessToken == null) {
//            String newtoken = SerenityRest.given().auth().preemptive().basic(OTPEngineClientID, OTPEngineClientsecret)
//                    .formParam("grant_type", "client_credentials")
//                    .post(OTPEngineTokenURI).then().extract().response().getBody().jsonPath().get("access_token");
//            System.out.println("OTPTOKEN......" + newtoken);
//            OTPAccessToken = newtoken;
//        }
//    }
}
