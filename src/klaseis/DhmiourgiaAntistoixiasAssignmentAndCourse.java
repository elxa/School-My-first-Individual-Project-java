package klaseis;

import elegxoi.ElegxoiMetablhtwn;
import elegxoi.ElegxosYpar3hsStoixeiwnMesaSthLista;
import java.util.ArrayList;
import java.util.Scanner;
import static klaseis.DhmiourgiaAntistoixiasTrainerAndCourse.dhmiourgiaTrainersAndCourses;

public class DhmiourgiaAntistoixiasAssignmentAndCourse {

    Course course = new Course();
    Assignment assignment = new Assignment();
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();

    static ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> dhmiourgiaAssignmentsAndCourses = new ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse>();
    static ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> neadhmiourgiaAssignmentsAndCourses = new ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse>();
    Scanner scan = new Scanner(System.in);

    public DhmiourgiaAntistoixiasAssignmentAndCourse(Course course, Assignment assignment) {
        this.course = course;
        this.assignment = assignment;
    }

    public DhmiourgiaAntistoixiasAssignmentAndCourse() {
    }

    public void AntistoixiasAssignmentAndCourse() {
        String stop = " ";
        boolean existList = true;
        if (course.getCourses().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei courses");
            existList = false; //efoson den uparxei bgainoume e3w apo th me8odo
        }
        if (assignment.getAssignments().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei assignment");
            existList = false;//efoson den uparxei bgainoume e3w apo th me8odo
        } else {
            while (!stop.equals("stop") && existList == true) {
                System.out.println("Exoume ta e3hs Ma8hmata");
                System.out.println("");
                course.EmfanishListasCourse();
                System.out.println("Exoume ta e3hs assignment");
                System.out.println("");
                assignment.EmfanishListasAna8esewn();

                System.out.println("Diale3e to ma8hma ");
                int epiloghCourses = 0;
                epiloghCourses = em.ElegxosGiaIntMetablhth(epiloghCourses);
                while (epiloghCourses >= course.getCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourses = em.ElegxosGiaIntMetablhth(epiloghCourses);
                }

                System.out.println("Diale3e to assignement se opoio to ma8hma 8es");
                int epiloghAssigment = 0;
                epiloghAssigment = em.ElegxosGiaIntMetablhth(epiloghAssigment);
                while (epiloghAssigment >= assignment.getAssignments().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghAssigment = em.ElegxosGiaIntMetablhth(epiloghAssigment);
                }

                DhmiourgiaAntistoixiasAssignmentAndCourse dac = new DhmiourgiaAntistoixiasAssignmentAndCourse(course.getCourses().get(epiloghCourses), assignment.getAssignments().get(epiloghAssigment));
                dhmiourgiaAssignmentsAndCourses.add(dac);

                //elegxoume me auto ton tropo an to assignment exei proste8ei sto course h oxi 
                if (ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaToEanToAssignementExeiProste8eiStoCourse(dhmiourgiaAssignmentsAndCourses, dhmiourgiaAssignmentsAndCourses.get(dhmiourgiaAssignmentsAndCourses.size() - 1)) == true) {
                } else {
                    neadhmiourgiaAssignmentsAndCourses.add(dac);
                }

                System.out.println("ean 8es na stamathseis pata 'stop'");
                stop = scan.nextLine();
            }
        }

    }

    public void EmfanishAntistoixiaAssignmentAndCourse() {
        String epilogh = "";
        if (!(course.getCourses().isEmpty()) && !(assignment.getAssignments().isEmpty())) {
            do {
                System.out.println("*******************Exoume ta e3hs Ma8hmata************************");
                System.out.println("");
                course.EmfanishListasCourse();
                System.out.println("Diale3e to ma8hma sto opoio 8es na deis tis ana8eseis");
                int epiloghCourse = 0;
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                while (epiloghCourse >= course.getCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                }

                Course dokimhCourse = Course.getCourses().get(epiloghCourse);

                System.out.format("%16s %15s %20s %24s  %n", "Course Title", "Course Stream", "Assignment Title", "Assignment Description");
                System.out.println("--------------------------------------------------------------------------------------------------------");
                for (int i = 0; i < neadhmiourgiaAssignmentsAndCourses.size(); i++) {
                    if ((neadhmiourgiaAssignmentsAndCourses.get(i).getCourse().getStream()).equals(dokimhCourse.getStream()) && (neadhmiourgiaAssignmentsAndCourses.get(i).getCourse().getTitle()).equals(dokimhCourse.getTitle())) {
                        System.out.print(i);
                        System.out.format("%12s %15s %19s %22s  %n", neadhmiourgiaAssignmentsAndCourses.get(i).getCourse().getTitle(),
                                neadhmiourgiaAssignmentsAndCourses.get(i).getCourse().getStream(),
                                neadhmiourgiaAssignmentsAndCourses.get(i).getAssignment().getTitle(),
                                neadhmiourgiaAssignmentsAndCourses.get(i).getAssignment().getDescription());
                    }
                }
                System.out.println("8es na deis allh lista me ta ma8hmata k tis ana8eseis twn ergasiwn ? ean nai pata 'n' alliws 's' ");
                epilogh = scan.nextLine();
                while (!epilogh.equals("n") && !epilogh.equals("s")) {
                    System.out.println("den edwses swsto xarakthra");
                    epilogh = scan.nextLine();
                }
            } while (!epilogh.equals("s"));
        }
    }

    public void EmfanishAntistoixiaOlwnTwnAssignmentsMeTaCourses() {
        if (neadhmiourgiaAssignmentsAndCourses.isEmpty()) {
            System.out.println("Oxrhsths den exei ftia3ei thn antistoixia Assignment - Course");
        }
        System.out.format("%16s %15s %20s %24s  %n", "Course Title", "Course Stream", "Assignment Title", "Assignment Description");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < neadhmiourgiaAssignmentsAndCourses.size(); i++) {
            System.out.print(i);
            System.out.format("%12s %15s %19s %22s  %n", neadhmiourgiaAssignmentsAndCourses.get(i).getCourse().getTitle(),
                    neadhmiourgiaAssignmentsAndCourses.get(i).getCourse().getStream(),
                    neadhmiourgiaAssignmentsAndCourses.get(i).getAssignment().getTitle(),
                    neadhmiourgiaAssignmentsAndCourses.get(i).getAssignment().getDescription());
        }

    }

    public void MenouEpiolghsEmfanishsAssignmentPerCoursesHOlwnTwnAssignment() {
        int choise = 0;
        System.out.println("1)8es na emfanistoun oloi oi Student me ta Courses 2) na emfanistoun Analoga me to ma8hma pou epile3eis?");
        while (choise != 1 && choise != 2) {
            choise = em.ElegxosGiaIntMetablhth(choise);
        }
        switch (choise) {
            case 1:
                EmfanishAntistoixiaOlwnTwnAssignmentsMeTaCourses();
                break;
            case 2:
                EmfanishAntistoixiaAssignmentAndCourse();
                break;
            default:
                break;
        }
    }

    public Course getCourse() {
        return course;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public static ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> getNeadhmiourgiaAssignmentsAndCourses() {
        return neadhmiourgiaAssignmentsAndCourses;
    }

}
