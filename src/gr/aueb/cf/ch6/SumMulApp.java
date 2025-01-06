package gr.aueb.cf.ch6;
/*
Υπολογίζει και εκτυπώνει το άθροισμα και το γινόμενο των πρώτων αριθμών.
 */
public class SumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;        // Μέσα σε αγκύλες η συνθήκη της for
            mul *= i;
        }
// και έπειτα η system.out
        System.out.println("Sum is :" + sum);
        System.out.println("Mul is :" +mul);
    }
}
