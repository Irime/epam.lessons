package com.epam.lesson2;
/*
Задание 2:
Напишите программу на языке Java, которая:
− описывает трехзначное целое число number (например, 123);
− находит и выводит в консоль разность между числом number и числом,
составленным из цифр числа number, но взятых в обратном порядке (для
данного задания обратное число – это 321).
*/

public class Task2 {
    public static void main(String[] args) {
        int num = 123;
        int reversed = 0;
        int number = num;
        while(number != 0) {
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reversed);
        System.out.println("Subtraction: " + (reversed - num));
    }
}
