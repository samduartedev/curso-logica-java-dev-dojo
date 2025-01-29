import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number from 1 to 7: ");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("Day 1 is monday!");
        }else if (number == 2){
            System.out.println("Day 2 is tuesday!");
        }else if (number == 3){
            System.out.println("Day 3 is wendnesday!");
        }else if (number == 4){
            System.out.println("Day 4 is thursday!");
        }else if (number == 5){
            System.out.println("Day 5 is friday!");
        }else if (number == 6){
            System.out.println("Day 6 is saturday!");
        }else if(number == 7) {
            System.out.println("Day 7 is sunday!");
        }else{
            System.out.println("INVALID NUMBER!");
        }
    }

