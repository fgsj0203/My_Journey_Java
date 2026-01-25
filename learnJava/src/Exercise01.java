import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables
         */
        float balance_money;
        float sake_money;

        /**
         * Process
         */
        System.out.println("Value of balance: ");
        balance_money = sc.nextFloat();

        System.out.println("Value of sake money: ");
        sake_money = sc.nextFloat();

        /**
         * Logical structure
         */
        if (balance_money >= sake_money){
            System.out.println("Sake authorized");
        } else {
            System.out.println("Sake unauthorized");
        }

    }
}
