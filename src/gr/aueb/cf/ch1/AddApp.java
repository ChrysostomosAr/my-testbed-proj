package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers.
 * and prints the result is printed at console
 * (standard output)
 */
public class AddApp { //pascal case

    public static void main(String[] args) {
        // Δήλωση και Αρχικοποίηση Μεταβλητών
        //Σώμα της κλάσης από την main ξεκινά και εκτελείται το πρόγραμμα
       int num1 = 5; //hardcode δεδομένα επειδή τα δίνει ο προγραμματιστής
       int num2 = 12;
       int result= 0;

       //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι:" + result);
        System.out.println("Το άθροισμα των " + num1 + "," + num2 +  " είναι ίσο με:" + result );
        System.out.printf("Το άθροισμα των %d , %d είναι ίσο με: %d", num1, num2, result);
        //Το %d είναι ένας placeholder και περιμένει έναν ακέραιο
        //το %d θέλει printf και όχι println όπου f = formated
        //to %d/n αλλάζει γραμμή σαν την println

    }
}
