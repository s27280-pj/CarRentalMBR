package Rental;

import java.util.ArrayList;
import java.util.List;

public class RentalStatusStorage {
    private static RentalStatusStorage instance;
    private List<RentalStatus> rentalStatusList = new ArrayList<>();
    private RentalStatusStorage(){
    }

    public static RentalStatusStorage getInstance(){
        if (instance == null){
            instance = new RentalStatusStorage();
        }
        return instance;
    }

    public void addRental(RentalStatus rentalStatus){rentalStatusList.add(rentalStatus);}

    public List<RentalStatus> getRentalStatusList(){return rentalStatusList;}


}
