package org.example.model;

public class Car {
    private int carId;
    private String brand;
    private String model;
    private String type;
    private double pricePerDay;
    private String availabilityStatus;
    public Car(){}
    public Car(int carId, String brand, String model, String type, double pricePerDay, String availabilityStatus){
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.availabilityStatus = availabilityStatus;
    }
    public int getCarId() {
        return carId;
    }
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}