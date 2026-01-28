package Repetition;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables
         */
        Integer numberInitial = -1;


        /**
         * Logical repetition
         */
        do {
            System.out.println("Number: ");
            numberInitial = sc.nextInt();
        } while (numberInitial < 0 || numberInitial > 10);
    }
}
