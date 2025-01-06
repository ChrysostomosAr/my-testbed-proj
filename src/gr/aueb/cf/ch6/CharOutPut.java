package gr.aueb.cf.ch6;
//char output

public class CharOutPut {
    public static void main(String[] args) {
        char ch1 = 'S';
        char ch2 = '8';

       // System.out.println("char: " + ch1 + ", ordinal:" +(int) ch1);
       // System.out.println("char: " + ch2 + ", ordinal:" +(int) ch2);

        System.out.printf("char: %c,  ordinal:%d\n" ,  ch1, (int) ch1); //Παντα printf για να επιτρεπει την μετατροπη με τα %d %c
        System.out.printf("char: %c,  ordinal: %d\n" , ch2, (int) ch2);
     }
  }
