package gr.aueb.cf.ch7;
import java.util.Scanner;

public class IOStrApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two integers");
        s1 = in.next(); //διαβάζει μέχρι να βρει whitespace
        s2 = in.nextLine(); //διαβάζει μέχρι να βρει \n

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s2: %s\n", s2);

    }
}
