package com.auto.pojoclasses;

public class USernameStatus {
    @JsonProperty("code")
    private int code;
    @JsonProperty("msg")
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
