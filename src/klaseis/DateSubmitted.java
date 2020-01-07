package klaseis;

import dhmiourgiaBasewndedomenwn.AssignementsPerStudentToEachCourseThsBashsDedomenwn;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import static klaseis.DhmiourgiaAssignementsPerStudentToEachCourse.neaAssignementsPerStudentToEachCourses;
import tools.DayOfWeekTimeRange;

public class DateSubmitted {

    //  AssignementsPerStudentToEachCourseThsBashsDedomenwn basc = new AssignementsPerStudentToEachCourseThsBashsDedomenwn();
    // DhmiourgiaAssignementsPerStudentToEachCourse dasc = new DhmiourgiaAssignementsPerStudentToEachCourse();
    Scanner scan = new Scanner(System.in);
    String dateSubmitted;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateValidator validator = new DateValidatorUsingLocalDate(dateFormatter);
    boolean hmeromhniaEinaiMeta3uMondayToFriday;

    // elegxoume an oi meres ths ebdomadas einai meta3u Monday - Friday
    DayOfWeekTimeRange range = new DayOfWeekTimeRange(DayOfWeek.MONDAY, LocalTime.of(0, 0), DayOfWeek.FRIDAY, LocalTime.of(0, 0));
    DayOfWeekTimeRange rangeAssignement = new DayOfWeekTimeRange(DayOfWeek.MONDAY, LocalTime.of(0, 0), DayOfWeek.FRIDAY, LocalTime.of(0, 0));

    LocalDate localDateInput;
    LocalDate localDateAssignment;

//DateSubmitted dss = new DateSubmitted();
    public DateSubmitted() {
    }

    public void EmfanishListasMa8htwnPouParedewsanTisErgasies() {
        // dasc.neaAssignementsPerStudentToEachCourses;

        if (!(DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().isEmpty())) {

            System.out.println("Dwse Hmeromhnia (dd/MM/yyyy) k wra pou 8es na emfanistei h lista me tous ma8htes pou prepei na paradwsoun se auth thn ebdomada thn ergasia");
            boolean trueDate = false; //elegxoume an o xrhsths edwse swsta thn date
            while (trueDate != true) {
                dateSubmitted = scan.nextLine();
                trueDate = validator.isValid(dateSubmitted); //boolean pou elegxei an o xrhsths ebale swsth date
            }
            //System.out.println(range.inRange(LocalDateTime.of(2015, 11, 12, 22, 0))); // Thu Nov. 12 2015 at 10:00 PM
            //me ton tropo auto dhmiourgoume to euros twn hmerwn pou 8eloume k epistefoun true / false
            hmeromhniaEinaiMeta3uMondayToFriday = range.inRange(LocalDateTime.of(Integer.parseInt(dateSubmitted.substring(6, 10)), Integer.parseInt(dateSubmitted.substring(3, 5)), Integer.parseInt(dateSubmitted.substring(0, 2)), 22, 0));

            localDateInput = LocalDate.of(Integer.parseInt(dateSubmitted.substring(6, 10)), Integer.parseInt(dateSubmitted.substring(3, 5)), Integer.parseInt(dateSubmitted.substring(0, 2)));

            System.out.println(NumberOfWeek(localDateInput));

        }
    }
//******************************YPOLOGIZEI TON ARI8MO THS WEEK *********************************************************

    private int NumberOfWeek(LocalDate localDate1) {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = localDate1.get(weekFields.weekOfWeekBasedYear());
        return weekNumber;
    }

    public void ElegxosGiaThnHmeromhniaYpobilhsKa8eErgasias() {
        if (!(DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().isEmpty())) {
            System.out.println("");
            System.out.println("Oi ergasies pou prepei na paradwuoun entos ths hmeromhnias pou kate8esai o xrhsths einai");
            System.out.format("%14s %10s %10s %10s %12s %13s %n", "CourseTitle", "CourseStream", "FirstName", "LastName", "AssignmentTitle", "AssignmentDescription");
            for (int i = 0; i < DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().size(); i++) {
                String s = DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getAssignment().getSubDateTime();
                //System.out.println(s);
                localDateAssignment = LocalDate.of(Integer.parseInt(s.substring(6, 10)), Integer.parseInt(s.substring(3, 5)), Integer.parseInt(s.substring(0, 2)));
                boolean hmeromhniaAssignment = rangeAssignement.inRange(LocalDateTime.of(Integer.parseInt(s.substring(6, 10)), Integer.parseInt(s.substring(3, 5)), Integer.parseInt(s.substring(0, 2)), 22, 0));
                //ean h hmera tou assignment einai meta3u tou monday-friday
                if (hmeromhniaAssignment && (NumberOfWeek(localDateInput) == NumberOfWeek(localDateAssignment))) {
                    //   System.out.println(DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getCourse().getTitle() + " " + DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getCourse().getStream()
                    //         + " " + DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getStudent().getLastName()
                    //       + " " + DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getAssignment().getTitle() + " " + DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getAssignment().getDescription());

                    System.out.print(i);
                    System.out.format("%12s %12s %12s %9s %12s %20s %n", DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getCourse().getTitle(),
                            DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getCourse().getStream(),
                            DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getStudent().getFirstName(),
                            DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getStudent().getLastName(),
                            DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getAssignment().getTitle(),
                            DhmiourgiaAssignementsPerStudentToEachCourse.getNeaAssignementsPerStudentToEachCourses().get(i).getAssignment().getDescription());
                }
            }
        }
    }

}
