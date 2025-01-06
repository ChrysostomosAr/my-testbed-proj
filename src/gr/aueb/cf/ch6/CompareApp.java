package gr.aueb.cf.ch6;
//chars collation sorting is based on code points
//that is comparisons between chars is based on the
//ordinal numbers (code points) according to UCS-2 (utf -16).
//UCs-2 includes ASCII characters as well as Greek characters in two byte sequences (bit pattern).

public class CompareApp {
    public static void main(String[] args) {
        char a = 'α';
        char b = 'b';
        boolean greekIsGreater = false;

        System.out.println((int) a); //ΜΕΤΑΤΡΟΠΗ ΣΕ INTEGER ΣΥΜΦΩΝΑ ΜΕ ΤΟ UCS-2 / UTF-16 CHARACTER SET
        System.out.println((int) b); //ΜΕΤΑΤΡΟΠΗ ΣΕ INTEGER ΣΥΜΦΩΝΑ ΜΕ ΤΟ UCS-2 / UTF-16 CHARACTER SET

         if ( a > b ) greekIsGreater = true;

        System.out.println(" Greek is greater: " + greekIsGreater);
    }
}
