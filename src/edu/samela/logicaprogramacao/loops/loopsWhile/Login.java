package edu.samela.logicaprogramacao.loops.loopsWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctLogin = "sam-duarte";
        final int correctPassword = 12354;
        boolean showLoginMenu =  true;
        while (showLoginMenu) {
            System.out.println("Enter your Login: ");
            String login = scanner.next();
            System.out.println("Enter your Password: ");
            int password = scanner.nextInt();
            if (correctLogin.equals(login) && (password == correctPassword)){
                System.out.println("----ACCESS GRANTED!----");
                showLoginMenu = false;
                break;
            }
                System.out.println("DENIED ACCESS!");

        }
        System.out.println("----PROGRAM FINISHED----");
    }
}
