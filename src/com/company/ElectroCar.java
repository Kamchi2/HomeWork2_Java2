package com.company;

public class ElectroCar extends Car implements Printable{
    private int electroFuel;
    private int electroFuelPerHour;

    public ElectroCar(int fuel, int fuelPerHour, int kilometerPerHour, int electroFuel, int electroFuelPerHour) {
        super(fuel, fuelPerHour, kilometerPerHour);
        this.electroFuel = electroFuel;
        this.electroFuelPerHour = electroFuelPerHour;
    }

    @Override
    public void print() {
        System.out.println(
                "----------------------------" +
                "\nТопливо : " + this.getFuel() +
                "\nЗатрата топлива/час : " + this.getFuelPerHour() +
                "\nКилометров/час : " + this.getKilometerPerHour() +
                "\nЭлектро топливо : " + this.electroFuel +
                "\nЭлектро топлива/час : " + this.electroFuelPerHour
        );
    }
}
