package org.example.controller;
import org.example.model.*;
import org.example.service.CarBookingService;
import java.util.Scanner;
public class CarBookingController {
    private final CarBookingService service = new CarBookingService();
    private final Scanner sc = new Scanner(System.in);
    public void start() {
        while (true) {
            System.out.println("\n CAR BOOKING SYSTEM ");
            System.out.println("1. Add Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. Add Car");
            System.out.println("4. View Cars");
            System.out.println("5. Update Car Price");
            System.out.println("6. Delete Customer");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1 -> addCustomer();
                    case 2 -> service.viewAllCustomers();
                    case 3 -> addCar();
                    case 4 -> service.viewCars();
                    case 5 -> updateCarPrice();
                    case 6 -> deleteCustomer();
                    case 7 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    private void addCustomer() throws Exception {
        Customer c = new Customer();
        System.out.print("Customer ID: ");
        c.setCustomerId(sc.nextInt());
        sc.nextLine();
        System.out.print("Name: ");
        c.setName(sc.nextLine());
        System.out.print("Age: ");
        c.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Phone: ");
        c.setPhoneNumber(sc.nextLine());
        System.out.print("Email: ");
        c.setEmail(sc.nextLine());
        System.out.print("Address: ");
        c.setAddress(sc.nextLine());
        service.addCustomer(c);
        System.out.println("Customer added successfully!");
    }
    private void addCar() throws Exception {
        Car car = new Car();
        System.out.print("Car ID: ");
        car.setCarId(sc.nextInt());
        sc.nextLine();
        System.out.print("Brand: ");
        car.setBrand(sc.nextLine());
        System.out.print("Model: ");
        car.setModel(sc.nextLine());
        System.out.print("Type: ");
        car.setType(sc.nextLine());
        System.out.print("Price per day: ");
        car.setPricePerDay(sc.nextDouble());
        sc.nextLine();
        System.out.print("Availability Status (Available/Booked): ");
        car.setAvailabilityStatus(sc.nextLine());
        service.addCar(car);
        System.out.println("Car added successfully!");
    }
    private void updateCarPrice() throws Exception {
        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        System.out.print("New Price: ");
        double price = sc.nextDouble();
        service.updateCarPrice(id, price);
        System.out.println("Price updated!");
    }
    private void deleteCustomer() throws Exception {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        service.deleteCustomer(id);
        System.out.println("Customer deleted!");
    }
}