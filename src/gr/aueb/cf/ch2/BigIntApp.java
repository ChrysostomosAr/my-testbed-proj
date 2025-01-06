package gr.aueb.cf.ch2;
/**
 * Biginteger class demo.
 */


import java.math.BigInteger; // είναι μέσα στο java math αλλιώς κοκκινίζει ο κώδικας

public class BigIntApp {
    public static void main(String[] args) {
      BigInteger bigNum1 = new BigInteger("1212323434343444323"); //στις κλάσεις έχουμε αυτού του είδους αρχικοποίηση
      BigInteger bigNum2 = new BigInteger("3232938238237947434882");
      BigInteger result;

      result = bigNum1.add(bigNum2); //τελεστής + έχουμε στις κλάσεις .add έτοιμη λειτουγηκότητα πρόσθεσης
         System.out.printf("%,d", result);
    }
}
