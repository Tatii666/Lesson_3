package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_2 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        arrayMinMax();

    }

    public static void invertArray() {

        int[] myArr = {1, 1, 0, 0, 1, 1, 0};

        for(int i = 0; i < myArr.length; i++){
            if (myArr[i] == 0){
                myArr[i] = 1;
            } else {
                myArr[i] = 0;
            }
        }


        System.out.println(Arrays.toString(myArr));
    }

    public static void fillArray() {
        int[] myArray = new int[8];
        for(int i = 0, value = 0; i < myArray.length; value +=3, i ++) {
            myArray[i] = value;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++) {
            if(i < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int[][] myArr = new int[4][4];
        int lastNumb = myArr.length - 1;
        for (int i = 0; i < myArr.length; i++){
            myArr[i][i] = myArr[i][lastNumb - i] = 1;
        }
        for (int i = 0; i < myArr.length; i++){
            System.out.println(Arrays.toString(myArr[i]));
        }
    }

    public static void arrayMinMax() {
        Random random = new Random();
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        int min = arr2[0];
        int max = arr2[arr2.length - 1];
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }



}
