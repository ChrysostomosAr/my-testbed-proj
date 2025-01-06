package gr.aueb.cf.ch2.ch3;
import java.util.Scanner;


/**
 *Αντιστρεφει εναν ακεραιο για παραδειγμα το 312 θα γινει 213
 */

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int reversed = 0;
        int tempNUM = 0;
        int reverse = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer");
        num = scanner.nextInt();

        //todo
        tempNUM = num;
        while (tempNUM >0) {
            rightDigit = tempNUM % 10;
            reversed = reversed * 10 + rightDigit;
            tempNUM /= 10; //tempNum = tempNum / 10
        }
      System.out.println("The reversed number is: " +reversed);
    }
}
