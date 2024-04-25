package com.OnlyNameInRequest.FatchDataAgainstName.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String currentCustomerTier;
    private String currentPoints;
    private String nextCustomerTier;
    private String pointRequiredForNextTier;

    public Customer() {
        super();
    }

    public Customer(Long id, String name, String currentCustomerTier, String currentPoints, String nextCustomerTier, String pointRequiredForNextTier) {
        this.id = id;
        this.name = name;
        this.currentCustomerTier = currentCustomerTier;
        this.currentPoints = currentPoints;
        this.nextCustomerTier = nextCustomerTier;
        this.pointRequiredForNextTier = pointRequiredForNextTier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", currentCustomerTier='" + currentCustomerTier + '\'' +
                ", currentPoints='" + currentPoints + '\'' +
                ", nextCustomerTier='" + nextCustomerTier + '\'' +
                ", pointRequiredForNextTier='" + pointRequiredForNextTier + '\'' +
                '}';
    }
}
