package dhmiourgiaBasewndedomenwn;

import elegxoi.ElegxoiMetablhtwn;
import elegxoi.ElegxosYpar3hsStoixeiwnMesaSthLista;
import java.util.ArrayList;
import java.util.Scanner;
import klaseis.Course;
import klaseis.DhmiourgiaAntistoixiasStudentAnCourses;
import klaseis.DhmiourgiaAntistoixiasTrainerAndCourse;
import klaseis.DhmiourgiaAssignementsPerStudentToEachCourse;
import klaseis.Student;
import klaseis.Trainer;

public class TrainerAndCourseThsBashsDedomenwn {

    BaseisTrainers bT = new BaseisTrainers();
    BaseisCourses bC = new BaseisCourses();
    Course course = new Course();
    Trainer trainer = new Trainer();
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();
    DhmiourgiaAntistoixiasTrainerAndCourse dtc = new DhmiourgiaAntistoixiasTrainerAndCourse();

    ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> combineTrainerAndCourses = new ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse>();
    ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> existsTrainerAndCourses0 = new ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse>();
    ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> existsTrainerAndCourses00 = AntistoixiaTrainerMeCourse();
    ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> existsTrainerAndCourses = new ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse>();
    ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> existsTrainerAndCourses2 = new ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse>();

    Scanner scan = new Scanner(System.in);

    public TrainerAndCourseThsBashsDedomenwn() {
    }

    private ArrayList AntistoixiaTrainerMeCourse() {

        bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses());
        bT.DhmiourgiaArrayListTrainers(trainer.getTrainers());

        DhmiourgiaAntistoixiasTrainerAndCourse tc1 = new DhmiourgiaAntistoixiasTrainerAndCourse(bC.getCombineCourses().get(0), bT.getCombineTrainers().get(0));
        existsTrainerAndCourses0.add(tc1);
        DhmiourgiaAntistoixiasTrainerAndCourse tc2 = new DhmiourgiaAntistoixiasTrainerAndCourse(bC.getCombineCourses().get(0), bT.getCombineTrainers().get(1));
        existsTrainerAndCourses0.add(tc2);
        DhmiourgiaAntistoixiasTrainerAndCourse tc3 = new DhmiourgiaAntistoixiasTrainerAndCourse(bC.getCombineCourses().get(1), bT.getCombineTrainers().get(3));
        existsTrainerAndCourses0.add(tc3);
        DhmiourgiaAntistoixiasTrainerAndCourse tc4 = new DhmiourgiaAntistoixiasTrainerAndCourse(bC.getCombineCourses().get(1), bT.getCombineTrainers().get(1));
        existsTrainerAndCourses0.add(tc4);
        DhmiourgiaAntistoixiasTrainerAndCourse tc5 = new DhmiourgiaAntistoixiasTrainerAndCourse(bC.getCombineCourses().get(1), bT.getCombineTrainers().get(0));
        existsTrainerAndCourses0.add(tc5);
        DhmiourgiaAntistoixiasTrainerAndCourse tc6 = new DhmiourgiaAntistoixiasTrainerAndCourse(bC.getCombineCourses().get(0), bT.getCombineTrainers().get(2));
        existsTrainerAndCourses0.add(tc6);
        DhmiourgiaAntistoixiasTrainerAndCourse tc7 = new DhmiourgiaAntistoixiasTrainerAndCourse(bC.getCombineCourses().get(4), bT.getCombineTrainers().get(4));
        existsTrainerAndCourses0.add(tc7);
        DhmiourgiaAntistoixiasTrainerAndCourse tc8 = new DhmiourgiaAntistoixiasTrainerAndCourse(bC.getCombineCourses().get(3), bT.getCombineTrainers().get(0));
        existsTrainerAndCourses0.add(tc8);

