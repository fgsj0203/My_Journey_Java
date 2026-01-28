package Repetition;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables
         */
        Integer initialNumber, finalNumber, sumNumbers = 0;

        /**
         * Process
         */
        System.out.println("Number initial interval: ");
        initialNumber = sc.nextInt();

        System.out.println("Number final interval: ");
        finalNumber = sc.nextInt();

        for (int i = initialNumber; i < finalNumber; i++) {
            if (i % 2 == 1){
                sumNumbers += i;
            }
        }
        System.out.println("Sum of numbers odd: " + sumNumbers);
    }
}
