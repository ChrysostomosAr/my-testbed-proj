package gr.aueb.cf.arrays;

public class getMaxPosition {
    public static void main(String[] args) {
        //Create an array
        int[] numbers = {34, 45, 56, 76, 32, 76, 98};
        
        //Call the method to find the maximum value
        int max = findMax(numbers);
        
        
        //print the result
        System.out.println("the maximum value in the array is:" +max);
    }
 //method to find the maximum value in an array
    public static int findMax(int[] array) {
        //assume the first element is the max
        int max = array[0];
        
  // loop through the array to find the max value
  for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
          max = array[i];
      }
  }
        //return the maximum value
        return max;
    }
}
