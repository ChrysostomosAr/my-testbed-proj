package gr.aueb.cf.ch6;

import java.math.BigInteger;
import java.util.Scanner;

/*
Υπολογίζει το α^b για big integers.
 */
public class BigIntApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please insert two ints");
        a = BigInteger.valueOf(in.nextInt());
        b = BigInteger.valueOf(in.nextInt()); //Το value of μετατρεπει μια τιμη ιντ σε biginteger

      for (int i = 1; i <= b.intValue(); i++) {
          result = result.multiply(a);
      }
     System.out.printf("%d^%d = %,d" ,  a, b, result );
    }
}
