package edu.samela.logicaprogramacao.conditionals.conditionalsifelse;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE NEW LOGIN PAGE!");
        System.out.println("Please enter your login: ");
        String login = scanner.next();
        if (login.isEmpty() || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrator")){
            System.out.println("Invalid User!");
        }else{
            System.out.println(login + " registered successfully!!");
        }
    }
}
