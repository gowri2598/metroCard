package com.geektrust.backend.services;

import java.util.*;
import com.geektrust.backend.dtos.TotalCollection;
import com.geektrust.backend.entities.StationName;
import com.geektrust.backend.repositories.IRevenueRepository;

public class RevenueService implements IRevenueService{

    private final IRevenueRepository revenueRepository;
    
    public RevenueService(IRevenueRepository revenueRepository) {
        this.revenueRepository = revenueRepository;
    }

    @Override
    public void printSummary() {
    
        List<TotalCollection> allCollection = revenueRepository.findAll().orElse(new ArrayList<>());
    
            // KID 2
            int amountCollectedAtCentral = 0;
            int discountGivenAtCentral = 0;
            int seniorCentralCount = 0;
            int adultCentralCount = 0;
            int kidCentralCount = 0;

            int amountCollectedAtAirport = 0;
            int discountGivenAtAirport = 0;
            int adultAirportCount = 0;
            int seniorAirportCount = 0;
            int kidAirportCount = 0;

        for(TotalCollection t: allCollection){
            if(t.getStationName() == StationName.AIRPORT){
                    amountCollectedAtAirport+=t.getAmountCollected();
                    discountGivenAtAirport+=t.getDiscountGiven();
                    switch(t.getPassengertype()){
                        case ADULT:
                            adultAirportCount+=t.getCount();
                            break;
                        case KID:
                            kidAirportCount+=t.getCount();
                            break;
                        case SENIOR_CITIZEN:
                            seniorAirportCount+=t.getCount();
                            break;
                        default:
                    }
            }else {
                amountCollectedAtCentral+=t.getAmountCollected();
                discountGivenAtCentral+=t.getDiscountGiven();
                switch(t.getPassengertype()){
                    case ADULT:
                        adultCentralCount+=t.getCount();
                        break;
                    case KID:
                        kidCentralCount+=t.getCount();
                        break;
                    case SENIOR_CITIZEN:
                        seniorCentralCount+=t.getCount();
                        break;
                    default:
                }
            }
        }
        
               System.out.println("TOTAL_COLLECTION CENTRAL " + amountCollectedAtCentral + " " + discountGivenAtCentral);
                System.out.println("PASSENGER_TYPE_SUMMARY");
                if(adultCentralCount > 0)
                    System.out.println("ADULT "+ adultCentralCount);
                if(seniorCentralCount > 0)
                    System.out.println("ADULT "+ seniorCentralCount);
                if(kidCentralCount > 0)
                    System.out.println("ADULT "+ kidCentralCount);
        
                System.out.println("TOTAL_COLLECTION AIRPORT " + amountCollectedAtAirport + " " + discountGivenAtAirport);
                System.out.println("PASSENGER_TYPE_SUMMARY");
                if(adultAirportCount > 0)
                    System.out.println("ADULT "+ adultAirportCount);
                if(seniorAirportCount > 0)
                    System.out.println("ADULT "+ seniorAirportCount);
                if(kidAirportCount > 0)
                    System.out.println("ADULT "+ kidAirportCount); 

    }
    
}
