package Car;

public class Car {
    private String brand;
    private String model;
    private String vin;
    private CarCategory carCategory;

    public Car(String brand, String model, String vin, CarCategory carCategory){
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.carCategory = carCategory;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public void setModel(String newModel){
        this.model = newModel;
    }

    public void setVin(String newVin){
        this.vin = newVin;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }
}
