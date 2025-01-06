package gr.aueb.cf.ch2.ch3;

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        while ((inputNum = in.nextInt()) >= 0) {
            positivesCount++;
            System.out.println("Please insert a num");

        }
        System.out.println("Positives count: " + positivesCount);
    }
}

