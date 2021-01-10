package com.homeWork_Lesson_6_Task_3;

import com.homeWork_Lesson_6_Task_3.arrayTransposition.ArrayTransposition;

import java.util.Scanner;

/**
 * ЗАДАНИЕ 3
 * 	Написать метод для транспозиции массива.
 * 	Т.е. метод на вход принимает массив из n строк и m столбцов, а на выход возвращает массив из m строк и n столбцов.
 *
 * 	Что практикуем в этом задании:
 * 		- построение алгоритмов
 * 		- управляющие конструкции, операции ветвления
 */
public class HomeWork_Lesson_6_Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                   // Scanner open
        System.out.println("Press number of lines of array: ");
        int numbLines = scanner.nextInt();
        System.out.println("Press number of columns of array: ");
        int numbColumns = scanner.nextInt();

        int[][] array = new int[numbLines][numbColumns];                            // creating array

        System.out.println("Initialize the array: ");
        for (int i = 0; i < numbLines; i++) {                                       // initialize array
            for (int j = 0; j < numbColumns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        scanner.close();                                                            // closing scanner

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Original array:");
        for (int i = 0; i < numbLines; i++) {
            System.out.println(" ");
            for (int j = 0; j < numbColumns; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        ArrayTransposition.transposition(array);

    }
}
