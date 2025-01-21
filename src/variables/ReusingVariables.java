package variables;

public class ReusingVariables {
    public static void main (String[] args){
        float salary = 5000;
        double result = salary * 0.3;
        System.out.println(result);
        result = salary * 0.15;
        System.out.println(result);
        result = salary * 0.05;
        System.out.println(result);
    }
}
