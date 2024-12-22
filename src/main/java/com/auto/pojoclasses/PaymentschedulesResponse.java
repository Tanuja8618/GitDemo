package com.auto.pojoclasses;

public class PaymentschedulesResponse {

    @JsonProperty("noOfPayments")
    private String noOfPayments;
    @JsonProperty("paymentAmount")
    private String paymentAmount;
    @JsonProperty("startDate")
    private String startDate;

    public String getNoOfPayments() {
        return noOfPayments;
    }

    public void setNoOfPayments(String noOfPayments) {
        this.noOfPayments = noOfPayments;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
