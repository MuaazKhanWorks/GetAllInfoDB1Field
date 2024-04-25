package com.OnlyNameInRequest.FatchDataAgainstName.entity;

public class CustomerData {
    private String currentCustomerTier;
    private String currentPoints;
    private String nextCustomerTier;
    private String pointRequiredForNextTier;
    private String message;

    public CustomerData() {
        super();
    }

    public CustomerData(String currentCustomerTier, String currentPoints, String nextCustomerTier, String pointRequiredForNextTier, String message) {
        this.currentCustomerTier = currentCustomerTier;
        this.currentPoints = currentPoints;
        this.nextCustomerTier = nextCustomerTier;
        this.pointRequiredForNextTier = pointRequiredForNextTier;
        this.message = message;
    }

    public String getCurrentCustomerTier() {
        return currentCustomerTier;
    }

    public void setCurrentCustomerTier(String currentCustomerTier) {
        this.currentCustomerTier = currentCustomerTier;
    }

    public String getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(String currentPoints) {
        this.currentPoints = currentPoints;
    }

    public String getNextCustomerTier() {
        return nextCustomerTier;
    }

    public void setNextCustomerTier(String nextCustomerTier) {
        this.nextCustomerTier = nextCustomerTier;
    }

    public String getPointRequiredForNextTier() {
        return pointRequiredForNextTier;
    }

    public void setPointRequiredForNextTier(String pointRequiredForNextTier) {
        this.pointRequiredForNextTier = pointRequiredForNextTier;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CustomerData{" +
                "currentCustomerTier='" + currentCustomerTier + '\'' +
                ", currentPoints='" + currentPoints + '\'' +
                ", nextCustomerTier='" + nextCustomerTier + '\'' +
                ", pointRequiredForNextTier='" + pointRequiredForNextTier + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
