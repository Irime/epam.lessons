package com.epam.lesson2;

/* Задание 3:
Напишите программу на языке Java, которая преобразует вес, заданный в
фунтах, в килограммы, но выводит раздельно количество полученных
килограмм и грамм (в 1 фунте 453,6 грамм). */

public class Task3 {
    public static void main(String[] args) {
        float pounds = 98.365F;
        float totalGrams = pounds * 453.6F;
        float kilos = totalGrams / 1000;

        float grams = Math.round((kilos - (int)kilos)*1000);

        System.out.println(pounds + " pounds is "+ (int)kilos + " kg " + (int)grams + " g.");
    }
}
