package com.geektrust.backend.repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.geektrust.backend.entities.MetroCard;
import com.geektrust.backend.entities.Passenger;
import com.geektrust.backend.entities.PassengerType;

public class PassengerRepository implements IPassengerRepository{

    private final Map<String,Passenger> passengerMap;

    public PassengerRepository() {
        passengerMap = new HashMap<String,Passenger>();
    }

   

    @Override
    public Optional<Passenger> findById(String id) {
        return Optional.ofNullable(passengerMap.get(id));
    }



    @Override
    public Passenger save(Passenger entity) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public void update(String id, MetroCard card, String passengerType,
    Boolean returnJourneyFlag) {
        // TODO Auto-generated method stub
        if(returnJourneyFlag){
            Passenger passenger=new Passenger(id, card, passengerType ,!returnJourneyFlag);
            passengerMap.put(id, passenger);
        }
    }
    
}