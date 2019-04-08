package com.epam.lesson7_Interfaces;

public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c){
        super("yellow");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcArea() {
        double s = (a+b+c)/2;
        s = s*(s-a)*(s-b)*(s-c);
        return (double) Math.round(Math.sqrt(s) * 10) / 10;
    }
}
