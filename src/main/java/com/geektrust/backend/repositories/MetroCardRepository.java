package com.geektrust.backend.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.geektrust.backend.entities.MetroCard;

public class MetroCardRepository implements IMetroCardRepository{
    private final Map<String,MetroCard> cardMap;
    private Integer autoIncrement = 0;
    
    public MetroCardRepository() {
        cardMap = new HashMap<String,MetroCard>();
    }

    public MetroCardRepository(Map<String, MetroCard> cardMap) {
        this.cardMap = cardMap;
        this.autoIncrement = cardMap.size();
    }

    @Override
    public void save(MetroCard entity) {
        MetroCard metrocard = new MetroCard(entity.getCardNumber(),entity.getCardBalance(),entity.getCardNumber().substring(entity.getCardNumber().length()-1));
        cardMap.put(entity.getCardNumber(),metrocard);
    }

    @Override
    public void update(String cardNum,Integer remainingBalance,String id) {
        MetroCard metroCard=new MetroCard(cardNum, remainingBalance, id);
        cardMap.put(cardNum, metroCard);
    }

    @Override
    public List<MetroCard> findAll() {
        List<MetroCard> cards=cardMap.entrySet().stream()
        .map(Map.Entry::getValue)
        .collect(Collectors.toList());

        return cards;
    }
}