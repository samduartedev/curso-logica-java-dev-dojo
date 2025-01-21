package conditionals.conditionalsifelse;

import java.util.Scanner;

public class MilitaryConscription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MILITARY CONSCRIPTION");
        System.out.println("Enter your genre ('F' for Feminine and 'M' for Masculine: ");
        char genre = scanner.next().charAt(0);
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        if (genre == 'M' && age >=18){
            System.out.println("mandatory conscription!");
        } else if ((genre =='M' || genre == 'F') && age <18) {
            System.out.println("Conscription not allowed");
        } else {
            System.out.println("Do you want to join the military?(Y or N) ");
            char answer = scanner.next().charAt(0);
            if (answer == 'Y'){
                System.out.println("Congratulations!");
            }else {
                System.out.println("Hope to see you someday!");
            }
        }
    }
}
