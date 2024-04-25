package com.OnlyNameInRequest.FatchDataAgainstName.entity;

public class CustomerRequest {
    private String name;

    public CustomerRequest() {
        super();
    }

    public CustomerRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
