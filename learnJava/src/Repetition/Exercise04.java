package Repetition;

import java.util.Scanner;

public class Exercise04 {
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
         * Repetition logical
         */
        for (int i = 0; i < 11; i++) {
            System.out.printf(" %d " + " x " + " %d " + " = " + " %d \n", number, i, (number * i));
        }
    }
}
