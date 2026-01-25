import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables section
         */
        Integer agePeople;

        /**
         * Process data
         */
        System.out.println("Age of people: ");
        agePeople = sc.nextInt();

        /**
         * Logical decision
         */
        if (agePeople > 0 && agePeople <= 12){
            System.out.println("Children");
        } else if (agePeople <= 17 ) {
            System.out.println("Teen");
        } else if (agePeople <= 59) {
            System.out.println("Adult");
        } else {
            System.out.println("Old people");
        }
    }
}
