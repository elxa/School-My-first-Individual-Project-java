package klaseis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidatorUsingLocalDate implements DateValidator {

    private DateTimeFormatter dateFormatter;
    private static LocalDate localDate;
    static String date;

    public DateValidatorUsingLocalDate() {
    }

    public String getDate() {
        return date;
    }

    public DateTimeFormatter getDateFormatter() {
        return dateFormatter;
    }

    public static LocalDate getLocalDate() {
        return localDate;
    }

    public DateValidatorUsingLocalDate(DateTimeFormatter dateFormatter) {
        this.dateFormatter = dateFormatter;
    }

    @Override
    public boolean isValid(String dateStr) {
        try {
            //dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
            localDate = LocalDate.parse(dateStr, this.dateFormatter);
            date = dateFormatter.format(localDate);

        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

}
