package com.auto.pojoclasses;

public class PaymentResponse {
    @JsonProperty("netTradeIn")
    private String netTradeIn;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("registrationFees")
    private String registrationFees;
    @JsonProperty("amountFinanced")
    private String amountFinanced;
    @JsonProperty("vehicleInsuranceAmount")
    private String vehicleInsuranceAmount;
    @JsonProperty("creditLifeInsuranceAmount")
    private String creditLifeInsuranceAmount;
    @JsonProperty("financedFees")
    private String financedFees;
    @JsonProperty("financeCharge")
    private String financeCharge;
    @JsonProperty("nonFinancedFees")
    private String nonFinancedFees;
    @JsonProperty("deferredBalance")
    private String deferredBalance;
    @JsonProperty("paymentSchedules")
    private List<PaymentSchedulesResponse> paymentSchedules;

    public String getNetTradeIn() {
        return netTradeIn;
    }

    public void setNetTradeIn(String netTradeIn) {
        this.netTradeIn = netTradeIn;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getRegistrationFees() {
        return registrationFees;
    }

    public void setRegistrationFees(String registrationFees) {
        this.registrationFees = registrationFees;
    }

    public String getAmountFinanced() {
        return amountFinanced;
    }

    public void setAmountFinanced(String amountFinanced) {
        this.amountFinanced = amountFinanced;
    }

    public String getFinancedFees() {
        return financedFees;
    }

    public void setFinancedFees(String financedFees) {
        this.financedFees = financedFees;
    }

    public String getFinanceCharge() {
        return financeCharge;
    }

    public void setFinanceCharge(String financeCharge) {
        this.financeCharge = financeCharge;
    }

    public String getNonFinancedFees() {
        return nonFinancedFees;
    }

    public void setNonFinancedFees(String nonFinancedFees) {
        this.nonFinancedFees = nonFinancedFees;
    }

    public String getDeferredBalance() {
        return deferredBalance;
    }

    public void setDeferredBalance(String deferredBalance) {
        this.deferredBalance = deferredBalance;
    }

    public List<PaymentSchedulesResponse> getPaymentSchedules() {
        return paymentSchedules;
    }

    public void setPaymentSchedules(List<PaymentSchedulesResponse> paymentSchedules) {
        this.paymentSchedules = paymentSchedules;
    }

    public String getVehicleInsuranceAmount() {
        return vehicleInsuranceAmount;
    }

    public void setVehicleInsuranceAmount(String vehicleInsuranceAmount) {
        this.vehicleInsuranceAmount = vehicleInsuranceAmount;
    }

    public String getCreditLifeInsuranceAmount() {
        return creditLifeInsuranceAmount;
    }

    public void setCreditLifeInsuranceAmount(String creditLifeInsuranceAmount) {
        this.creditLifeInsuranceAmount = creditLifeInsuranceAmount;
    }

}
