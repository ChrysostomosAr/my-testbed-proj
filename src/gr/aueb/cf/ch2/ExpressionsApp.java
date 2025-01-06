package gr.aueb.cf.ch2;

/**
 * Expressions demo
 */
public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 10;   //Ακέραιος
        int num2 = 20;   //Ακέραιος
        int sum = 0;     //Άθροισμα
        int sub = 0;     //Αφαίρεση
        int mul = 0;     //Πολλαπλασιασμός
        int div = 0;     //Διαίρεση
        int mod = 0;     //Υπόλοιπο
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

          result1 = num1++; //έστω ότι num1 = 8 , result = 8 , num1 = 9
          result2 = ++num2; //έστω ότι num2 = 8 , result = 8 , num2 = 9 pre-increment

        //Εάν θέλω μοναδιαία αύξηση το κάνω με num1++
        //result = result + 1; & result += 1; είναι το ίδιο πράγμα
    }
}