package tools;

import dhmiourgiaBasewndedomenwn.AssignementsPerStudentToEachCourseThsBashsDedomenwn;
import dhmiourgiaBasewndedomenwn.AssignmentAndCourseThsBashsDedomenwn;
import dhmiourgiaBasewndedomenwn.BaseisAna8esewn;
import dhmiourgiaBasewndedomenwn.BaseisCourses;
import dhmiourgiaBasewndedomenwn.BaseisMa8htwn;
import dhmiourgiaBasewndedomenwn.BaseisTrainers;
import dhmiourgiaBasewndedomenwn.DateSubmittedThsBashsDedomenwn;
import dhmiourgiaBasewndedomenwn.StudentAndCourseThsBashsDedomenwn;
import dhmiourgiaBasewndedomenwn.TrainerAndCourseThsBashsDedomenwn;
import elegxoi.ElegxoiMetablhtwn;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import klaseis.Assignment;
import klaseis.Course;
import klaseis.DateSubmitted;
import klaseis.DhmiourgiaAntistoixiasAssignmentAndCourse;
import klaseis.DhmiourgiaAntistoixiasStudentAnCourses;
import klaseis.DhmiourgiaAntistoixiasTrainerAndCourse;
import klaseis.DhmiourgiaAssignementsPerStudentToEachCourse;
import klaseis.Student;
import klaseis.Trainer;

public class MenouEpilogwn {

    private int i;

    Scanner scan = new Scanner(System.in);
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn(); //gia na elegxoume tis times pou eisagei o xrhsths
    BaseisMa8htwn bM = new BaseisMa8htwn();
    BaseisTrainers bT = new BaseisTrainers();
    BaseisCourses bC = new BaseisCourses();
    BaseisAna8esewn bA = new BaseisAna8esewn();
    StudentAndCourseThsBashsDedomenwn bsc = new StudentAndCourseThsBashsDedomenwn();
    TrainerAndCourseThsBashsDedomenwn btc = new TrainerAndCourseThsBashsDedomenwn();
    AssignmentAndCourseThsBashsDedomenwn bac = new AssignmentAndCourseThsBashsDedomenwn();
    AssignementsPerStudentToEachCourseThsBashsDedomenwn basc = new AssignementsPerStudentToEachCourseThsBashsDedomenwn();
    // StudentAndCourseThsBashsDedomenwn bsc = new StudentAndCourseThsBashsDedomenwn();
    DateSubmitted dateSubmitted = new DateSubmitted();
    DateSubmittedThsBashsDedomenwn dateSubmittedThsBashsDedomenwn = new DateSubmittedThsBashsDedomenwn();

    Student s = new Student();
    Trainer t = new Trainer();
    Course c = new Course();
    Assignment a = new Assignment();
    DhmiourgiaAntistoixiasStudentAnCourses dsc = new DhmiourgiaAntistoixiasStudentAnCourses();
    DhmiourgiaAntistoixiasTrainerAndCourse dtc = new DhmiourgiaAntistoixiasTrainerAndCourse();
    DhmiourgiaAntistoixiasAssignmentAndCourse dac = new DhmiourgiaAntistoixiasAssignmentAndCourse();
    DhmiourgiaAssignementsPerStudentToEachCourse das = new DhmiourgiaAssignementsPerStudentToEachCourse();

    ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> studentAnCoursesesAntistoixiathsBashDedomenwn = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>();
    ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> studentAnCoursesesAntistoixiathsBashDedomenwn1 = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>();
    ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> studentAnCoursesesAntistoixiathsBashDedomenwn2 = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>();

    String antistoixiaStudentCources = "";

    public MenouEpilogwn() {

    }

