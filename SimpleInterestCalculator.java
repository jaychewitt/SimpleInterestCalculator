package sicalculator;


public class SimpleInterestCalculator extends Calculators {

    // Creating a menu
    public static void MenuOpt(){
        System.out.println("1. Calculate My Simple Interest"); // Menu option 1
        System.out.println("2. Calculate My Time"); // Menu option 2
        System.out.println("3. Calculate My Rate"); // Menu option 3
        System.out.println("4. Calculate My Principal"); // Menu option 4
        System.out.println(" ");
        System.out.println("Enter a Number: ");

        int OPT = GET_INFO.nextInt();

        if (OPT == 1) {
            SimpleInterest();
            System.out.println(" ");
            System.out.println(" ");
            MenuOpt();
        }else if (OPT == 2){
            TimeAmount();
            System.out.println(" ");
            System.out.println(" ");
            MenuOpt();
        }else if (OPT == 3){
            RateAmount();
            System.out.println(" ");
            System.out.println(" ");
            MenuOpt();
        }else if (OPT == 4){
            PrincipalAmount();
            System.out.println(" ");
            System.out.println(" ");
            MenuOpt();
         }else{
            System.out.println("NOT VALID!!!");
            System.out.println(" ");
            System.out.println(" ");
            MenuOpt();
        }
    }
    public static void main(String[] args){
        MenuOpt();
    }
}
