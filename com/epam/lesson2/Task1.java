package com.epam.lesson2;

/*Задание 1:
Напишите программу на языке Java, которая описывает две переменные
целого типа и без объявления других переменных меняет местами их значения.*/

public class Task1 {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 10;
        var1 += var2;           // var1 = 15
        var2 = -(var2 - var1);  // var2 = 5
        var1 = var1 - var2;     // var1 = 10

        System.out.println(var1 + ", " +var2);
    }
}
