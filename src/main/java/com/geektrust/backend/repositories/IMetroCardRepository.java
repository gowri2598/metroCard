package com.geektrust.backend.repositories;

import java.util.List;
import com.geektrust.backend.entities.MetroCard;

public interface IMetroCardRepository {

    public List<MetroCard> findAll();
    public void save(MetroCard entity);  
    public void update(String cardNumber,Integer remainingBalance,String Id);
   
}