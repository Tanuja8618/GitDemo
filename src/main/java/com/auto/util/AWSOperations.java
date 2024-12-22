package com.auto.util;

public class AWSOperations {

    private static final Logger LOGGER = LoggerFactory.getLogger(AWSOperations.class);


    public void deleteRecordsFromPolicyAgreement(String user_ID) {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
        DeleteItemRequest deleteItemRequest = new DeleteItemRequest();
        deleteItemRequest.setTableName("PolicyAgreement");
        deleteItemRequest.setReturnConsumedCapacity(ReturnConsumedCapacity.TOTAL);
        deleteItemRequest.setReturnValues(ReturnValue.ALL_OLD);
        Map<String, AttributeValue> keysMap = new HashMap<>();
        List<String> policyList = new ArrayList<>();
        policyList.add("TestPolicy2");
        policyList.add("TestPolicy1");

        for (String PolicyName : policyList) {
            keysMap.put("Username", new AttributeValue(user_ID));
            keysMap.put("PolicyName", new AttributeValue(PolicyName));
            deleteItemRequest.setKey(keysMap);
            try {
                DeleteItemResult result = client.deleteItem(deleteItemRequest);
                if (result.getAttributes() != null) {
                    LOGGER.info(user_ID + " & " + PolicyName + " deleted from Policy Agreement table in Dynamo DB");
                } else {
                    LOGGER.warn(user_ID + " & " + PolicyName + " is not found in Policy Agreement table in Dynamo DB");
                }
            } catch (AmazonServiceException e) {
                LOGGER.warn(e.getErrorMessage());
            }
        }
    }




    @Test
    public void case1() throws Exception {
        AWSOperations operations = new AWSOperations();
        operations.deleteRecordsFromPolicyAgreement("autouser13");

    }


}
