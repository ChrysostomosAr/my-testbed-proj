package gr.aueb.cf.ch8;

/*
exceptions div by 0
 */


public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result =0;

        result = num1 / num2;
        System.out.println("this line is not executed");
    }

}
