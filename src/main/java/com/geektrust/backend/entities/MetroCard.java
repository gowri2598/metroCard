package com.geektrust.backend.entities;

public class MetroCard {
    private final String cardNumber;
    private Integer cardBalance;
    private String passengerId;

    public MetroCard(String cardNumber, Integer cardBalance,String passengerId) {
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
        this.passengerId = passengerId;
    }
    
    public MetroCard(String cardNumber, Integer cardBalance) {
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String getPassengerId() {
        return passengerId;
    }
    public Integer getCardBalance() {
        return cardBalance;
    }     
}