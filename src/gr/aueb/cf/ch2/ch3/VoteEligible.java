package gr.aueb.cf.ch2.ch3;
import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18.
 * Ελέγχει αν μια ηλικία έχει δικαίωμα
 * να ψηφίσει
 */


public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEligible = false;
        final int VOTING_AGE = 18; // το final int δηλώνει στο keyboard ότι η συνθήκη δεν μπορεί να τροποποιηθεί αργότερα.

        int age = 0;
        System.out.println("Enter your age");
        age = scanner.nextInt();  // Reads an integer value from the user

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible:" + isEligible);


    }
}
