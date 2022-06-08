package com.company;

public class BuildCar extends Car implements Printable{
    private int loadCapacity;

    public BuildCar(int fuel, int fuelPerHour, int kilometerPerHour, int loadCapacity) {
        super(fuel, fuelPerHour, kilometerPerHour);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void print() {
        System.out.println(
                "----------------------------" +
                "\nТопливо : " + this.getFuel() +
                "\nЗатрата топлива/час : " + this.getFuelPerHour() +
                "\nКилометров/час : " + this.getKilometerPerHour() +
                "\nГрузоподъёмность : " + this.loadCapacity
        );
    }
}
