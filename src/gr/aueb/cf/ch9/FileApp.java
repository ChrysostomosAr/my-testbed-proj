package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {
    public static void main(String[] args) {
        File fd = new File("C:/tmp/file7.txt");
        String Line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                Line = in.nextLine();
                tokens = Line.split("\\s+");


                for (String token : tokens) {
                    System.out.print(token + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}