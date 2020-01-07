package klaseis;

import elegxoi.ElegxoiMetablhtwn;
import elegxoi.ElegxosYpar3hsStoixeiwnMesaSthLista;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;
import static klaseis.DhmiourgiaAntistoixiasTrainerAndCourse.dhmiourgiaTrainersAndCourses;

public class DhmiourgiaAntistoixiasStudentAnCourses {

    Course course = new Course();
    Student student = new Student();
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();

    static ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> dhmiourgiaStudentAndCourses = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>();
    static ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> neadhmiourgiaStudentAndCourses = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>();
    Scanner scan = new Scanner(System.in);

    //afora tis dates
    DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
    DateValidator validator = new DateValidatorUsingLocalDate(dateFormatter);
    DateValidatorUsingLocalDate dateValidatorUsingLocalDate = new DateValidatorUsingLocalDate();
    String date1;
    String date2;

    public DhmiourgiaAntistoixiasStudentAnCourses(Course course, Student student) {
        this.course = course;
        this.student = student;
    }

    public DhmiourgiaAntistoixiasStudentAnCourses() {
    }

    public void antistoixiaStudentsMeCourses() {
        String stop = " ";
        boolean existList = true;
        if (course.getCourses().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei courses");
            existList = false; //efoson den uparxei bgainoume e3w apo th me8odo
        }
        if (student.getMa8htes().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei students");
            existList = false;
        } else {
            while (!stop.equals("stop") && existList == true) {
                System.out.println("******************Exoume ta e3hs Ma8hmata************************");
                System.out.println("");
                course.EmfanishListasCourse();
                System.out.println("*****************Exoume tous e3hs Ma8hmates*************************");
                System.out.println("");
                student.EmfanishListasMa8htwn();

                //elegxos ths periptwshw pou paei o xrhsths na balei enan ma8hth se ma8hma pou exei teleiwsei
                System.out.println("Diale3e to ma8hma ");
                int epiloghCourses = 0;
                epiloghCourses = em.ElegxosGiaIntMetablhth(epiloghCourses);
                while (epiloghCourses >= course.getCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourses = em.ElegxosGiaIntMetablhth(epiloghCourses);
                }
                System.out.println("Diale3e to ma8hth");
                int epiloghStudent = 0;
                epiloghStudent = em.ElegxosGiaIntMetablhth(epiloghStudent);
                while (epiloghStudent >= student.getMa8htes().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghStudent = em.ElegxosGiaIntMetablhth(epiloghStudent);
                }

                DhmiourgiaAntistoixiasStudentAnCourses dsc = new DhmiourgiaAntistoixiasStudentAnCourses(course.getCourses().get(epiloghCourses), student.getMa8htes().get(epiloghStudent));
                dhmiourgiaStudentAndCourses.add(dsc);

                //elegxoume me auto ton tropo an o trainer exei proste8ei sto ma8hma h oxi 
                if (ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaToEanOStudentExeiProste8eiStoCourse(dhmiourgiaStudentAndCourses, dhmiourgiaStudentAndCourses.get(dhmiourgiaStudentAndCourses.size() - 1)) == true) {
                } else {
                    neadhmiourgiaStudentAndCourses.add(dsc);
                }

                System.out.println("ean 8es na stamathseis pata 'stop' alliws pata kapoion allon xarakthra");
                stop = scan.nextLine();

            }

        }
    }

