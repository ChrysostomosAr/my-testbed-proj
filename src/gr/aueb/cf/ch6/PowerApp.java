package gr.aueb.cf.ch6;
/*
Υπολογίζει το a^b, π.χ το 2^3 = 8.
Διαβάζει το a και b από τον χρήστη.
 */


import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0 ;
        int result = 1;

        System.out.println("Please insert a, b (ints)");
        a = in.nextInt();
        b = in.nextInt();

      for (int i = 1; i <=b; i++) {
          result = result * a;
      }
    System.out.printf("%d^%d = %d", a, b, result);
    }
}
