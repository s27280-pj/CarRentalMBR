package Rental;

import Car.Car;

import java.time.LocalDateTime;

public class RentalStatus {
    private String rentalOwner;
    private Car rentedCar;
    private LocalDateTime startRentDate;
    private LocalDateTime finishRentDate;

    public RentalStatus(String rentalOwner, Car rentedCar, LocalDateTime startRentDate, LocalDateTime finishRentDate){
        this.rentalOwner = rentalOwner;
        this.rentedCar = rentedCar;
        this.startRentDate = startRentDate;
        this.finishRentDate = finishRentDate;
    }

    public String getRentalOwner() {
        return rentalOwner;
    }

    public void setRentalOwner(String rentalOwner) {
        this.rentalOwner = rentalOwner;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }

    public LocalDateTime getStartRentDate() {
        return startRentDate;
    }

    public LocalDateTime getFinishRentDate() {
        return finishRentDate;
    }

    public void setStartRentDate(LocalDateTime newStartRentDate){
        this.startRentDate = newStartRentDate;
    }

    public void setFinishRentDate(LocalDateTime newFinishRentDate){
        this.finishRentDate = newFinishRentDate;
    }

}
