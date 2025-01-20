public class IncomeTax {
    public static void main(String[] args) {
        double salary = 2000F;
        double result = 0;
        String aliquot = "";
        if (salary <=1903.98){
            System.out.println("FREE");
        } else if (salary >=1903.99 &&  salary <= 2826.65){
            result = salary*0.075;
            aliquot = ("7.5%");
        } else if (salary >= 2826.66 && salary<=3751.05){
            result = salary*0.15;
            aliquot = ("15%");
        } else if (salary >=3751.06 && salary <=4664.68){
            result = salary*0.225;
            aliquot = ("22.5");
        } else {
          result = salary*0.275;
            aliquot = ("27.5%");
        }
        System.out.println("The salary aliquot of " + salary + " is " + aliquot + " resulting " + result);
    }
}
