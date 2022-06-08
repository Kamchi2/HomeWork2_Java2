package com.company;

public class RacingCar extends Car implements Printable{
    private int enginePower;

    public RacingCar(int fuel, int fuelPerHour, int kilometerPerHour, int enginePower) {
        super(fuel, fuelPerHour, kilometerPerHour);
        this.enginePower = enginePower;
    }

    @Override
    public void print() {
        System.out.println(
                "----------------------------" +
                "\nТопливо : " + this.getFuel() +
                "\nЗатрата топлива/час : " + this.getFuelPerHour() +
                "\nКилометров/час : " + this.getKilometerPerHour() +
                "\nМощность двигателя : " + this.enginePower
        );
    }
}
