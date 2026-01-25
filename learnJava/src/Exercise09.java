import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables
         */
        Double height, weight, imc;

        /**
         * Process
         */
        System.out.println("Height people: ");
        height = sc.nextDouble();

        System.out.println("Weight people: ");
        weight = sc.nextDouble();

        imc = weight / (height * height);

        /**
         * Logical decision
         */
        if (imc < 18.5){
            System.out.println("IMC healthy");
        } else if (imc < 24.9) {
            System.out.println("IMC Normal");
        } else {
            System.out.println("IMC obesity");
        }
    }
}
