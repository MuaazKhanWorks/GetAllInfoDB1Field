package com.OnlyNameInRequest.FatchDataAgainstName.entity;

public class CustomerResponse {
    private String responsecode;
    private CustomerData data;
    private String messages;
    private boolean zmileUser;

    public CustomerResponse() {
        super();
    }

    public CustomerResponse(String responsecode, CustomerData data, String messages, boolean zmileUser) {
        this.responsecode = responsecode;
        this.data = data;
        this.messages = messages;
        this.zmileUser = zmileUser;
    }

    public String getResponsecode() {
        return responsecode;
    }

    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }

    public CustomerData getData() {
        return data;
    }

    public void setData(CustomerData data) {
        this.data = data;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public boolean isZmileUser() {
        return zmileUser;
    }

    public void setZmileUser(boolean zmileUser) {
        this.zmileUser = zmileUser;
    }

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "responsecode='" + responsecode + '\'' +
                ", data=" + data +
                ", messages='" + messages + '\'' +
                ", zmileUser=" + zmileUser +
                '}';
    }
}
