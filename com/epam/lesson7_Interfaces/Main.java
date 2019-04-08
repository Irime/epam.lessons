package com.epam.lesson7_Interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Rectangle(12.5f,2.1f),
                new Rectangle(12, 13),
                new Rectangle(5.5f, 10.0f),
                new Rectangle(10.5f, 10.0f),
                new Circle(9.9f),
                new Circle(10.5f),
                new Circle(4.4f),
                new Triangle(12.2f, 3.3f, 14.4f),
                new Triangle(2.2f, 13.3f, 14.4f),
                new Triangle(12.2f, 23.3f, 14.4f)
        };
        printShapes(shapes);
        System.out.println("*******Shapes by area**************");
        Arrays.sort(shapes, new ShapesCompareByArea());
        printShapes(shapes);
        System.out.println("*******Shapes by color*************");
        Arrays.sort(shapes, new ShapesCompareByColor());
        printShapes(shapes);

    }

    static void printShapes(Shape[] shapes){
        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}
