package com.auto.pojoclasses;

public class UsernameParams {
    @JsonProperty("showTwilioInfo")
    private String showTwilioInfo;
    @JsonProperty("devices")
    private List<UsernameDevice> devices;
    @JsonProperty("loginName")
    private String loginName;

    public String getShowTwilioInfo() {
        return showTwilioInfo;
    }

    public void setShowTwilioInfo(String showTwilioInfo) {
        this.showTwilioInfo = showTwilioInfo;
    }

    public List<UsernameDevice> getDevices() {
        return devices;
    }

    public void setDevices(List<UsernameDevice> devices) {
        this.devices = devices;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
