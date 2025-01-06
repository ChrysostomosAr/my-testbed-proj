package gr.aueb.cf.ch1;

import java.util.Scanner;
//diavazei treis akeraious ari9mous p anaparistoun hmera mhna etos kai emfanizei se morfh HH/MM/EE

public class PracticeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int formatedYear = 0;

        System.out.print("Please insert integers for day, month, year :");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        formatedYear = year % 100;

        System.out.printf("%02d/%02d/%02dn", day, month, formatedYear);




    }
}
