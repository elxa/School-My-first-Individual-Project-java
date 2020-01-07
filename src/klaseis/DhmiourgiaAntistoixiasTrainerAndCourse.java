package klaseis;

import elegxoi.ElegxoiMetablhtwn;
import elegxoi.ElegxosYpar3hsStoixeiwnMesaSthLista;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;
import static klaseis.DhmiourgiaAntistoixiasStudentAnCourses.dhmiourgiaStudentAndCourses;

public class DhmiourgiaAntistoixiasTrainerAndCourse {

    Course course = new Course();
    Trainer trainer = new Trainer();
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();

    static ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> dhmiourgiaTrainersAndCourses = new ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse>();
    static ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> neadhmiourgiaTrainersAndCourses = new ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse>();
    Scanner scan = new Scanner(System.in);

    public DhmiourgiaAntistoixiasTrainerAndCourse(Course course, Trainer trainer) {
        this.course = course;
        this.trainer = trainer;
    }

    public DhmiourgiaAntistoixiasTrainerAndCourse() {
    }

    public void antistoixiaTrainersMeCourses() {
        String stop = " ";
        boolean existList = true;
        if (course.getCourses().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei courses");
            existList = false; //efoson den uparxei bgainoume e3w apo th me8odo

        }
        if (trainer.getTrainers().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei trainers");
            //efoson den uparxei bgainoume e3w apo th me8odo  
            existList = false;
        } else {

            while (!stop.equals("stop") && existList == true) {
                System.out.println("*************************Exoume ta e3hs Ma8hmata******************************");
                System.out.println("");
                course.EmfanishListasCourse();
                System.out.println("***********************Exoume tous e3hs Trainers**********************************");
                System.out.println("");
                trainer.EmfanishListasTrainer();

                System.out.println("Diale3e to ma8hma ");
                int epiloghCourses = 0;
                epiloghCourses = em.ElegxosGiaIntMetablhth(epiloghCourses);
                while (epiloghCourses >= course.getCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourses = em.ElegxosGiaIntMetablhth(epiloghCourses);
                }

                System.out.println("Diale3e to trainer se opoio ma8hma 8es");
                int epiloghTrainer = 0;
                epiloghTrainer = em.ElegxosGiaIntMetablhth(epiloghTrainer);
                while (epiloghTrainer >= trainer.getTrainers().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghTrainer = em.ElegxosGiaIntMetablhth(epiloghTrainer);
                }

                DhmiourgiaAntistoixiasTrainerAndCourse dtc = new DhmiourgiaAntistoixiasTrainerAndCourse(course.getCourses().get(epiloghCourses), trainer.getTrainers().get(epiloghTrainer));
                dhmiourgiaTrainersAndCourses.add(dtc);

                //elegxoume me auto ton tropo an o trainer exei proste8ei sto ma8hma h oxi 
                if (ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaToEanOTrainerExeiProste8eiStoCourse(dhmiourgiaTrainersAndCourses, dhmiourgiaTrainersAndCourses.get(dhmiourgiaTrainersAndCourses.size() - 1)) == true) {
                } else {
                    neadhmiourgiaTrainersAndCourses.add(dtc);
                }

                System.out.println("ean 8es na stamathseis pata 'stop'");
                stop = scan.nextLine();
            }
        }

    }

    public void EmfanishAntistoixiaTrainersMeCourses() {
        String epilogh = "";
        if (!(course.getCourses().isEmpty()) && !(trainer.getTrainers().isEmpty())) {
            do {
                System.out.println("********************Exoume ta e3hs Ma8hmata*************************");
                System.out.println("");
                course.EmfanishListasCourse();
                System.out.println("Diale3e to ma8hma sto opoio 8es na emfanistoun poioi trainers to didaskoun");
                int epiloghCourse = 0;
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                while (epiloghCourse >= course.getCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                }
                Course dokimh = Course.getCourses().get(epiloghCourse);

                System.out.format("%14s %12s %19s %22s  %n", "Title", "Stream", "First Name", "Last Name");
                System.out.println("----------------------------------------------------------------------");
                for (int i = 0; i < neadhmiourgiaTrainersAndCourses.size(); i++) {
                    if ((neadhmiourgiaTrainersAndCourses.get(i).getCourse().getStream()).equals(dokimh.getStream()) && (neadhmiourgiaTrainersAndCourses.get(i).getCourse().getTitle()).equals(dokimh.getTitle())) {
                        System.out.print(i);
                        System.out.format("%15s %12s %17s %21s %n", neadhmiourgiaTrainersAndCourses.get(i).getCourse().getTitle(),
                                neadhmiourgiaTrainersAndCourses.get(i).getCourse().getStream(),
                                neadhmiourgiaTrainersAndCourses.get(i).getTrainer().getFirstName(),
                                neadhmiourgiaTrainersAndCourses.get(i).getTrainer().getLastName());
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

    public void EmfanishAntistoixiaOlwnTwnTrainerMeTaCourses() {
        if (neadhmiourgiaTrainersAndCourses.isEmpty()) {
            System.out.println("Oxrhsths den exei ftia3ei thn antistoixia Trainers - Course");
        }
        System.out.format("%14s %12s %19s %22s  %n", "Title", "Stream", "First Name", "Last Name");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < neadhmiourgiaTrainersAndCourses.size(); i++) {
            System.out.print(i);
            System.out.format("%15s %12s %17s %21s %n", neadhmiourgiaTrainersAndCourses.get(i).getCourse().getTitle(),
                    neadhmiourgiaTrainersAndCourses.get(i).getCourse().getStream(),
                    neadhmiourgiaTrainersAndCourses.get(i).getTrainer().getFirstName(),
                    neadhmiourgiaTrainersAndCourses.get(i).getTrainer().getLastName());
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

    public Course getCourse() {
        return course;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public static ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> getNeadhmiourgiaTrainersAndCourses() {
        return neadhmiourgiaTrainersAndCourses;
    }

}
