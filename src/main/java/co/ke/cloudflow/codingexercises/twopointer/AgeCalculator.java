package co.ke.cloudflow.codingexercises.twopointer;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("Elon Musk is " + calculateAge(2011, 40));
    }

    public static int calculateAge(int year, int ageAtYear) {

        int currentYear = 2025;
        int difference = currentYear - year;
        return ageAtYear + difference;
    }


}
