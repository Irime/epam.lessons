package com.epam.lesson7_Interfaces;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius){
        super("white");
        this.radius = radius;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcArea() {
        return (double) Math.round(Math.PI * radius * radius * 10)/10;
    }
}
