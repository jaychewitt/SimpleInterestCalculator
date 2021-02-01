package sicalculator;

import java.util.Scanner;

// Main Calculator class
class Calculators {
    static Scanner GET_INFO = new Scanner(System.in);
    final static int PERCENT = 100;


    // Calculator function for calculating Simple Interest
    public static void SimpleInterest() {

        System.out.println("Enter Your Principal: "); //Getting User Principal
        double PRINCIPAL = GET_INFO.nextDouble();

        System.out.println("Enter Your rate: "); // Getting User Rate
        double RATE = GET_INFO.nextDouble();

        System.out.println("Enter Your time(years): "); // Getting User Years/Time
        double TIME = GET_INFO.nextDouble();

        // Formula for calculating Simple Interest
        double FORMULA1 = PRINCIPAL + TIME + RATE;
        double FORMULA2 = FORMULA1 / PERCENT;

        System.out.println("Your Simple interest for " + TIME + "yr is " + "$" + FORMULA2);
    }


    // Principal Calculator
    public static void PrincipalAmount() {

        System.out.println("Enter Your Simple Interest: "); //Getting User Principal
        double SimpleInterest = GET_INFO.nextDouble();

        System.out.println("Enter Your rate: "); // Getting User Rate
        double RATE = GET_INFO.nextDouble() / PERCENT;

        System.out.println("Enter Your time(years): "); // Getting User Years/Time
        double TIME = GET_INFO.nextDouble();

        // Formula for calculating Simple Interest
        double FORMULA1 = TIME * RATE;
        double FORMULA2 = SimpleInterest / FORMULA1;

        System.out.println("Your Principal was " + "$" + FORMULA2);
    }



    // Time calculator
    public static void TimeAmount() {

        System.out.println("Enter Your Principal: "); //Getting User Principal
        double PRINCIPAL = GET_INFO.nextDouble();

        System.out.println("Enter Your rate: "); // Getting User Rate
        double RATE = GET_INFO.nextDouble() / PERCENT;

        System.out.println("Enter Your Simple Interest: "); // Getting User Simple Interest
        double SimpleInterest = GET_INFO.nextDouble();

        // Formula for calculating Time
        double FORMULA1 = PRINCIPAL * RATE;
        double FORMULA2 = SimpleInterest / FORMULA1;

        System.out.println("Your Time was " + FORMULA2 + "yr");
    }


    // Rate calculator
    public static void RateAmount() {

        System.out.println("Enter Your Principal: "); //Getting User Principal
        double PRINCIPAL = GET_INFO.nextDouble();

        System.out.println("Enter Your time: "); // Getting User Time
        double TIME = GET_INFO.nextDouble();

        System.out.println("Enter Your Simple Interest: "); // Getting User Simple Interest
        double SimpleInterest = GET_INFO.nextDouble();

        // Formula for calculating Rate
        double FORMULA1 = PRINCIPAL * TIME;
        double FORMULA2 = SimpleInterest / FORMULA1;

        System.out.println("Your Rate for  " + TIME + "yr " + FORMULA2 + "%");
    }
}
