package gr.aueb.cf.ch2;
/**
 * prints the date in a proper form
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateApp {
    public static void main(String[] args) {
        //Λαμβάνει την τρέχουσα ημερομηνία
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("dd/MM/yyyy");

        String formattedDate = currentDate.format(formatter);
        System.out.println("Current Date is:" + formattedDate);


    }


    }

