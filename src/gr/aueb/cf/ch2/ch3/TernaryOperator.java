package gr.aueb.cf.ch2.ch3;
import java.util.Scanner;
/**
 * Demo of ternary operator on a common
 * abs (num) always positive
 * use case , that is contitional assigment.
 */



public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs =0;

        System.out.println("Please enter a num");
        num = scanner.nextInt();

        if ( num >=0) abs = num;
        else abs = -num;

        System.out.println("abs:" + abs);

    }
}
