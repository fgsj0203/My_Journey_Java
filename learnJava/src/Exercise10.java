import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables
         */
        Integer number;

        /**
         * Process
         */
        System.out.println("Number: ");
        number = sc.nextInt();

        /**
         * Logical decision
         */
        if (number >= 100 && number <= 200){
            System.out.println("Number valid -> " + number);
        } else {
            System.out.println("Number invalid -> " + number);
        }
    }
}
