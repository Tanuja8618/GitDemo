package com.auto.util;

public class SpecBuilder {

    private static RequestSpecBuilder requestSpecBuilder;
    private static RequestSpecification requestSpecification;

//    public static RequestSpecification getRequestSpecNoHeaders(String baseUri) {
//        return new RequestSpecBuilder().
//                setBaseUri(baseUri).
//                setContentType(ContentType.JSON).
//                log(LogDetail.ALL).build();
//    }

    public static RequestSpecification getRequestSpecWithHeaders(String baseUri, Map<String, String> header) {
        return new RequestSpecBuilder().
                setBaseUri(baseUri).addHeaders(header).
                setContentType(ContentType.JSON).
                log(LogDetail.ALL).build();
    }

    public static ResponseSpecification getResponseSpec() {
        return new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).
                log(LogDetail.ALL).build();
    }

    public static RequestSpecification getRequest(String baseUri, Map<String, String> header) {
        return new RequestSpecBuilder().setUrlEncodingEnabled(false).
                setBaseUri(baseUri).addHeaders(header).
                setContentType(ContentType.JSON).
                log(LogDetail.ALL).build();
    }


}
