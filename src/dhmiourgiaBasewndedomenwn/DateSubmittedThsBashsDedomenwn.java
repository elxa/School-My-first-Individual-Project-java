package dhmiourgiaBasewndedomenwn;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;
import klaseis.DateValidatorUsingLocalDate;
import klaseis.DhmiourgiaAssignementsPerStudentToEachCourse;
import tools.DayOfWeekTimeRange;

public class DateSubmittedThsBashsDedomenwn {

    public DateSubmittedThsBashsDedomenwn() {
    }

    AssignementsPerStudentToEachCourseThsBashsDedomenwn basc = new AssignementsPerStudentToEachCourseThsBashsDedomenwn();
    Scanner scan = new Scanner(System.in);
    String dateSubmitted;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateValidatorUsingLocalDate validator = new DateValidatorUsingLocalDate(dateFormatter);
    boolean hmeromhniaEinaiMeta3uMondayToFriday;
    DhmiourgiaAssignementsPerStudentToEachCourse das = new DhmiourgiaAssignementsPerStudentToEachCourse();

    // elegxoume an oi meres ths ebdomadas einai meta3u Monday - Friday
    DayOfWeekTimeRange range = new DayOfWeekTimeRange(DayOfWeek.MONDAY, LocalTime.of(0, 0), DayOfWeek.FRIDAY, LocalTime.of(0, 0));
    DayOfWeekTimeRange rangeAssignement = new DayOfWeekTimeRange(DayOfWeek.MONDAY, LocalTime.of(0, 0), DayOfWeek.FRIDAY, LocalTime.of(0, 0));

    LocalDate localDateInput;
    LocalDate localDateAssignment;

    public void EmfanishListasMa8htwnPouParedewsanTisErgasies() {
        basc.AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(das.getNeaAssignementsPerStudentToEachCourses());
        System.out.println("Dwse Hmeromhnia (dd/MM/yyyy) pou 8es na emfanistei h lista me tous ma8htes pou prepei na paradwsoun se auth thn ebdomada thn ergasia");
        boolean trueDate = false; //elegxoume an o xrhsths edwse swsta thn date
        while (trueDate != true) {
            dateSubmitted = scan.nextLine();
            trueDate = validator.isValid(dateSubmitted); //boolean pou elegxei an o xrhsths ebale swsth date
        }

        //me ton tropo auto dhmiourgoume to euros twn hmerwn pou 8eloume k epistefoun true / false
        hmeromhniaEinaiMeta3uMondayToFriday = range.inRange(LocalDateTime.of(Integer.parseInt(dateSubmitted.substring(6, 10)), Integer.parseInt(dateSubmitted.substring(3, 5)), Integer.parseInt(dateSubmitted.substring(0, 2)), 22, 0));
        // System.out.println(hmeromhniaEinaiMeta3uMondayToFriday);
        System.out.println(dateSubmitted);

        localDateInput = LocalDate.of(Integer.parseInt(dateSubmitted.substring(6, 10)), Integer.parseInt(dateSubmitted.substring(3, 5)), Integer.parseInt(dateSubmitted.substring(0, 2)));

        System.out.println(NumberOfWeek(localDateInput));

    }
//******************************YPOLOGIZEI TON ARI8MO THS WEEK *********************************************************

    public int NumberOfWeek(LocalDate localDate1) {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = localDate1.get(weekFields.weekOfWeekBasedYear());
        return weekNumber;
    }

    public void ElegxosGiaThnHmeromhniaYpobilhsKa8eErgasias() {
        basc.AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(das.getNeaAssignementsPerStudentToEachCourses());
        basc.EmfanishOlwnAssigmentPerStudent();
        System.out.println("");
        System.out.println("Oi ergasies pou prepei na paradwuoun entos ths hmeromhnias pou kate8esai o xrhsths einai");
        System.out.format("%14s %8s %12s %11s %18s %25s %n", "CourseTitle", "CourseStream", "FirstName", "LastName", "AssignmentTitle", "AssignmentDescription");
        for (int i = 0; i < basc.getCombineAssignmentsPerStudent().size(); i++) {
            String s = basc.getCombineAssignmentsPerStudent().get(i).getAssignment().getSubDateTime();
            // System.out.println(s);
            localDateAssignment = LocalDate.of(Integer.parseInt(s.substring(6, 10)), Integer.parseInt(s.substring(3, 5)), Integer.parseInt(s.substring(0, 2)));
            boolean hmeromhniaAssignment = rangeAssignement.inRange(LocalDateTime.of(Integer.parseInt(s.substring(6, 10)), Integer.parseInt(s.substring(3, 5)), Integer.parseInt(s.substring(0, 2)), 22, 0));

            //ean h hmera tou assignment einai meta3u tou monday-friday
            if (hmeromhniaAssignment && (NumberOfWeek(localDateInput) == NumberOfWeek(localDateAssignment))) {
                //  System.out.println(basc.getCombineAssignmentsPerStudent().get(i).getCourse().getTitle() + " " + basc.getCombineAssignmentsPerStudent().get(i).getCourse().getStream()
                //        + " " + basc.getCombineAssignmentsPerStudent().get(i).getStudent().getLastName()
                //      + " " + basc.getCombineAssignmentsPerStudent().get(i).getAssignment().getTitle() + " " + basc.getCombineAssignmentsPerStudent().get(i).getAssignment().getDescription());

                System.out.format("%10s %11s %15s %11s %17s %22s %n", basc.getCombineAssignmentsPerStudent().get(i).getCourse().getTitle(),
                        basc.getCombineAssignmentsPerStudent().get(i).getCourse().getStream(),
                        basc.getCombineAssignmentsPerStudent().get(i).getStudent().getFirstName(),
                        basc.getCombineAssignmentsPerStudent().get(i).getStudent().getLastName(),
                        basc.getCombineAssignmentsPerStudent().get(i).getAssignment().getTitle(),
                        basc.getCombineAssignmentsPerStudent().get(i).getAssignment().getDescription());
            }
        }

    }

}
