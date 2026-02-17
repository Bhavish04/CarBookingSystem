package org.example.repository;
import org.example.model.Car;
import org.example.model.Customer;
import org.example.util.DBConnection;
import java.sql.*;
public class CarBookingRepository {
    public void addCustomer(Customer c) throws Exception {
        String sql = "INSERT INTO customers(customer_id, name, phone_number, email, address) VALUES (?,?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, c.getCustomerId());
            ps.setString(2, c.getName());
            ps.setString(3, c.getPhoneNumber());
            ps.setString(4, c.getEmail());
            ps.setString(5, c.getAddress());
            ps.executeUpdate();
        }
    }
    public void viewAllCustomers() throws Exception {
        String sql = "SELECT * FROM customers";
        try (Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()){
            System.out.println("\n ALL CUSTOMERS");
            while(rs.next()){
                System.out.println(
                        rs.getInt("customer_id")+"|"+rs.getString("name")+"|"+rs.getString("phone_number")+"|"+rs.getString("email")+"|"+rs.getString("address")
                );
            }
        }
    }
    public void addCar(Car car) throws Exception {
        String sql = "INSERT INTO cars(car_id, brand, model, type, price_per_day, availability_status) VALUES (?,?,?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, car.getCarId());
            ps.setString(2, car.getBrand());
            ps.setString(3, car.getModel());
            ps.setString(4, car.getType());
            ps.setDouble(5, car.getPricePerDay());
            ps.setString(6, car.getAvailabilityStatus());
            ps.executeUpdate();
        }
    }
    public void viewCars() throws Exception {
        String sql = "SELECT * FROM cars";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("car_id") + " | " +
                                rs.getString("brand") + " | " +
                                rs.getString("model") + " | " +
                                rs.getString("type") + " | " +
                                rs.getDouble("price_per_day") + " | " +
                                rs.getString("availability_status")
                );
            }
        }
    }
    public void updateCarPrice(int carId, double price) throws Exception {
        String sql = "UPDATE cars SET price_per_day=? WHERE car_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, price);
            ps.setInt(2, carId);
            ps.executeUpdate();
        }
    }
    public void deleteCustomer(int customerId) throws Exception {
        String sql = "DELETE FROM customers WHERE customer_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, customerId);
            ps.executeUpdate();
        }
    }
}
