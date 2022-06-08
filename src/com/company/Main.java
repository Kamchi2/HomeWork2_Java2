package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);

        Triangle triangle = new Triangle("Triangle", 5, 5, 5);

        Square square = new Square("Square", 5);

        Rectangle rectangle = new Rectangle("Rectangle", 10, 5);

        Figure[] figures = {circle, triangle, square, rectangle};

        ElectroCar tesla = (ElectroCar) createObject("2й");
        tesla.print();
        BuildCar excavator = (BuildCar) createObject("3й");
        excavator.print();
        RacingCar Formula1 = (RacingCar) createObject("4й");
        Formula1.print();



        for (Figure figure : figures) {
            System.out.println(figure.getName() + ": " + figure.calculatePerimeter());
        }

        System.out.println("_________________________________________________________");

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName() + ": " + figures[i].calculatePerimeter());

        }

        System.out.println("_________________________________________________________");

        Dog dog = new Dog("Sabaken");
        Drawable[] drawables = {circle, triangle, square, rectangle, dog};
        for (Drawable drawable : drawables) {
            if (drawable instanceof Figure) {
                System.out.println(((Figure) drawable).getName() + ": " + ((Figure) drawable).calculatePerimeter());
            } else if (drawable instanceof Animal) {
                System.out.println(((Animal) drawable).getName());
            }
            drawable.draw();
        }

    }

    public static Car createObject(String className) {
        if (className == "2й"){
            ElectroCar electroCar = new ElectroCar(100, 10, 160, 120, 5);
            return electroCar;
        }else if (className == "3й") {
            BuildCar buildCar = new BuildCar(150, 15, 80, 100);
            return buildCar;
        }else if (className == "4й") {
            RacingCar racingCar = new RacingCar(105, 20, 190, 80);
            return racingCar;
        }else{
            ElectroCar electroCar = new ElectroCar(100, 10, 160, 120, 5);
            return electroCar;
        }
    }
}
