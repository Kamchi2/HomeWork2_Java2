package com.company;

// Circle это круг

public class Circle extends Figure{
    private int diameter;

    public Circle(String name, int diameter) {
        super(name);
        this.diameter = diameter;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (diameter * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE1");
    }
}
