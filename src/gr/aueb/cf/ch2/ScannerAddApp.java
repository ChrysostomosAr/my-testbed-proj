package gr.aueb.cf.ch2;

import java.util.Scanner; //χρησιμοποιούμε τα fully names

/**
 * Scanner Demo , Reads two integers from the
 * std input (keyboard) and calculates the result.
 */
public class ScannerAddApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση δεδομένων
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in); //system in όπου in είναι το keyboard (input)

        //Εντολές
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum =  num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το άθροισμα των %d και %d είναι ίσο με:" +sum );

    }
}
