package gr.aueb.cf.ch2.ch3;

import java.util.Scanner;
/**
 * O Χρήστης θα δινει
 * τους συνολικους βαθμους μαθηματων
 * το πληθος των μαθηματων
 *
 * θα υπολογιζει τον μεσο ορο και θα χαρακτηριζει
 * αριστα αν ο μεσος ορος ειναι >= 9
 * πολυ καλα
 * αν ο μεσος ορος ειναι >= 7
 * καλως
 * αν ο μεσος ορος ειναι >= 5
 * αποτυχια αν ειναι <=5
 */

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be zero");
            System.exit(1);

        }
        System.out.println("Please insert courses count");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be negative or zero.");
            System.exit(1);

        }
        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal than 10.");
            System.exit(1);


            if (average >= 9) {
                System.out.println("Excellent");
            } else if (average >= 7) {
                System.out.println("Very Good");
            } else if (average >= 5) {
                System.out.println("Good");
            } else if (average <= 5) {
                    System.out.println("Failure");

                }
                }

            }
        }
