package com.epam.lesson5;

/*Задание 1 - Обработка без ветвлений:
Напишите программу на языке Java, которая создает массив любого типа, а
затем выводит его в консоль в прямом и обратном порядках.*/

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = createArray(50);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    static int[] createArray(int size){
        if (size <= 0){
            System.out.println("Operation can not be complete due to an invalid size specified.");
        }
        int[] array  = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100) - 25;
        }
        return array;
    }

    static int[] reverseArray(int[] array){
        if (array.length < 1){
            System.out.println("Operation can not be complete due to an empty array.");
        } else {
            int half = array.length / 2;
            for (int i = 0; i <= half; i++){
                int oppositeIndex = array.length - i - 1;
                int temp = array[i];
                array[i] = array[oppositeIndex];
                array[oppositeIndex] = temp;
            }
        }
        return array;
    }
}
