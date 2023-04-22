package com.geektrust.backend.commands;

import java.util.List;
import com.geektrust.backend.exceptions.CardNumberNotFoundException;
import com.geektrust.backend.services.IMetroCardService;

public class BalanceCommand implements ICommand{

    private final IMetroCardService metroCardService;
    
    public BalanceCommand(IMetroCardService metroCardService) {
        this.metroCardService = metroCardService;
    }
    
    @Override
    public void execute(List<String> tokens) {
        // TODO Auto-generated method stub
        try{
            metroCardService.balance(tokens.get(1), Integer.parseInt(tokens.get(2)));
        }
        catch(CardNumberNotFoundException e){
            System.out.println(e.getMessage());
        }
    }  
}