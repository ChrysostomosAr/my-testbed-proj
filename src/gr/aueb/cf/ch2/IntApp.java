package gr.aueb.cf.ch2;

/**
 * Εμφανίζει τους τύπους δεδομένων ακεραίων
 * in, byte, short ,long , μαζί με το μέγεθος τους
 * και το range (min, max).
 */
public class IntApp {

    public static void main(String[] args) {
        System.out.printf("int. Size: %d bites, Min: %d, Max: %d\n", Integer.BYTES * 8, Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.printf("byte. Size: %d bites, Min: %d, Max: %d\n", Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short. Size: %d bites, Min: %d, Max: %d\n", Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("long. Size: %d bits, Min: %d, Max: %d\n", Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);




    }
}
