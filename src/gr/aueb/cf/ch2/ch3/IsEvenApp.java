package gr.aueb.cf.ch2.ch3;
import java.util.Scanner;
/**
 * Ελέγχει εάν ένας ακέραιος είναι άρτιος
 */
public class IsEvenApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false; // Ελέγχει εάν η συνθήκη που θέλουμε να εξετάσουμε είναι αληθής ή ψευδής ο αλφαριθμητικός boolean έχει το ίδιο όνομα με το όνομα της κλάσης.

        System.out.println("Please insert a number (integer)");
        num = scanner.nextInt(); //συνδέει το num του χρήστη με την κλάση scanner για να μπορέσει να δώσει ο χρήστης ακέραιο.

        isEven = (num % 2) == 0; //εξετάζει εάν η συνθήκη δηλαδή το isEven (αν είναι άρτιος με το num που θα δώσει ο χρήστης διερείται ακριβώς με το 2

        System.out.println("The number isEven : " + isEven);


    }
}
