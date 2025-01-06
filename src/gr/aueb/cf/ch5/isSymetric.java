package gr.aueb.cf.ch5;

public class isSymetric {
    public static void main(String[] args) {
    }
    public static boolean isSymetric(int[] arr) {
        boolean isSymetric = true;
        for (int i = 0, j = arr.length -1; i <j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymetric = false;
                break;
            }
        }
     return isSymetric;
    }
    // deitel's way
    public static boolean isArraySymetric(int[] arr) {

        boolean isSymetric = true;
        int n = arr.length -1;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] !=arr[n - i]) {
                isSymetric = false;
                break;
            }
        }
     return isSymetric;
    }
}
