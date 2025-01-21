package conditionals.conditionalsifelse;

public class SalaryCalculation {
    public static <string> void main(String[] args) {
        float salary = 4200F;
        float result;
        String percentage;
        if (salary >4500) {
            result = salary*0.3F;
            percentage = "30% is equal to ";
        } else {
            result = salary*0.15F;
            percentage = "15% is equal to ";
        }
        System.out.println( "the value of " + percentage + result);
    }
}
