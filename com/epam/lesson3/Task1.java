package com.epam.lesson3;

/*Задание:
Напишите программу на языке Java, которая заполняет звездочками (*) и
отображает в консоли треугольники*/

public class Task1 {
    public static void main(String[] args) {
        //1-st figure
        {
            System.out.println("1.");
            int a_side = 1;
            while (a_side < 5){
                int b_side = a_side;
                while (b_side >= 1){
                    System.out.print("* ");
                    b_side --;
                }
                a_side++;
                System.out.println();
            }
        }

        {
            int length = 3;
            int iteration = 0;
            while (iteration <= length ){
                int spaces = 0;
                while (spaces < length - iteration){
                    System.out.print("* ");
                    spaces ++;
                }
                int stars = iteration;
                while (stars > 0){
                    System.out.print("  ");
                    stars--;
                }
                iteration++;
                System.out.println();
            }
        }

        //2-nd figure
        {
            System.out.println("2.");
            int length = 4;
            int iteration = 0;
            while (iteration <= length ){
                int stars_1 = 0;
                while (stars_1 < length - iteration){
                    System.out.print("* ");
                    stars_1 ++;
                }
                int spaces = iteration;
                while (spaces > 0){
                    System.out.print("  ");
                    spaces--;
                }
                iteration++;
                System.out.println();
            }
        }

        //3-rd figure
        {
            System.out.println("3.");
            int length = 4;
            int iteration = 0;
            while (iteration <= length ){
                int spaces = 0;
                while (spaces < length - iteration){
                    System.out.print("  ");
                    spaces ++;
                }
                int stars = iteration;
                while (stars > 0){
                    System.out.print("* ");
                    stars--;
                }
                iteration++;
                System.out.println();
            }
        }



        /*int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */
    }
}
