package com.auto.pojoclasses;

public class UsernameNextStep {
    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("order")
    private int order;
    @JsonProperty("partial")
    private String partial;
    @JsonProperty("actions")
    private String actions;
    @JsonProperty("params")
    private UsernameParams params;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getPartial() {
        return partial;
    }

    public void setPartial(String partial) {
        this.partial = partial;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public UsernameParams getParams() {
        return params;
    }

    public void setParams(UsernameParams params) {
        this.params = params;
    }
}
