package conditionals.switchcase;

import java.util.Scanner;

public class BankInterestAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO bank account interest simulator!");
        System.out.println("bank account types:"
                +"\n saving account"
                +"\n current account"
                +"\n investment account");
        System.out.println("Please enter the type you want: ");
        String account = scanner.nextLine();
        switch (account){
            case "saving account":
                System.out.println("Interest rate of 0.05%");
                break;
            case "current account":
                System.out.println("Interest rate of 0.02%");
                break;
            case "investment account":
                System.out.println("Interest rate of 0.1%");
                break;
            default:
                System.out.println("Invalid Account!");
        }

    }

}
