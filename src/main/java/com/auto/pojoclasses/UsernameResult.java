package com.auto.pojoclasses;

public class UsernameResult {
    @JsonProperty("steps")
    private String steps;
    @JsonProperty("nextStep")
    private UsernameNextStep nextStep;
    @JsonProperty("previousStep")
    private String previousStep;
    @JsonProperty("cookies")
    private List<String> cookies;
    @JsonProperty("id_token")
    private String id_token;
    @JsonProperty("expires_in")
    private String expires_in;


    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public UsernameNextStep getNextStep() {
        return nextStep;
    }

    public void setNextStep(UsernameNextStep nextStep) {
        this.nextStep = nextStep;
    }

    public String getPreviousStep() {
        return previousStep;
    }

    public void setPreviousStep(String previousStep) {
        this.previousStep = previousStep;
    }

    public List<String> getCookies() {
        return cookies;
    }

    public void setCookies(List<String> cookies) {
        this.cookies = cookies;
    }

    public String getId_token() {
        return id_token;
    }

    public void setId_token(String id_token) {
        this.id_token = id_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }
}
