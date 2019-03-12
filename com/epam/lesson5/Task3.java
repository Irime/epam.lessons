/*
    Задание 3 – Создание третьего массива известной длины:
    Напишите программу на языке Java, которая создает два массива
    одинаковой размерности, а затем создает третий такой же размерности и
    заполняет его попарной суммой элементов из первых двух.
 */

package com.epam.lesson5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = createArray(12);
        int[] array2 = createArray(12);
        System.out.println("First Array: " + Arrays.toString(array1));
        System.out.println("Second Array: " + Arrays.toString(array2));
        System.out.println("Arr Pair Sum: " + Arrays.toString(getArraysPairSum(array1, array2)));
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

    static int[] getArraysPairSum(int[] firstArr, int[] secondArr){
        if(firstArr == null){
            return secondArr;
        }
        else if(secondArr == null){
            return firstArr;
        }

        if (firstArr.length != secondArr.length){
            System.out.println("Arrays should be of the same length!");
            return null;
        }
        int size = firstArr.length;
        int[] pairSumArray = new int[size];
        for (int i = 0; i < size; i++){
            pairSumArray[i] = firstArr[i] + secondArr[i];
        }
        return pairSumArray;
    }
}
