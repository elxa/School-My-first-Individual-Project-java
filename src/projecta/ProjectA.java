package projecta;

import dhmiourgiaBasewndedomenwn.BaseisMa8htwn;
import dhmiourgiaBasewndedomenwn.BaseisTrainers;
import elegxoi.ElegxoiMetablhtwn;
import java.awt.Menu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import klaseis.Student;
import klaseis.Trainer;
import tools.MenouEpilogwn;

public class ProjectA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ElegxoiMetablhtwn em = new ElegxoiMetablhtwn(); //gia na elegxoume tis times pou eisagei o xrhsths
        BaseisMa8htwn bM = new BaseisMa8htwn();
        BaseisTrainers bT = new BaseisTrainers();
        Student s = new Student();
        Trainer t = new Trainer();
        MenouEpilogwn menou = new MenouEpilogwn();

        int choise = 5;
        boolean telos = false;

        System.out.println("To programma 8a stamathsei ews otou pathseis 'stop'");

        do {

            telos = menou.menouMeToDikaiwmaEpiloghs();
        } while (telos != true);

        /*      //      LocalDate ld = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        //    SimpleDateFormat sdf = new SimpleDateFormat(scan.nextInt() + "/" + scan.nextInt() + "/" + scan.nextInt());
        // System.out.println(ld);
        LocalDate localDate = LocalDate.of(2015, 12, 31);

        LocalDate localDate1 = localDate.plusYears(3);
        LocalDate localDate2 = localDate.minusYears(3);
        System.out.println(localDate1);
        System.out.println(localDate2);   */
    }

}
