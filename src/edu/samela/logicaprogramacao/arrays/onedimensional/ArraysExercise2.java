package edu.samela.logicaprogramacao.arrays.onedimensional;

import java.util.Scanner;

public class ArraysExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String array3Multiplied ="";
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Array 1, position: " + i + ": ");
            array1[i] = scanner.nextInt();
            System.out.println("Array 2, position: " + i + ": ");
            array2[i] = scanner.nextInt();
            array3[i] = array1[i] * array2[i];
            array3Multiplied = array3Multiplied + array3[i] + " ";
        }
        System.out.println(array3Multiplied);
    }
}
