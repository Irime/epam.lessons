package com.epam.lesson7;

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
        showShapes(shapes);
        System.out.println("Total area of all shapes is: " + (double)Math.round(getTotalArea(shapes) * 10) / 10);
        System.out.println("Areas of rectangles, circles and triangles: " + Arrays.toString(getShapesArea(shapes)));
    }

    static void showShapes(Shape[] shapes){
        for (Shape shape: shapes) {
            System.out.println(shape.toString() + " Area: " + shape.calcArea());
        }
    }

    static double getTotalArea(Shape[] shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++){
            sum+=shapes[i].calcArea();
        }
        return sum;
    }

    static double[] getShapesArea(Shape[] shapes){
        double rectanglesArea = 0.0d;
        double circlesArea = 0.0d;
        double trianglesArea = 0.0d;
        for (Shape shape: shapes) {
            if (shape instanceof Rectangle){
                rectanglesArea += shape.calcArea();
            }
            if (shape instanceof Circle){
                circlesArea += shape.calcArea();
            }
            if (shape instanceof Triangle){
                trianglesArea += shape.calcArea();
            }
        }
        return new double[]{rectanglesArea, circlesArea, trianglesArea};
    }
}
