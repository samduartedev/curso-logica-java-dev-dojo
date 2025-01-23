package arrays.onedimensional;

import java.util.Scanner;

public class ArraysExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Array 1, position: " + i + ": ");
            array1[i] = scanner.nextInt();
            System.out.println(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Array 2, position: " + i + ": ");
            array2[i] = scanner.nextInt();
            System.out.println(array1[i]);
        }
        System.out.println("Array 3 multiplied");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i]*array2[i];
            System.out.print(array3[i]+ " ");
        }
    }
}
