package gr.aueb.cf.ch6;
/*
Δήλωση και αρχικοποίηση ενός πίνακα
πως κανάνουμε populate
- new
- unsized init
- array initializer
- print a στοιχεία ενός πίνακα
 */


public class ArrayInit {
    public static void main(String[] args) {
        int[] arr = new int [3]; // Δηλώνουμε εναν πίνακα με αγκύλες

        //populate αρχικοποίση τιμών στους πίνακες διαφορετικά ειναι by default = 0
        arr[0] = 5;  // arr 0 είναι η πρώτη θέση του πίνακα..
        arr[1] = 10;
        arr[2] = 4;

        // int[] arr = new int [3]; declare and init
        // int[] arr2 = {1,2,3,4,5 }; unsized init
        // int[] arrr3 = new int[] {1,2,3,4,5} array initializer


        //traverse
        for ( int i = 0; i < arr.length; i++) { //το array.length - 1 είναι η τελευταία θέση της μνήμης
            System.out.print(arr[i] + " ");
        }

        //enhanced for
     //for (int el : arr3) {
       //  System.out.print(el + " ");
      }
    }

