import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /**
         * ImportingLibrary
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables
         */
        Integer number;

        /**
         * Logical Structure
         */
        System.out.println("Number: ");
        number = sc.nextInt();

        /**
         * Decision logical
         */
        if (number % 2 == 0){
            System.out.println("Number is pair!");
        } else {
            System.out.println("Number is odd!");
        }
    }
}
