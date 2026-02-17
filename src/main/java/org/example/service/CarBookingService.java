package org.example.service;
import org.example.model.*;
import org.example.repository.CarBookingRepository;
import java.time.LocalDate;
public class CarBookingService {
    private final CarBookingRepository repo = new CarBookingRepository();
    public void addCustomer(Customer c) throws Exception {
        if (c.getPhoneNumber().length() != 10) {
            throw new Exception("Phone number must be 10 digits");
        }
        if(c.getAge()<18){
            throw new Exception("Customer Age must be at least 18");
        }
        repo.addCustomer(c);
        System.out.println("Customer Added Successfully");
    }
    public void viewAllCustomers() throws Exception {
        repo.viewAllCustomers();
    }
    public void addCar(Car car) throws Exception {
        repo.addCar(car);
        System.out.println("Car Added Successfully");
    }
    public void viewCars() throws Exception {
        repo.viewCars();
    }
    public void updateCarPrice(int carId, double price) throws Exception {
        if(price<0){
            throw new Exception("Price per day must be greater than equal to 0");
        }
        repo.updateCarPrice(carId, price);
        System.out.println("Car Price Updated");
    }
    public void deleteCustomer(int customerId) throws Exception {
        repo.deleteCustomer(customerId);
        System.out.println("Customer Deleted");
    }
    public double calculateTotalAmount(LocalDate start, LocalDate end, double pricePerDay) throws Exception {
        if (end.isBefore(start)) {
            throw new Exception("End date must be after start date");
        }
        long days = end.toEpochDay() - start.toEpochDay();
        return days * pricePerDay;
    }
}
