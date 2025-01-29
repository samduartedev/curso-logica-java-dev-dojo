package edu.samela.logicaprogramacao.arrays.onedimensional;

import java.util.Scanner;

public class AverageWithArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[4];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("enter your grade " + (i + 1));
            grades[i] = scanner.nextDouble();
        }
            double average = 0;
        for (int i = 0; i < grades.length; i++) {
            average = average + grades[i];
            System.out.println("grade " + (i + 1) + ": " + grades[i]);
        }
        average = average/ grades.length;
        System.out.println("A média das notas é " + average);
    }
}
