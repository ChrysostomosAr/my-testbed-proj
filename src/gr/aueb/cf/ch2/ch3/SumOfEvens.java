package gr.aueb.cf.ch2.ch3;
import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum =  scanner.nextInt();

        //sum
        while
            (i <= inputNum) {
            sum +=i;
            i += 2;
        }



        System.out.println("the sum of even numbers up to" + inputNum + " is:" + sum);

    }
}
