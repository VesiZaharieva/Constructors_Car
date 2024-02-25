package org.example;

public class Main {
    public static void main(String[] args) {
        double tax;
        Car car1 = new Car();
        int age1 = car1.calculateAge();
        if (age1 <= 5) {
            tax = 0;
        } else {
            tax = car1.calculateTax();
        }
        System.out.println("Owed tax for " + car1.brand + " " + car1.model + " is: " + tax);

        Car car2 = new Car ("VW", "Golf", 2024, 2018, 20000);
        int age2 = car2.calculateAge();
        if (age2 <= 5) {
            tax = 0;
        } else {
            tax = car2.calculateTax();
        }
        System.out.println("Owed tax for " + car2.brand + " " + car2.model + " is: " + tax);
    }
}