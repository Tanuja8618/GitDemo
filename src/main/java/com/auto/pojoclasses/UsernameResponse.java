package com.auto.pojoclasses;

public class UsernameResponse {

    @JsonProperty("status")
    private UsernameStatus status;
    @JsonProperty("extendedStatus")
    private String extendedStatus;
    @JsonProperty("sysprops")
    private String sysprops;
    @JsonProperty("result")
    private List<UsernameResult> result;

    public UsernameStatus getStatus() {
        return status;
    }

    public void setStatus(UsernameStatus status) {
        this.status = status;
    }

    public String getExtendedStatus() {
        return extendedStatus;
    }

    public void setExtendedStatus(String extendedStatus) {
        this.extendedStatus = extendedStatus;
    }

    public String getSysprops() {
        return sysprops;
    }

    public void setSysprops(String sysprops) {
        this.sysprops = sysprops;
    }

    public List<UsernameResult> getResult() {
        return result;
    }

    public void setResult(List<UsernameResult> result) {
        this.result = result;
    }

}
