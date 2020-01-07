package dhmiourgiaBasewndedomenwn;

import elegxoi.ElegxoiMetablhtwn;
import elegxoi.ElegxosYpar3hsStoixeiwnMesaSthLista;
import java.util.ArrayList;
import java.util.Scanner;
import klaseis.Assignment;
import klaseis.Course;
import klaseis.DhmiourgiaAntistoixiasAssignmentAndCourse;
import klaseis.DhmiourgiaAntistoixiasStudentAnCourses;
import klaseis.DhmiourgiaAntistoixiasTrainerAndCourse;
import klaseis.Student;
import klaseis.Trainer;

public class AssignmentAndCourseThsBashsDedomenwn {

    BaseisAna8esewn bA = new BaseisAna8esewn();
    BaseisCourses bC = new BaseisCourses();
    Course course = new Course();
    Assignment assigment = new Assignment();
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();
    DhmiourgiaAntistoixiasAssignmentAndCourse dac = new DhmiourgiaAntistoixiasAssignmentAndCourse();

    ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> combineAssignmentAndCourses = new ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse>();
    ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> existsAssignmentAndCourses = new ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse>();
    ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> existsAssignmentAndCourses0 = new ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse>();
    ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> existsAssignmentAndCourses2 = new ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse>();
    ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> existsAssignmentAndCourses00 = AntistoixiaAssigmentMeCourses();

    Scanner scan = new Scanner(System.in);

    public AssignmentAndCourseThsBashsDedomenwn(Course course, Assignment assigment) {
        this.course = course;
        this.assigment = assigment;
    }

    public AssignmentAndCourseThsBashsDedomenwn() {

    }

    private ArrayList AntistoixiaAssigmentMeCourses() {
        //Dhmiourgoume ta e3hs antikeimena
        //gia na ftia3oume ta dedomenena prepei prwta na dhmiourgh8oun oi antistoixes arraylist pou ta periexoun
        bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses());
        bA.DhmiourgiaArrayListAna8esewn(assigment.getAssignments());

        DhmiourgiaAntistoixiasAssignmentAndCourse ac1 = new DhmiourgiaAntistoixiasAssignmentAndCourse(bC.getCombineCourses().get(0), bA.getCombineAssignments().get(1));
        existsAssignmentAndCourses0.add(ac1);
        DhmiourgiaAntistoixiasAssignmentAndCourse ac2 = new DhmiourgiaAntistoixiasAssignmentAndCourse(bC.getCombineCourses().get(0), bA.getCombineAssignments().get(2));
        existsAssignmentAndCourses0.add(ac2);
        DhmiourgiaAntistoixiasAssignmentAndCourse ac3 = new DhmiourgiaAntistoixiasAssignmentAndCourse(bC.getCombineCourses().get(1), bA.getCombineAssignments().get(0));
        existsAssignmentAndCourses0.add(ac3);
        DhmiourgiaAntistoixiasAssignmentAndCourse ac4 = new DhmiourgiaAntistoixiasAssignmentAndCourse(bC.getCombineCourses().get(1), bA.getCombineAssignments().get(1));
        existsAssignmentAndCourses0.add(ac4);
        DhmiourgiaAntistoixiasAssignmentAndCourse ac5 = new DhmiourgiaAntistoixiasAssignmentAndCourse(bC.getCombineCourses().get(1), bA.getCombineAssignments().get(2));
        existsAssignmentAndCourses0.add(ac5);
        DhmiourgiaAntistoixiasAssignmentAndCourse ac6 = new DhmiourgiaAntistoixiasAssignmentAndCourse(bC.getCombineCourses().get(0), bA.getCombineAssignments().get(0));
        existsAssignmentAndCourses0.add(ac6);
        DhmiourgiaAntistoixiasAssignmentAndCourse ac7 = new DhmiourgiaAntistoixiasAssignmentAndCourse(bC.getCombineCourses().get(1), bA.getCombineAssignments().get(0));
        existsAssignmentAndCourses0.add(ac7);
        DhmiourgiaAntistoixiasAssignmentAndCourse ac8 = new DhmiourgiaAntistoixiasAssignmentAndCourse(bC.getCombineCourses().get(1), bA.getCombineAssignments().get(3));
        existsAssignmentAndCourses0.add(ac8);

