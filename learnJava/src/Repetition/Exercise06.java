package Repetition;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables
         */
        Integer number, fatorial = 0, fatorialCounter= 1;

        /**
         * Process
         */
        System.out.println("Number: ");
        number = sc.nextInt();

        /**
         * Logical repetition
         */
        while (fatorialCounter >= 1) {
            fatorial = number * (number - 1);
            fatorialCounter--;
        }
        System.out.printf("Fatorial of number: %d", fatorial);
    }
}
