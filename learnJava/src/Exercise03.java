import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables section
         */
        Integer numberOne, numberTwo;

        /**
         * Logical Structure
         */
        System.out.println("Number one: ");
        numberOne = sc.nextInt();

        System.out.println("Number two: ");
        numberTwo = sc.nextInt();

        /**
         * Decision structure
         */
        if (numberOne > numberTwo){
            System.out.println("Number one > number two!");
        } else {
            System.out.println("Number two > number one!");
        }
    }
}
