package gr.aueb.cf.ch6;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
it creates a fresh copy of an
 input array
@param source the source array.
@return the copied array.
 */
public class ArrayDeepCopy {
    public static void main(String[] args) {
    }

    public static int[] arrDeepCopy(int[] source) {
        int[] destination = new int[source.length];
        for (int i = 0; i< source.length; i++) {
        destination[i] = source[i];
    }
//        System.arraycopy(source, 0 destination, 0, source.length);
//        destination = Arrays.copyOf(source, source.length);
//        Arrays.copyOfRange(source, 0, source.length);
        return destination;
    }
}
