package loops.loopsFor;

public class MultiplicationTableComplete {
    public static void main(String[] args) {

        for (int counter = 1; counter <=10 ; counter++) {
            System.out.println("Table of the number " + counter);
            for (int i = 1; i <=10; i++) {
                System.out.println(counter + " x " + i + " = " + (counter *i));
            }
        }
    }
}
