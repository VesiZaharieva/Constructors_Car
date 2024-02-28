package org.example;

import java.util.Calendar;

public class Car {
    public String brand;
    public String model;
    private Calendar calendar = Calendar.getInstance();
    private int currentYear = calendar.get(Calendar.YEAR);
    private int productionYear;
    private double price;

    public Car() {
        this.brand = "Reno";
        this.model = "Clio";
        this.price = 10000;
        this.productionYear = 2021;

    }

    public Car(String brand, String model, int productionYear, double price) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;
        }

    public int calculateAge() {
        return currentYear - productionYear ;        }

    public double calculateTax() {
        return price * 0.05;
    }
}

