import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /**
         * Importing library
         */
        Scanner sc = new Scanner(System.in);

        /**
         * Variables section
         */
        Double noteOne, noteTwo, noteThree, averageNotes;

        /**
         * process data
         */
        System.out.println("Note one: ");
        noteOne = sc.nextDouble();

        System.out.println("Note two: ");
        noteTwo = sc.nextDouble();

        System.out.println("Note three: ");
        noteThree = sc.nextDouble();

        averageNotes = (noteOne + noteTwo + noteThree) / (3.0);

        /**
         * Logical decision
         */
        if (averageNotes >= 7){
            System.out.println("Approved " + averageNotes);
        } else if (averageNotes > 5 && averageNotes <= 6.9) {
            System.out.println("In recovery " + averageNotes);
        } else {
            System.out.println("Reproved " + averageNotes);
        }
    }
}
