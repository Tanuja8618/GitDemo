package com.auto.util;

public class UtilMethods {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T jsonToObject(String json, TypeReference<T> typeRef) {
        if (Objects.isNull(json)) {
            return null;
        }
        try {
            return objectMapper.readValue(json, typeRef);
        } catch (Exception e) {
            System.out.println("Failed to convert json to object." + e);
        }
        return null;
    }

    public static <T> T jsonToObject(String json, Class<T> clazz) {
        if (Objects.isNull(json)) {
            return null;
        }
        try {
            return objectMapper.readValue(json, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void emptyParameters(Map parameter) {
        if (!parameter.isEmpty())
            parameter.clear();
    }

    @Test
    public void case1() {
        System.out.println(formatAmountValues("5000.0"));
    }

    private String formatAmountValues(String strAmount) {
        System.out.println(strAmount);
        if (strAmount.substring(strAmount.indexOf(".")).equalsIgnoreCase(".0")) {
            System.out.println(strAmount);
            double amount1 = Double.parseDouble(strAmount);
            DecimalFormat formatter = new DecimalFormat("#,###");
            return formatter.format(amount1);
        } else {
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            return nf.format(new BigDecimal(strAmount));
        }
    }
}
