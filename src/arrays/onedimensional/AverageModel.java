package arrays.onedimensional;

import java.util.Scanner;

public class AverageModel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[4];
        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.println("enter your grade " + (i + 1));
            grades[i] = scanner.nextDouble();
            average = average + grades[i];
        }
        average = average/ grades.length;
        System.out.println("Average of grades is "+ average);
    }
}
