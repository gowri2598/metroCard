package com.geektrust.backend.services;

import com.geektrust.backend.exceptions.CardNumberNotFoundException;

public interface IMetroCardService {
    public void balance(String cardNum, Integer balanceAvailable) throws CardNumberNotFoundException;
    //public void printSummary();
}