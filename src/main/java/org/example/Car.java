package org.example;

public class Car {
    public String brand;
    public String model;
    private int productionYear;
    private int currentYear;
    private double price;

    public Car() {
        this.brand = "Reno";
        this.model = "Clio";
        this.price = 10000;
        this.productionYear = 2021;
        this.currentYear = 2024;
    }
    public Car(String brand, String model, int currentYear, int productionYear, double price) {
        this.brand = brand;
        this.model = model;
        this.currentYear = currentYear;
        this.productionYear = productionYear;
        this.price = price;
    }
    public int calculateAge() {
        return currentYear - productionYear;
    }
    public double calculateTax() {
        return price * 0.05;
        }
    }

