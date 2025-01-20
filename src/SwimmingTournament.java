import java.util.Scanner;

public class SwimmingTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age <=10) {
            System.out.println(name + " will participate in the Children's category");
        } else if (age >=11 && age <=15){
            System.out.println(name + " will participate in the Youth category");
        }else if (age >=16 && age <=19){
            System.out.println(name + " will participate in the Pre-Adult category");
        }else if (age >=20){
            System.out.println(name + " will participate in the Adult category");
        }
    }
}
