import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Section variables
         */
        String loginFirst = "Francisco", passwordFirst = "Francisco123";
        String login, password;

        /**
         * Compare value String - Login / Password
         */
        System.out.println("What you login: ");
        login = sc.next();

        System.out.println("What you password: ");
        password = sc.next();

        /**
         * Logical structure
         */
        if ((login.equalsIgnoreCase(loginFirst))  && (password.equalsIgnoreCase(passwordFirst))){
            System.out.println("Login and password is equal!");
        } else {
            System.out.println("Login and password is different!");
        }
    }
}
