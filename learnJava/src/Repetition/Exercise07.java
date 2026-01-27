package Repetition;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variable
         */
        Integer amountNumber, number, sumNumber = 0;
        Double averageNumbers;

        /**
         * Process numbers
         */
        System.out.println("What a amount number: ");
        amountNumber = sc.nextInt();

        for (int i = 0; i < amountNumber; i++) {
            System.out.println("Number: ");
            number = sc.nextInt();
            sumNumber += number;
        }
        System.out.println("*** The average of numbers ***");
        averageNumbers = (double) (sumNumber / amountNumber);

        System.out.println("Result: " + averageNumbers);
    }
}
