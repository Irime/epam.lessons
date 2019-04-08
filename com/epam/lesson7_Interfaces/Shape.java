package com.epam.lesson7_Interfaces;

public abstract class Shape implements Drawable{
    private String color;
    private int radius;

    public Shape(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " color=" + color +
                " area=";
    }

    public abstract double calcArea();


    @Override
    public void draw() {
        System.out.println("" + this + this.calcArea());
    }
}
