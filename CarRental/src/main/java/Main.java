import Car.*;
import Rental.RentalStatusStorage;

public class Main {
    public static void main(String[] args) {
        CarStorage carStorage = CarStorage.getInstance();
        carStorage.addCar(new Car("Peugeot","208","VBHY", CarCategory.Hatchback));
        RentalStatusStorage rentalStatusStorage = RentalStatusStorage.getInstance();
    }
}
