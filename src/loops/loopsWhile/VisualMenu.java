package loops.loopsWhile;
import java.util.Scanner;

public class VisualMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option !=3){
            System.out.println("""
                    Type the option you want:\
                    
                     1. Calculate tax\
                    
                     2. Deposite salary\
                    
                     3. Exit"""
            );
            option = scanner.nextInt();
        }
        System.out.println("you're out!");
    }
}
