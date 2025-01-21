package Loops.LoopsWhile;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE ODDS COUNTER :)");
        System.out.println("------------------------------------------------");
        System.out.println("PLEASE ENTER THE LAST NUMBER YOU WANT TO COUNT TO: ");
        System.out.println("----------------------------------------------");
        int lastnumber = scanner.nextInt();
        int i = 0;
        while (i <= lastnumber){
           if(i % 2 !=0){
               System.out.println(i);

           }
            i++;
        }
    }
}
