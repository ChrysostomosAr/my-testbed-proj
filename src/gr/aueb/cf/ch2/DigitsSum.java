package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       int leftDigit = 0;
       int rightDigit = 0;
       int inputNum;
       int sum = 0;

       System.out.println("please insert a two digit integer");
       inputNum =  in.nextInt();

       leftDigit =  inputNum / 10;
       rightDigit = inputNum % 10;
       sum = leftDigit + rightDigit;

       System.out.printf( "input num: %d , Left digit: %d, Right digit: %d, Sum: %d",
               inputNum, leftDigit, rightDigit, sum);


    }
}
