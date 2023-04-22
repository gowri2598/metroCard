package com.geektrust.backend.services;

import com.geektrust.backend.exceptions.CardNumberNotFoundException;

public interface IPassengerService {
    public void checkIn(String cardNum,String passengerType,String fromStation) throws CardNumberNotFoundException;
}