    public void EmfanishAntistoixiaStudentsMeCourses() {
        String epilogh = "";
        if (!(course.getCourses().isEmpty()) && !(student.getMa8htes().isEmpty())) {
            do {
                System.out.println("*************************Exoume ta e3hs Ma8hmata*************************");
                System.out.println("");
                course.EmfanishListasCourse();
                System.out.println("Diale3e to ma8hma sto opoio 8es na emfanistoun poioi ma8htes to parakolou8oun");
                int epiloghCourse = 0;
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                while (epiloghCourse >= course.getCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                }
                Course dokimh = Course.getCourses().get(epiloghCourse);
                System.out.format("%13s %11s %14s %15s  %n", "CourseTitle", "CourseStream", "First Name", "Last Name");
                System.out.println("---------------------------------------------------------------------------------");
                for (int i = 0; i < neadhmiourgiaStudentAndCourses.size(); i++) {
                    if ((neadhmiourgiaStudentAndCourses.get(i).getCourse().getStream()).equals(dokimh.getStream()) && (neadhmiourgiaStudentAndCourses.get(i).getCourse().getTitle()).equals(dokimh.getTitle())) {
                        System.out.print(i);
                        System.out.format("%9s %11s %16s %16s %n", neadhmiourgiaStudentAndCourses.get(i).getCourse().getTitle(),
                                neadhmiourgiaStudentAndCourses.get(i).getCourse().getStream(),
                                neadhmiourgiaStudentAndCourses.get(i).getStudent().getFirstName(),
                                neadhmiourgiaStudentAndCourses.get(i).getStudent().getLastName());
                    }
                }
                System.out.println("8es na deis allh lista me tous ma8htew? ean nai pata 'n' alliws 's' ");
                epilogh = scan.nextLine();
                while (!epilogh.equals("n") && !epilogh.equals("s")) {
                    System.out.println("den edwses swsto xarakthra");
                    epilogh = scan.nextLine();
                }
            } while (!epilogh.equals("s"));
        }

    }

    public void EktupwshStudentAndCourse() {
        if (neadhmiourgiaStudentAndCourses.isEmpty()) {
            System.out.println("o xrhsths den exei ftia3ei thn antistoixia Student -Course");
        }
        System.out.format("%13s %11s %14s %15s  %n", "CourseTitle", "CourseStream", "First Name", "Last Name");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < neadhmiourgiaStudentAndCourses.size(); i++) {
            System.out.print(i);
            System.out.format("%9s %11s %16s %16s %n", neadhmiourgiaStudentAndCourses.get(i).getCourse().getTitle(),
                    neadhmiourgiaStudentAndCourses.get(i).getCourse().getStream(),
                    neadhmiourgiaStudentAndCourses.get(i).getStudent().getFirstName(),
                    neadhmiourgiaStudentAndCourses.get(i).getStudent().getLastName());
        }
    }

    public void MenouEpiolghsEmfanishsStudentPerCoursesHOlwnTwnStudent() {
        int choise = 0;
        System.out.println("1)8es na emfanistoun oloi oi Student me ta Courses 2) na emfanistoun Analoga me to ma8hma pou epile3eis?");
        while (choise != 1 && choise != 2) {
            choise = em.ElegxosGiaIntMetablhth(choise);
        }

        switch (choise) {
            case 1:
                EktupwshStudentAndCourse();
                break;
            case 2:
                EmfanishAntistoixiaStudentsMeCourses();
                break;
            default:
                break;
        }

    }

    public void ElegxosStudentParakolou8eiPerissoteraCourses() {
        int count = 0;

        System.out.println("**********Ara oi student pou parakolou8oun perissotera apo 1 ma8hmata einai:*****************************");
        for (int k = 0; k < Student.getMa8htes().size(); k++) {
            Student dokimhStudent = Student.getMa8htes().get(k);
            for (int i = 0; i < DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().size(); i++) {
                if (DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getStudent().getFirstName().equals(dokimhStudent.getFirstName()) && DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getStudent().getLastName().equals(dokimhStudent.getLastName())) {
                    count++;
                    if (count > 1 && count < 3) {
                        System.out.println(DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getStudent().getFirstName() + " " + DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getStudent().getLastName());
                    }
                }
            }
            count = 0;
        }

    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public ElegxoiMetablhtwn getEm() {
        return em;
    }

    public static ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> getNeadhmiourgiaStudentAndCourses() {
        return neadhmiourgiaStudentAndCourses;
    }

}
