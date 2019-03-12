/*Задание 2 - Обработка с разветвлением:
Напишите программу на языке Java, которая создает массив любого типа, а
затем вычисляет количество и сумму нечетных элементов массива.*/

package com.epam.lesson5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = createArray(10);
        System.out.println(Arrays.toString(array));
        int[] odds = getOddElements(array);
        System.out.println(Arrays.toString(odds));
        System.out.println("Number of odd elements: " + oddsCount(array));
        System.out.println("Sum of odd elements: " + getArraySum(odds));
    }

    static int[] createArray(int size){
        if (size <= 0){
            System.out.println("Operation can not be complete due to an invalid array size specified.");
        }
        int[] array  = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100) - 20;
        }
        return array;
    }

    static int oddsCount(int[] array){
        int oddsCount = 0;
        for (int i = 0; i <array.length; i++){
            if (array[i] % 2 != 0){
                oddsCount++;
            }
        }
        return oddsCount;
    }

    static int[] getOddElements(int[] array){
        int size = oddsCount(array);
        int[] oddsArray = new int[size];
        int j = 0;
        for (int i = 0; i <array.length; i++){
            if (array[i] % 2 != 0){
                oddsArray[j] = array[i];
                j++;
            }
        }
        return oddsArray;
    }

    static int getArraySum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
