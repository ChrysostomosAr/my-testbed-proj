package gr.aueb.cf.ch8;

import java.io.IOException;
public class ExceptionTypes {
    public static void main(String[] args) {

    }

    /**
     * System.in.read() thorws IOException.
     * Since a checked exception is thown, it has to be
     * explicitly to bre throw in method signature.
     * Or has to be caught {}
     * When this type of method / exception may be used?
     * When no need to handle the exception.
     * Is this meaningful? NO. ideally, we want to handle exceptions,
     * not only propagate.
     *
     * @return
     * @throws IOException
     */
     public static char readOneChar() throws IOException {
        return (char) System.in.read(); //throws IOException

     }

    /**
     * if we catch the exception, no need for 'throws'
     * in method signature. And the exception not propagates.
     * Is it a good practice not to propagate?
     * It depends.
     * If there is a caller then we have to propagate.
     * If there is a client / user then we do not propagate the exception.
     *
     * @return
     */

   public static char readAnotherChar() {
         try {
             return (char) System.in.read();
         } catch (IOException e) {
             System.err.println(e.getMessage());
             return ' ';
         }
     }

    /**
     * In this type of method / exception , we take
     * action -- logging , and also rethrow the exception
     * to propagate to the caller.
     * @return
     * @throws IOException
     */

    public static char readAnotherOneChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
    public static char readAgainOneChar(char ch) throws IOException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }
    }


}


