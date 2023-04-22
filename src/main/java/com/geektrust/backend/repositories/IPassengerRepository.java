package com.geektrust.backend.repositories;

import java.util.Optional;
import com.geektrust.backend.entities.MetroCard;
import com.geektrust.backend.entities.Passenger;
import com.geektrust.backend.entities.PassengerType;

public interface IPassengerRepository {
    public Passenger save(Passenger entity);
    public Optional<Passenger> findById(String integer);
    public void update(String id, MetroCard card, String passengerType,Boolean returnJourneyFlag);
}
