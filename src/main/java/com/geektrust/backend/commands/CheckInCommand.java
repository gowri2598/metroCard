package com.geektrust.backend.commands;

import java.util.List;
import com.geektrust.backend.exceptions.CardNumberNotFoundException;
import com.geektrust.backend.services.IMetroCardService;
import com.geektrust.backend.services.IPassengerService;

public class CheckInCommand implements ICommand{

    private final IMetroCardService metroCardService;
    private final IPassengerService passengerService;

    public CheckInCommand(IMetroCardService metroCardService,IPassengerService passengerService) {
        this.metroCardService = metroCardService;
        this.passengerService= passengerService;
    }

    @Override
    public void execute(List<String> tokens) {
        // TODO Auto-generated method stub
        try{
            passengerService.checkIn(tokens.get(1),tokens.get(2),tokens.get(3));
        }
        catch(CardNumberNotFoundException e){
            System.out.println(e.getMessage());
        }
    }   
}