        return existsAssignmentAndCourses0;
    }

    public void DhmiourgiaAntistoixiaAssigmentAndCourse(ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> newAssignmentAndCourses) {

        String epilogh = "";
        String epiloghGiaNaStamathseiHAntistoixia = "";

        do {
            System.out.println("*********************Exoume ta e3hs Ma8hmata************************");
            System.out.println("");
            bC.DhmiourgiaArrayListMa8hmatwn(Course.getCourses());
            bC.EmfanishCourses();

            System.out.println("********************Exoume ta e3hs Assignments**************************");
            System.out.println("");
            bA.DhmiourgiaArrayListAna8esewn(Assignment.getAssignments());
            bA.EmfanishAssigment();

            System.out.println("");

            System.out.println("Diale3e to course");
            int epiloghCourse = 0;
            epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            while (epiloghCourse >= bC.getCombineCourses().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            }

            System.out.println("Diale3e to Assignment");
            int epiloghAssignment = 0;
            epiloghAssignment = em.ElegxosGiaIntMetablhth(epiloghAssignment);
            while (epiloghAssignment >= bA.getCombineAssignments().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghAssignment = em.ElegxosGiaIntMetablhth(epiloghAssignment);
            }

            Course course = bC.getCombineCourses().get(epiloghCourse);//einai to course pou exei epile3eii o xrhsths
            Assignment assignment = bA.getCombineAssignments().get(epiloghAssignment);//einai to assignment pou exei epile3eii o xrhsths
            DhmiourgiaAntistoixiasAssignmentAndCourse bAC = new DhmiourgiaAntistoixiasAssignmentAndCourse(course, assignment); //ta apo8hkeuoume se mia arraylist
            existsAssignmentAndCourses.add(bAC);

//pros8etoume to nea antistoixia mono sthn periptwsh pou den uparxei
            //elegxoume ena o sunduasmos uparxei hdh sta etoima dedomena, se auta pou exei ftia3ei o xrhsths k se auta pou 3anakanei sunduasmo o xrhsth
            boolean existelement = false;
            for (int i = 0; i < existsAssignmentAndCourses0.size(); i++) {
                if (existsAssignmentAndCourses0.get(i).getCourse().getTitle().equals(course.getTitle())
                        && existsAssignmentAndCourses0.get(i).getCourse().getStream().equals(course.getStream())
                        && existsAssignmentAndCourses0.get(i).getAssignment().getTitle().equals(assignment.getTitle())
                        && existsAssignmentAndCourses0.get(i).getAssignment().getDescription().equals(assignment.getDescription())) {
                    System.out.println("to stoixeio uparxei hdh");
                    existelement = true;
                }
            }
            boolean existelement1 = false;
            for (int i = 0; i < newAssignmentAndCourses.size(); i++) {
                if (newAssignmentAndCourses.get(i).getCourse().getTitle().equals(course.getTitle())
                        && newAssignmentAndCourses.get(i).getCourse().getStream().equals(course.getStream())
                        && newAssignmentAndCourses.get(i).getAssignment().getTitle().equals(assignment.getTitle())
                        && newAssignmentAndCourses.get(i).getAssignment().getDescription().equals(assignment.getDescription())) {
                    System.out.println("to stoixeio uparxei hdh");
                    existelement1 = true;
                }
            }
            if ((ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaToEanToAssignementExeiProste8eiStoCourse(existsAssignmentAndCourses, existsAssignmentAndCourses.get(existsAssignmentAndCourses.size() - 1)) == true)) {
            } else {
                if (existelement == false && existelement1 == false) {
                    existsAssignmentAndCourses2.add(bAC);
                }
            }
            System.out.println("Ean 8es na stamathseis tis antistoixies twn assignement per student se ka8e course pata 's' alliws gia sunexeia pata 'n'");
            epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
            while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")) && !(epiloghGiaNaStamathseiHAntistoixia.equals("n"))) {
                System.out.println("den edwses swsto ari8mo 's' h 'n'");
                epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
            }
        } while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")));
    }

    public ArrayList AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> newAssignmentAndCourses) {
        //gia na mhn 3anaproste8oun ta dedomena
        for (int i = 0; i < existsAssignmentAndCourses00.size(); i++) {
            if (combineAssignmentAndCourses.contains(existsAssignmentAndCourses00.get(i))) {
            } else {
                combineAssignmentAndCourses.add(existsAssignmentAndCourses00.get(i));
            }
        }
        for (int i = 0; i < existsAssignmentAndCourses2.size(); i++) {
            if (combineAssignmentAndCourses.contains(existsAssignmentAndCourses2.get(i))) {
            } else {
                combineAssignmentAndCourses.add(existsAssignmentAndCourses2.get(i));
            }
        }
        for (int i = 0; i < newAssignmentAndCourses.size(); i++) {
            if (combineAssignmentAndCourses.contains(newAssignmentAndCourses.get(i))) {

            } else {
                combineAssignmentAndCourses.add(newAssignmentAndCourses.get(i));
            }
        }
        return combineAssignmentAndCourses;
    }

    public void EmfanishAntistoixiaAssignmentsMeCourses() {
        String epilogh = "";
        do {
            System.out.println("**********************Exoume ta e3hs Ma8hmata*********************");
            System.out.println("");
            bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses());
            bC.EmfanishCourses();
            System.out.println("Diale3e to ma8hma sto opoio 8es na emfanistoun ta antistoixa Assignments");
            int epiloghCourse = 0;
            epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            while (epiloghCourse >= bC.getCombineCourses().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            }
            Course dokimh = bC.getCombineCourses().get(epiloghCourse);

            System.out.format("%14s %13s %14s %15s  %n", "Course Title", "Course Stream", "Assignment Title", "Assignment Description");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < combineAssignmentAndCourses.size(); i++) {
                if ((combineAssignmentAndCourses.get(i).getCourse().getStream()).equals(dokimh.getStream()) && (combineAssignmentAndCourses.get(i).getCourse().getTitle()).equals(dokimh.getTitle())) {
                    System.out.print(i);
                    System.out.format("%8s %13s %14s %22s  %n", combineAssignmentAndCourses.get(i).getCourse().getTitle(),
                            combineAssignmentAndCourses.get(i).getCourse().getStream(),
                            combineAssignmentAndCourses.get(i).getAssignment().getTitle(),
                            combineAssignmentAndCourses.get(i).getAssignment().getDescription());
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

    public void EmfanishAntistoixiaOlwnTwnAssignmentsMeTaCourses() {
        if (combineAssignmentAndCourses.isEmpty()) {
            System.out.println("Oxrhsths den exei ftia3ei thn antistoixia Assignment - Course");
        }
        System.out.format("%14s %13s %14s %15s  %n", "Course Title", "Course Stream", "Assignment Title", "Assignment Description");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < combineAssignmentAndCourses.size(); i++) {
            System.out.print(i);
            System.out.format("%8s %13s %14s %22s  %n", combineAssignmentAndCourses.get(i).getCourse().getTitle(),
                    combineAssignmentAndCourses.get(i).getCourse().getStream(),
                    combineAssignmentAndCourses.get(i).getAssignment().getTitle(),
                    combineAssignmentAndCourses.get(i).getAssignment().getDescription());
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
                EmfanishAntistoixiaOlwnTwnAssignmentsMeTaCourses();
                break;
            case 2:
                EmfanishAntistoixiaAssignmentsMeCourses();
                break;
            default:
                break;
        }
    }

    public Course getCourse() {
        return course;
    }

    public BaseisAna8esewn getbA() {
        return bA;
    }

    public BaseisCourses getbC() {
        return bC;
    }

    public Assignment getAssigment() {
        return assigment;
    }

    public ElegxoiMetablhtwn getEm() {
        return em;
    }

    public DhmiourgiaAntistoixiasAssignmentAndCourse getDac() {
        return dac;
    }

    public ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> getCombineAssignmentAndCourses() {
        return combineAssignmentAndCourses;
    }

    public ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> getExistsAssignmentAndCourses() {
        return existsAssignmentAndCourses;
    }

    public ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> getExistsAssignmentAndCourses2() {
        return existsAssignmentAndCourses2;
    }

}
