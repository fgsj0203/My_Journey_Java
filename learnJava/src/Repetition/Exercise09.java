package Repetition;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables
         */
        Integer number = 1, numberPotential;


        System.out.println("Number of potential: ");
        numberPotential = sc.nextInt();

        /**
         * Logical repetition
         */
        for (int i = 1; i < numberPotential ; i++) {
            number *= numberPotential;
        }
        System.out.println(number);
    }
}
