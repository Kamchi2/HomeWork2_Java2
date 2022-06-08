package com.company;

public class Car {
    private int fuel;
    private int fuelPerHour;
    private int kilometerPerHour;

    public Car(int fuel, int fuelPerHour, int kilometerPerHour) {
        this.fuel = fuel;
        this.fuelPerHour = fuelPerHour;
        this.kilometerPerHour = kilometerPerHour;
    }

    public int getFuel() {
        return fuel;
    }

    public int getFuelPerHour() {
        return fuelPerHour;
    }

    public int getKilometerPerHour() {
        return kilometerPerHour;
    }


}
