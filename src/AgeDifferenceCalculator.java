public class AgeDifferenceCalculator {
    public static void main (String args[]){
        int firstAge = 20;
        int secondAge = 30;
        int ageDifference = firstAge - secondAge;
        if (ageDifference <0) {
            ageDifference = ageDifference*(-1);
        }

        System.out.println("the age difference is " + ageDifference);
    }
}
