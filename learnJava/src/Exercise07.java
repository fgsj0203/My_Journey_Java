import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables section
         */
        Integer year;

        /**
         * Process
         */
        System.out.println("Input a year: ");
        year = sc.nextInt();

        /**
         * Logical decision
         */
        if (year % 4 == 0){
            System.out.println("Year is leap year");
        } else {
            System.out.println("Year is not leap year");
        }
    }
}
