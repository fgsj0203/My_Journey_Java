import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables
         */
        Double coinMoney;
        Integer operationConverter;

        /**
         * Decision switch
         */
        System.out.println("Enter with value using type coin Real: R$ ");
        coinMoney = sc.nextDouble();

        System.out.println("Choice operation converter coin");
        System.out.println("1 - Dollar");
        System.out.println("2 - Euro");
        System.out.println("3 - Pound");
        operationConverter = sc.nextInt();

        switch (operationConverter){
            case 1:
                System.out.printf("Value of Real -> Dollar R$ %.2f", coinMoney / 5.29);
                break;
            case 2:
                System.out.printf("Value of Real -> Euro %.2f ", coinMoney / 6.20);
                break;
            case 3:
                System.out.printf("Value of Real -> Pound %.2f", coinMoney / 7.22);
                break;
        }
    }
}
