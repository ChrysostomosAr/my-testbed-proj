package gr.aueb.cf.ch6;

/**
 * Array search με μέθοδο.
 */
public class ArraySearchWithMethod {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};
       int position;

       position = getPosition(arr, 5);
       if (position == -1) { //διαφορετικά δίνει -1 μή έγκυρη τιμή του πίνακα
           System.out.println("Το στοιχείο δεν βρέθηκε");
       } else {
           System.out.printf("Value: %d, Position: %d" , arr[position], (position + 1));
       }
    }
    public static int getPosition(int[] arr, int value) {
       int positionToReturn = -1;

       for (int i =0; i < arr.length; i++) {
           if (arr[i] == value) {
               positionToReturn = i;
               break;
           }
       }
       return positionToReturn;
    }
}
