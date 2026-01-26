import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables section
         */
        Double valueBuy;

        /**
         * Process
         */
        System.out.println("Value of buy: ");
        valueBuy = sc.nextDouble();

        /**
         * Logical decision
         */
        if (valueBuy > 500){
            System.out.printf("The value final of buy: R$ %.2f ", (valueBuy - (valueBuy * 0.10)));
        } else {
            System.out.printf("The value final of buy: R$ %.2f ", (valueBuy - (valueBuy * 0.05)));
        }
    }
}
