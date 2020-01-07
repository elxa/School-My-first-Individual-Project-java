package klaseis;

import elegxoi.ElegxoiMetablhtwn;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import tools.SugrishHmeromhniwn;

public class Course {

    private String title; //
    private String stream;  //java, c#
    private String type; //full time part
    private String start_date;
    private String end_date;

    String date1;
    String date2;

    static ArrayList<Course> courses = new ArrayList<Course>();
    Scanner scan = new Scanner(System.in);
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();
    ArrayList<Student> courseTouKa8eMa8hth = new ArrayList<Student>();

    DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE; //auto to pattern leitourgei ean 8eloume na kanoume sugkrishh dates 
    DateValidator validator = new DateValidatorUsingLocalDate(dateFormatter);
    DateValidatorUsingLocalDate dateValidatorUsingLocalDate = new DateValidatorUsingLocalDate();

    public Course(String title, String stream, String type, String start_date, String end_date) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Course() {

    }

    public ArrayList DhmiourgiaMa8hatwntwnApoTonXrhsth() {
        String epilogh = "n";

        do {
            System.out.println("DWSE TON TITLO TOU MA8HMATOS");
            // this.title = em.ElegxosGiaStringMeChars();
            this.title = scan.nextLine();
            System.out.println("DWSE TO STREAM");
            //  this.stream = em.ElegxosGiaStringMeChars();
            this.stream = scan.nextLine();
            System.out.println("DWSE TO TYPE");
            //  this.type = em.ElegxosGiaStringMeChars();
            this.type = scan.nextLine();
            //8a prepei na pros8esoume periorismo se periptwsh pou o xrhsths eisagei eisagei thn hmeromhnia lh3hs megaluterh apo thn hmeromhnia enar3hs
            do {
                System.out.println("DWSE THN HMEROMHNIA POU ARXISAN TA MA8HMATA (yyyy-MM-dd)");  //o xrhsth eisagei thn hmeromhnia k elegxei an thn exei eisagei swsta
                boolean trueDate1 = false;
                // while (trueDate1 != true) {
                while (trueDate1 == false) {
                    trueDate1 = validator.isValid(start_date = scan.nextLine());
                    // date1 = dateValidatorUsingLocalDate.getDate();
                }
                date1 = dateValidatorUsingLocalDate.getDate();
                System.out.println("DWSE THN HMEROMHNIA LH3HS TWN MA8HMATWN (yyyy-MM-dd)");//o xrhsth eisagei thn hmeromhnia k elegxei an thn exei eisagei swsta
                boolean trueDate2 = false;
                while (trueDate2 == false) {
                    trueDate2 = validator.isValid(end_date = scan.nextLine());
                }
                date2 = dateValidatorUsingLocalDate.getDate();
                SugrishHmeromhniwn.sugkrishDates(date1, date2);  //elegxos twn 2 dates

            } while ((SugrishHmeromhniwn.sugkrishDates(date1, date2) == true)); //sthn periptwsh pou einai ises h start date > end date prepei na 3anadw8oun oi dates
            Course c = new Course(title, stream, type, start_date, end_date);
            courses.add(c);

            System.out.println("8ES NA PROS8ESEIS KAPOIO ALLO MA8HMA PATA 'n' -> GIA SUNEXEIA  's' -> gia stop ");
            epilogh = scan.nextLine();
            while (!epilogh.equals("s") && !epilogh.equals("n")) {
                System.out.println("Den edwses tous char 'n' or 's'");
                epilogh = scan.nextLine();
            }
        } while (!epilogh.equals("s"));
        return courses;
    }

    public void EmfanishListasCourse() {
        System.out.format("%10s %12s %12s %16s %15s %n", "Title", "Stream", "Type", "Start Date", "End Date");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < courses.size(); i++) {
            System.out.print(i);
            System.out.format("%11s %11s %13s %15s %16s %n", courses.get(i).getTitle(),
                    courses.get(i).getStream(), courses.get(i).getType(),
                    courses.get(i).getStart_date(), courses.get(i).getEnd_date());
        }

    }

//************************GET ME8ODOI**********************************    
    public String getTitle() {
        return title;
    }

    public String getStream() {
        return stream;
    }

    public String getType() {
        return type;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public String getDate1() {
        return date1;
    }

    public String getDate2() {
        return date2;
    }

    public DateTimeFormatter getDateFormatter() {
        return dateFormatter;
    }

    public DateValidator getValidator() {
        return validator;
    }

    public DateValidatorUsingLocalDate getDateValidatorUsingLocalDate() {
        return dateValidatorUsingLocalDate;
    }

    public ArrayList<Student> getCourseTouKa8eMa8hth() {
        return courseTouKa8eMa8hth;
    }

}
