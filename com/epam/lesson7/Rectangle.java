package com.epam.lesson7;

public class Rectangle extends Shape{
    private float width;
    private float height;

    public Rectangle(float width, float height){
        super("red");
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcArea() {
        return (double) Math.round(width * height * 10) / 10;
    }
}
