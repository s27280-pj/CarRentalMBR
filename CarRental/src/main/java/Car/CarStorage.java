package Car;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {
    private static CarStorage instance;
    private List<Car> cars = new ArrayList<>();

    private CarStorage(){
    }

    public static CarStorage getInstance(){
        if (instance == null){
            instance = new CarStorage();
        }
        return instance;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public List<Car> getCars(){
        return cars;
    }
}
