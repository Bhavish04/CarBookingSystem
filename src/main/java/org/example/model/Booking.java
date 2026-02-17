package org.example.model;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int customerId;
    private int CarId;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalAmount;
    private String status;
    public Booking(){}
    public Booking(int bookingId, int customerId, LocalDate startDate, LocalDate endDate, double totalAmount, String status){
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }
    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public String getStatus() {
        return status;
    }
}