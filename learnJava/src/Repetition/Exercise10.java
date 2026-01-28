package Repetition;

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
        Double salaryBrute = -1.0;

        /**
         * Repetition logical
         */
        while (true){
            System.out.println("Salary brute: ");
            salaryBrute = sc.nextDouble();

            if (salaryBrute < 0){
                System.out.println("Finishing system...");
                break;
            }

            Double discountInss = (salaryBrute * 0.11);
            Double salaryLiquid = salaryBrute - discountInss;

            System.out.println("Discount of INSS: R$ " + discountInss);
            System.out.println("salary liquid: R$ " + salaryLiquid);

        }
    }
}
