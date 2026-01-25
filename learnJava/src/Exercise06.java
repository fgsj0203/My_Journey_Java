import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables
         */
        Integer operatorMath, numberOne, numberTwo;

        /**
         * Process data
         */

        System.out.println("Number one: ");
        numberOne = sc.nextInt();
        System.out.println("Number two: ");
        numberTwo = sc.nextInt();

        System.out.println("*** Choice operation math ***");
        System.out.println("1 - +");
        System.out.println("2 - -");
        System.out.println("3 - x");
        System.out.println("4 - /");

        System.out.println("Choice of operator math: ");
        operatorMath = sc.nextInt();
        switch (operatorMath){
            case 1:
                System.out.println("Sum of two numbers: " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println("Subtraction of two numbers: " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.println("Product of two numbers: " + (numberOne * numberTwo));
                break;
            case 4:
                System.out.println("Division of two numbers: " + (numberOne / numberTwo));
                break;
        }
    }
}