        return existsTrainerAndCourses0;

    }

    public void DhmiourgiaAntistoixiaTrainerAndCourse(ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> newTrainerAndCourse) {

        String epilogh = "";
        String epiloghGiaNaStamathseiHAntistoixia = "";

        do {
            System.out.println("*************************Exoume ta e3hs Ma8hmata************************************");
            System.out.println("");
            bC.DhmiourgiaArrayListMa8hmatwn(Course.getCourses());
            bC.EmfanishCourses();

            System.out.println("*************************Exoume tous e3hs Trainers****************************************");
            System.out.println("");
            bT.DhmiourgiaArrayListTrainers(Trainer.getTrainers());
            bT.EmfanishEkpaideutwn();

            System.out.println("");

            System.out.println("Diale3e to course");
            int epiloghCourse = 0;
            epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            while (epiloghCourse >= bC.getCombineCourses().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            }

            System.out.println("Diale3e ton Trainer");
            int epiloghTrainer = 0;
            epiloghTrainer = em.ElegxosGiaIntMetablhth(epiloghTrainer);
            while (epiloghTrainer >= bT.getCombineTrainers().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghTrainer = em.ElegxosGiaIntMetablhth(epiloghTrainer);
            }

            Course course = bC.getCombineCourses().get(epiloghCourse);
            Trainer trainer = bT.getCombineTrainers().get(epiloghTrainer);
            DhmiourgiaAntistoixiasTrainerAndCourse bTC = new DhmiourgiaAntistoixiasTrainerAndCourse(course, trainer);
            existsTrainerAndCourses.add(bTC);

            boolean existelement1 = false;
            for (int i = 0; i < newTrainerAndCourse.size(); i++) {
                if (newTrainerAndCourse.get(i).getCourse().getTitle().equals(course.getTitle())
                        && newTrainerAndCourse.get(i).getCourse().getStream().equals(course.getStream())
                        && newTrainerAndCourse.get(i).getTrainer().getFirstName().equals(trainer.getFirstName())
                        && newTrainerAndCourse.get(i).getTrainer().getLastName().equals(trainer.getLastName())) {
                    System.out.println("to stoixeio uparxei hdh");
                    existelement1 = true;
                }
            }
//pros8etoume to nea antistoixia mono sthn periptwsh pou den uparxei
            boolean existelement = false;
            for (int i = 0; i < existsTrainerAndCourses0.size(); i++) {
                if (existsTrainerAndCourses0.get(i).getCourse().getTitle().equals(course.getTitle())
                        && existsTrainerAndCourses0.get(i).getCourse().getStream().equals(course.getStream())
                        && existsTrainerAndCourses0.get(i).getTrainer().getFirstName().equals(trainer.getFirstName())
                        && existsTrainerAndCourses0.get(i).getTrainer().getLastName().equals(trainer.getLastName())) {
                    System.out.println("to stoixeio uparxei hdh");
                    existelement = true;
                }
            }

            if ((ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaToEanOTrainerExeiProste8eiStoCourse(existsTrainerAndCourses, existsTrainerAndCourses.get(existsTrainerAndCourses.size() - 1)) == true)) {
            }
            if (existelement == false && existelement1 == false) {
                existsTrainerAndCourses2.add(bTC);
            }
            System.out.println("Ean 8es na stamathseis tis antistoixies twn assignement per student se ka8e course pata 's' alliws gia sunexeia pata 'n'");
            epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
            while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")) && !(epiloghGiaNaStamathseiHAntistoixia.equals("n"))) {
                System.out.println("den edwses swsto ari8mo 's' h 'n'");
                epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
            }
        } while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")));
    }

    public ArrayList AntistoixiaTrainerMeCourseThsBashsDedomenwn(ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> newTrainerAndCourse) {

        for (int i = 0; i < existsTrainerAndCourses0.size(); i++) {
            if (combineTrainerAndCourses.contains(existsTrainerAndCourses0.get(i))) {
            } else {
                combineTrainerAndCourses.add(existsTrainerAndCourses0.get(i));
            }
        }
        for (int i = 0; i < existsTrainerAndCourses2.size(); i++) {
            if (combineTrainerAndCourses.contains(existsTrainerAndCourses2.get(i))) {
            } else {
                combineTrainerAndCourses.add(existsTrainerAndCourses2.get(i));
            }
        }
        for (int i = 0; i < newTrainerAndCourse.size(); i++) {
            if (combineTrainerAndCourses.contains(newTrainerAndCourse.get(i))) {

            } else {
                combineTrainerAndCourses.add(newTrainerAndCourse.get(i));
            }
        }
        return combineTrainerAndCourses;
    }

    public void EmfanishAntistoixiaTrainersMeCourses() {

        String epilogh = "";
        boolean existList = true;
        if (combineTrainerAndCourses.isEmpty()) {
            System.out.println("Oxrhsths den exei ftia3ei thn antistoixia Trainers - Course");
            existList = false; //efoson den uparxei bgainoume e3w apo th me8odo
        } else {
            while (!epilogh.equals("s") && existList == true) {
                System.out.println("8A EMFANISTOUN OI TRAINERS ANALOGA ME TO MA8HMA POU EPI8UMEIS NA DEIS");
                System.out.println("Exoume ta e3hs Ma8hmata");
                bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses());
                bC.EmfanishCourses();
                System.out.println("Diale3e to ma8hma sto opoio 8es na emfanistoun poioi Trainers einai");
                int epiloghCourse = 0;
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                while (epiloghCourse >= bC.getCombineCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                }
                Course dokimh = bC.getCombineCourses().get(epiloghCourse);

                System.out.format("%8s %9s %14s %12s  %n", "Title", "Stream", "First Name", "Last Name");
                System.out.println("--------------------------------------------------------------------");
                for (int i = 0; i < combineTrainerAndCourses.size(); i++) {
                    if ((combineTrainerAndCourses.get(i).getCourse().getStream()).equals(dokimh.getStream()) && (combineTrainerAndCourses.get(i).getCourse().getTitle()).equals(dokimh.getTitle())) {
                        System.out.print(i);
                        System.out.format("%7s %8s %14s %14s %n", combineTrainerAndCourses.get(i).getCourse().getTitle(),
                                combineTrainerAndCourses.get(i).getCourse().getStream(),
                                combineTrainerAndCourses.get(i).getTrainer().getFirstName(),
                                combineTrainerAndCourses.get(i).getTrainer().getLastName());

                    }
                }
                System.out.println("8es na deis allh lista me tous Trainers? ean nai pata 'n' alliws 's' ");
                epilogh = scan.nextLine();
                while (!epilogh.equals("n") && !epilogh.equals("s")) {
                    System.out.println("den edwses swsto xarakthra");
                    epilogh = scan.nextLine();
                }
            }

        }
    }

    public void EmfanishAntistoixiaOlwnTwnTrainerMeTaCourses() {
        if (combineTrainerAndCourses.isEmpty()) {
            System.out.println("Oxrhsths den exei ftia3ei thn antistoixia Trainers - Course");
        }
        System.out.format("%8s %9s %14s %12s  %n", "Title", "Stream", "First Name", "Last Name");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < combineTrainerAndCourses.size(); i++) {
            System.out.print(i);
            System.out.format("%7s %8s %14s %14s %n", combineTrainerAndCourses.get(i).getCourse().getTitle(),
                    combineTrainerAndCourses.get(i).getCourse().getStream(),
                    combineTrainerAndCourses.get(i).getTrainer().getFirstName(),
                    combineTrainerAndCourses.get(i).getTrainer().getLastName());
        }
    }

    public void MenouEpiolghsEmfanishsTrainerPerCoursesHOlwnTwnTRainer() {
        int choise = 0;
        System.out.println("1)8es na emfanistoun oloi oi Trainers me ta Courses 2) na emfanistoun Analoga me to ma8hma pou epile3eis?");
        while (choise != 1 && choise != 2) {
            choise = em.ElegxosGiaIntMetablhth(choise);
        }
        switch (choise) {
            case 1:
                EmfanishAntistoixiaOlwnTwnTrainerMeTaCourses();
                break;
            case 2:
                EmfanishAntistoixiaTrainersMeCourses();
                break;
            default:
                break;
        }
    }

    public BaseisTrainers getbT() {
        return bT;
    }

    public BaseisCourses getbC() {
        return bC;
    }

    public Course getCourse() {
        return course;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public ElegxoiMetablhtwn getEm() {
        return em;
    }

    public DhmiourgiaAntistoixiasTrainerAndCourse getDtc() {
        return dtc;
    }

    public ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> getCombineTrainerAndCourses() {
        return combineTrainerAndCourses;
    }

    public ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> getExistsTrainerAndCourses() {
        return existsTrainerAndCourses;
    }

    public Scanner getScan() {
        return scan;
    }

}
