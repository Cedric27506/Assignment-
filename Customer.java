package com.rental.system;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Vehicle> rentalHistory;

    public Customer(String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    public void addRental(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }
}