    public boolean menouMeToDikaiwmaEpiloghs() {
        int choise = 5;

//sthn periptwsh pou 8es na guriseis sthn arxikh lista menou
        String returnStoArxikoMenou = "";
        String returnMenouMeListes = "";

        while (!returnStoArxikoMenou.equals("r")) {
            while (choise != 1 && choise != 2 && choise != 3 && choise != 4) {
                System.out.println("*****************************O XRHSTHS PROS8ETEI TA DEDOMENA************************************");
                System.out.println("1) EAN 8ES NA PROS8ESEIS ESY TA STOIXEIA ");
                System.out.println("2) EAN 8ES NA TA DEIS AYTA POU EFTIA3ES ");
                System.out.println("*************TA DEDOMENA YPARXOUN K O XRHSTHS PREPEI NA KANEI TIS KATALLHLES ANTISTOIXHSEIS********************");
                System.out.println("3) EAN 8ES NA TA PAREIS ETOIMA KAI NA KANEIS EPIPLEON ANTISTOIXIES K NA XRHSIMOPOIHSEIS K TA KAINOURGIA DEDOMENA");
                System.out.println("4) EAN 8ES NA EMFANISTOUN OLA TA DEDOMENA TA 'DEFAULT' POU UPARXOUN KAPOIA ETOIMA K 'AUTA POU EFTIA3ES' ");
                choise = em.ElegxosGiaIntMetablhth(choise);
            }

            System.out.println("1. Για λιστα students ");
            System.out.println("2. Για λιστα Trainers ");
            System.out.println("3. Για λιστα courses ");
            System.out.println("4. Για λιστα Assignments ");
            System.out.println("5. Για λιστα students - courses ");
            System.out.println("6. Εμφανιση λιστας Trainers - courses ");
            System.out.println("7. Εμφανιση λιστας Assignments - courses ");
            System.out.println("8. Εμφανιση λιστας Assignments - Students ");
            System.out.println("9. Εμφανιση λιστας Μαθητων που ανηκουν παραπανς απο ενα μαθηματα");
            System.out.println("10.Εμφανιση λιστας Των Assignment που πρεπει να παραδωθουν εντος της εβδομαδας που δηλωσει ο χρηστης");

            System.out.println("Dwse poia epilogh 8es");
            i = em.ElegxosGiaIntMetablhth(i);
            while (i < 1 || i > 10) {
                System.out.println("Edwses la8os epilogh 3anadwse");
                // i = Integer.parseInt(scan.nextInt());
                i = Integer.parseInt(scan.nextLine());
                //edw mporei na 8elei nextline
            }
//*******************************************ta dhmiourgoume emeis**************************************************************************

            if (choise == 1) {
                if (i == 1) {
                    System.out.println("*********************MA8HTES***********************************");
                    s.DhmiourgiaMa8htwnApoTonXrhsth(); //dhmiourgia mias Arraylist
                } else if (i == 2) {
                    System.out.println("*********************EKPAIDEYTES***********************************");
                    t.DhmiourgiaTrainersApoTonXrhsth(); //dhmiourgia mias Arraylist
                } else if (i == 3) {
                    System.out.println("*********************Ma8hmata***********************************");
                    c.DhmiourgiaMa8hatwntwnApoTonXrhsth();
                } else if (i == 4) {
                    System.out.println("*********************ANA8ESEIS***********************************");
                    a.DhmiourgiaAna8esewnApoTonXrhsth();
                } else if (i == 5) {
                    System.out.println("*********************DHMIOURGIA ANTISTOIXIA MA8HMATWN - MA8HTWN***********************************");
                    dsc.antistoixiaStudentsMeCourses();
                } else if (i == 6) {
                    System.out.println("*********************DHMIOURGIA ANTISTOIXIA COURSES - TRAINERS***********************************");
                    dtc.antistoixiaTrainersMeCourses();
                } else if (i == 7) {
                    System.out.println("*********************DHMIOURGIA ANTISTOIXIA COURSES - ASSIGMENTS***********************************");
                    dac.AntistoixiasAssignmentAndCourse();
                } else if (i == 8) {
                    System.out.println("*********************DHMIOURGIA ANTISTOIXIA STUDENTS - ASSIGMENTS***********************************");
                    // dac.AntistoixiasAssignmentAndCourse();
                    das.DhmiourgiaAntistoixiaAssignmentsPerStudents();

                } else if (i == 9) {
                    System.out.println("*********************MA8HTES POU ANHKOUN SE PARAPANW APO 1 COURSE APO TH BASH DEDOMENWN***********************************");
                    System.out.println("GIA NA DEIS TOUS MA8HTES POU ANHOUN SE PARAPANW APO 1 COURSES PATHSE THN EPILOGH 2 K META THN EPILOGH 9");

                } else if (i == 10) {
                    System.out.println("********************ASSIGNMENT POU PREPEI NA PARADW8OUN ENTOS THS PRO8ESMIAS POU UPOBALEI O XRHSTHS***********************************");
                    System.out.println("EPELE3E THN EPILOGH 2 KAI META THN EPILOGH 10 GIA NA DEIS TIS ERGASIES ENTOS THS EBDOMADAS POU UPOBALEI O XRHSTHS");
                }
            } else if (choise == 2) {
                if (i == 1) {
                    System.out.println("*********************MA8HTES***********************************");
                    s.EmfanishListasMa8htwn();
                } else if (i == 2) {
                    System.out.println("*********************EKPAIDEYTES***********************************");
                    t.EmfanishListasTrainer();
                } else if (i == 3) {
                    System.out.println("*********************Ma8hmata***********************************");
                    c.EmfanishListasCourse();
                } else if (i == 4) {
                    System.out.println("*********************ANA8ESEIS***********************************");
                    a.EmfanishListasAna8esewn();
                } else if (i == 5) {
                    System.out.println("*********************DHMIOURGIA ANTISTOIXIA MA8HMATWN - MA8HTWN***********************************");
                    dsc.MenouEpiolghsEmfanishsStudentPerCoursesHOlwnTwnStudent();
                } else if (i == 6) {
                    System.out.println("*********************DHMIOURGIA ANTISTOIXIA COURSES - TRAINERS***********************************");
                    dtc.MenouEpiolghsEmfanishsTrainerPerCoursesHOlwnTwnTRainer();
                } else if (i == 7) {
                    System.out.println("*********************DHMIOURGIA ANTISTOIXIA COURSES - ASSIGMENTS***********************************");
                    dac.MenouEpiolghsEmfanishsAssignmentPerCoursesHOlwnTwnAssignment();
                } else if (i == 8) {
                    System.out.println("*********************DHMIOURGIA ANTISTOIXIA STUDENTS - ASSIGMENTS***********************************");
                    das.MenouEpiolghsEmfanishsStudentPerAssignmentsHOlwnTwnStudent();
                } else if (i == 9) {
                    System.out.println("*********************MA8HTES POU ANHKOUN SE PARAPANW APO 1 COURSE ***********************************");
                    dsc.EktupwshStudentAndCourse();
                    dsc.ElegxosStudentParakolou8eiPerissoteraCourses();
                } else if (i == 10) {
                    System.out.println("*********************ASSIGNMENT POU PREPEI NA PARADW8OUN ENTOS THS PRO8ESMIAS POU UPOBALEI O XRHSTHS***********************************");
                    dateSubmitted.EmfanishListasMa8htwnPouParedewsanTisErgasies();
                    dateSubmitted.ElegxosGiaThnHmeromhniaYpobilhsKa8eErgasias();
                }
            } else if (choise == 3) {
                if (i == 1) {
                    System.out.println("*********************MA8HTES APO TH BASH DEDOMENWN***********************************");
                    bM.DhmiourgiaArrayListMa8htwn(Student.getMa8htes());
                    bM.EmfanishMa8htwn();
                } else if (i == 2) {
                    System.out.println("*********************EKPAIDEYTES APO TH BASH DEDOMENWN***********************************");
                    bT.DhmiourgiaArrayListTrainers(Trainer.getTrainers());
                    bT.EmfanishEkpaideutwn();
                } else if (i == 3) {
                    System.out.println("*********************Ma8hmata APO TH BASH DEDOMENWN***********************************");
                    //Plhrofories pou aforoun ta ma8hta
                    bC.DhmiourgiaArrayListMa8hmatwn(Course.getCourses());
                    bC.EmfanishCourses();
                } else if (i == 4) {
                    System.out.println("*********************ANA8ESEWN APO TH BASH DEDOMENWN***********************************");
                    //Plhrofories pou aforoun ta ma8hta
                    bA.DhmiourgiaArrayListAna8esewn(Assignment.getAssignments());
                    bA.EmfanishAssigment();

                } else if (i == 5) {
                    System.out.println("*********************ANTISTOIXIA MA8HMATWN - MA8HTWN APO TH BASH DEDOMENWN***********************************");
                    bsc.DhmiourgiaAntistoixiaStudentAndCourse(dsc.getNeadhmiourgiaStudentAndCourses());
                    bsc.AntistoixiaStudentsMeCoursesThsBashsDedomenwn(dsc.getNeadhmiourgiaStudentAndCourses());

                } else if (i == 6) {
                    System.out.println("*********************ANTISTOIXIA COURSES - TRAINERS APO TH BASH DEDOMENWN***********************************");
                    btc.DhmiourgiaAntistoixiaTrainerAndCourse(dtc.getNeadhmiourgiaTrainersAndCourses());
                    btc.AntistoixiaTrainerMeCourseThsBashsDedomenwn(dtc.getNeadhmiourgiaTrainersAndCourses());
                } else if (i == 7) {
                    System.out.println("*********************ANTISTOIXIA COURSES - ASSIGNEMENTS APO TH BASH DEDOMENWN***********************************");
                    bac.DhmiourgiaAntistoixiaAssigmentAndCourse(dac.getNeadhmiourgiaAssignmentsAndCourses());
                    bac.AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(dac.getNeadhmiourgiaAssignmentsAndCourses());
                } else if (i == 8) {
                    System.out.println("*********************ANTISTOIXIA STUDENTS - ASSIGNEMENTS APO TH BASH DEDOMENWN***********************************");
                    basc.DhmiourgiaAntistoixiaAssignmentsPerStudents(das.getNeaAssignementsPerStudentToEachCourses());
                    basc.AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(das.getNeaAssignementsPerStudentToEachCourses());
                } else if (i == 9) {
                    System.out.println("*********************MA8HTES POU ANHKOUN SE PARAPANW APO 1 COURSE APO TH BASH DEDOMENWN***********************************");
                    System.out.println("GIA NA DEIS TOUS MA8HTES POU ANHOUN SE PARAPANW APO 1 COURSES PATHSE THN EPILOGH 4 K META THN EPILOGH 9");
                } else if (i == 10) {
                    System.out.println("********************ASSIGNMENT POU PREPEI NA PARADW8OUN ENTOS THS PRO8ESMIAS POU UPOBALEI O XRHSTHS***********************************");
                    System.out.println("EPELE3E THN EPILOGH 4 KAI META THN EPILOGH 10 GIA NA DEIS THS ERGASIES ENTOS THS EBDOMADAS POU UPOBALEI O XRHSTHS");
                }
            } else if (choise == 4) {
                if (i == 1) {
                    System.out.println("*********************MA8HTES APO TH BASH DEDOMENWN***********************************");
                    bM.DhmiourgiaArrayListMa8htwn(s.getMa8htes());
                    bM.EmfanishMa8htwn();
                } else if (i == 2) {
                    System.out.println("*********************EKPAIDEYTES APO TH BASH DEDOMENWN***********************************");
                    bT.DhmiourgiaArrayListTrainers(t.getTrainers());
                    bT.EmfanishEkpaideutwn();
                } else if (i == 3) {
                    System.out.println("*********************Ma8hmata APO TH BASH DEDOMENWN***********************************");
                    //Plhrofories pou aforoun ta ma8hta
                    bC.DhmiourgiaArrayListMa8hmatwn(c.getCourses());
                    bC.EmfanishCourses();
                } else if (i == 4) {
                    System.out.println("*********************ANA8ESEWN APO TH BASH DEDOMENWN***********************************");
                    //Plhrofories pou aforoun ta ma8hta
                    bA.DhmiourgiaArrayListAna8esewn(a.getAssignments());
                    bA.EmfanishAssigment();

                } else if (i == 5) {
                    System.out.println("*********************ANTISTOIXIA MA8HMATWN - MA8HTWN APO TH BASH DEDOMENWN***********************************");
                    bsc.AntistoixiaStudentsMeCoursesThsBashsDedomenwn(dsc.getNeadhmiourgiaStudentAndCourses());
                    bsc.MenouEpiolghsEmfanishsStudentPerCoursesHOlwnTwnStudent();

                } else if (i == 6) {
                    System.out.println("*********************ANTISTOIXIA COURSES - TRAINERS APO TH BASH DEDOMENWN***********************************");
                    btc.AntistoixiaTrainerMeCourseThsBashsDedomenwn(dtc.getNeadhmiourgiaTrainersAndCourses());
                    btc.MenouEpiolghsEmfanishsTrainerPerCoursesHOlwnTwnTRainer();
                } else if (i == 7) {
                    System.out.println("*********************ANTISTOIXIA COURSES - ASSIGNEMENTS APO TH BASH DEDOMENWN***********************************");
                    bac.AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(dac.getNeadhmiourgiaAssignmentsAndCourses());
                    bac.MenouEpiolghsEmfanishsStudentPerCoursesHOlwnTwnStudent();

                } else if (i == 8) {
                    System.out.println("*********************ANTISTOIXIA STUDENTS - ASSIGNEMENTS APO TH BASH DEDOMENWN***********************************");
                    basc.AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(das.getNeaAssignementsPerStudentToEachCourses());
                    basc.MenouEpiolghsEmfanishsStudentPerAssignmentsHOlwnTwnStudent();
                    // basc.EmfanishAssigmentPerCourse();

                } else if (i == 9) {
                    System.out.println("*********************MA8HTES POU ANHKOUN SE PARAPANW APO 1 COURSE APO TH BASH DEDOMENWN***********************************");
                    // bsc = new StudentAndCourseThsBashsDedomenwn();
                    bsc.AntistoixiaStudentsMeCoursesThsBashsDedomenwn(dsc.getNeadhmiourgiaStudentAndCourses());
                    bsc.EmfanishAntistoixiaOlwnTwnStudentMeTaCourses();
                    bsc.ElegxosStudentParakolou8eiPerissoteraCourses();

                } else if (i == 10) {
                    System.out.println("*********************ASSIGNMENT POU PREPEI NA PARADW8OUN ENTOS THS PRO8ESMIAS POU UPOBALEI O XRHSTHS***********************************");
                    dateSubmittedThsBashsDedomenwn.EmfanishListasMa8htwnPouParedewsanTisErgasies();
                    dateSubmittedThsBashsDedomenwn.ElegxosGiaThnHmeromhniaYpobilhsKa8eErgasias();
                }
            }
            System.out.println("Ean 8es na guriseis sto arxiko menou gia na epile3eis 1)an 8es na mpeis sth bash dedomenwn "
                    + "2)h na pros8eseis dedemena    h pata 'r' alliws pata kapoia allo koumpi");
            returnStoArxikoMenou = scan.nextLine();
        }

        System.out.println("Ean 8es na termathsei to programma pata 'stop' alliws pata kapoio allo koumpi");
        String telos = scan.nextLine();
        if (telos.equals("stop")) {
            return true;
        }

        return false;

    }

}
