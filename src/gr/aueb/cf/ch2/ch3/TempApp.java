package gr.aueb.cf.ch2.ch3;

/**
 * Να δίνει ο χρήστης μία θερμοκρασία και εμφανίζει κατάλληλο μνμα αν είναι true or false
 */
import java.util.Scanner;

public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBellowZero;

        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isTempBellowZero = temp < 0;

        System.out.println("Temperature is bellow zero: " + isTempBellowZero);
    }
}
