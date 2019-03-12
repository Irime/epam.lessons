/*Задание 4 – Создание третьего массива неизвестной длины:
Напишите программу на языке Java, которая создает массив любого типа, а
затем разделяет его на два: из положительных и отрицательных элементов.
*/

package com.epam.lesson5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = createArray(12);
        System.out.println("Starting array: " + Arrays.toString(array));
        System.out.println("Positive array: " + Arrays.toString(getPositiveArray(array)));
        System.out.println("Negative array: " + Arrays.toString(getNegativeArray(array)));
    }

    static int[] createArray(int size){
        if (size <= 0){
            System.out.println("Operation can not be complete due to an invalid array size specified.");
            return null;
        }
        int[] array  = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100) - 55;
        }
        return array;
    }

    static int[] getPositiveArray(int[] array){
        if(array.length <= 0){
            System.out.println("An array can not be empty.");
            return null;
        }
        int[] positiveArr = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                positiveArr[j] = array[i];
                j++;
            }
        }
        return positiveArr;
    }

    static int[] getNegativeArray(int[] array){
        if(array.length <= 0){
            System.out.println("An array can not be empty.");
            return null;
        }
        int[] negativeArr = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                negativeArr[j] = array[i];
                j++;
            }
        }
        return negativeArr;
    }
}
