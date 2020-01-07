package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SugrishHmeromhniwn {

    public static boolean sugkrishDates(String date1, String date2) {

        if (date1.compareTo(date2) > 0) {
            System.out.println("The start date " + date1 + " is after The end date " + date2);
            // return +1;
            return true;

        } else if (date1.compareTo(date2) < 0) {
            // System.out.println("The start date " + date1 + " is before " + date2 + " The end date");
            // return -1;
            return false;

        } else if (date1.compareTo(date2) == 0) {
            System.out.println(date1 + " is equal " + date2);
            // return 0;
            return true;

        }
        return false;

    }

}
