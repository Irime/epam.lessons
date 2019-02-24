package com.epam.lesson2;

/*Задание 4:
Напишите программу на языке Java, которая вычисляет и выводит в
консоль сумму прибыли по заданному депозиту (например, 10000) на заданное
количество месяцев (например, 6) под указанный процент годовых (например,
12%).
Рассчитываем по формуле простых процентов Sp = (depositSum * interest * days) / (daysInYear * 100);
*/

public class Task4 {
    public static void main(String[] args) {
        double depositSum = 10000D;
        int days = 365 / 2;
        float interest = 12F;
        int daysInYear = 365;
        double income = (depositSum * interest * days)/(daysInYear * 100);

        System.out.println("Cуммa прибыли по заданному депозиту " + depositSum
                + " на 6 месяцев под " + interest + " процентов годовых составит " + String.format("%.2f", income));

    }
}
