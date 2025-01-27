package loops.breakexercise;

import java.util.Scanner;

public class BreakExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the car: ");
        double valueOfCar = scanner.nextInt();
        for (int installment = 1; installment <= valueOfCar; installment++) {
            double valueOfInstallment = valueOfCar / installment;
            if (valueOfInstallment < 1000) {
                break;
            }
            System.out.println("Installment " + installment + " R$ " + valueOfInstallment);
        }
    }
}
