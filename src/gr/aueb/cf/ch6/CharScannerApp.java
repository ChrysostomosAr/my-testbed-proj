package gr.aueb.cf.ch6;

import java.util.Scanner;

//Διαβάζει char με Scanner
public class CharScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        inputChar = in.nextLine().charAt(0);

        System.out.println("Input char: " +inputChar);
    }
}
