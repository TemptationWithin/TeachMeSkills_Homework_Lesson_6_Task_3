package com.homeWork_Lesson_6_Task_3.arrayTransposition;

public class ArrayTransposition {
    public static int[][] transposition(int[][] array){

        int[][] resultArray = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {                            // transposition
            for (int j = 0; j < array[0].length; j++) {
                resultArray[j][i] = array[i][j];
            }
        }

        System.out.println("Transposited Array:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < resultArray[0].length; j++) {
                System.out.print(resultArray[i][j] + "  ");
            }
        }
        return resultArray;
    }
}
