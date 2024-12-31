package com.rental.system;

public class Main {
    public static void main(String[] args) {
        // Create a rental agency
        RentalAgency agency = new RentalAgency();

        // Add vehicles
        agency.addVehicle(new Car("C001", "Toyota Corolla", 50));
        agency.addVehicle(new Motorcycle("M001", "Yamaha MT-07", 30));
        agency.addVehicle(new Truck("T001", "Ford F-150", 100));

        // Create a customer
        Customer customer = new Customer("Alice");

        // Rent a vehicle
        agency.rentVehicle(customer, "Toyota Corolla", 3);

        // Return a vehicle
        Vehicle rentedVehicle = customer.getRentalHistory().get(0);
        agency.returnVehicle(rentedVehicle);
    }
}
