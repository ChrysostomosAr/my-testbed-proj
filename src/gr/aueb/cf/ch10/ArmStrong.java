package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3
 */

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int numberOfDigits;

        System.out.println("Enter a number");
        num = scanner.nextInt();
        int sumOfcubes = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfcubes += Math.pow(digit, 3);
            num = num / 10;
        }
        System.out.println("Sum of cubes of digits: " + sumOfcubes);
        scanner.close();
    }
}

