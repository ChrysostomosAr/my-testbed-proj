package gr.aueb.cf.ch3;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
import java.awt.*;

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 12;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <=0) {
            System.out.println("Courses must not be negative to zero.");
            System.exit(1);
        }
          average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error, The average must be less or equal than 10");
            System.exit(1);
            }
        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >=7) {
            System.out.println("Very good");
        } else if (average >=5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }

    }
}
