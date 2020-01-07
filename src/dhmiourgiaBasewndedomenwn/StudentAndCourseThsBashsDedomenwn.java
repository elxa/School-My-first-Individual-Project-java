package dhmiourgiaBasewndedomenwn;

import elegxoi.ElegxoiMetablhtwn;
import elegxoi.ElegxosYpar3hsStoixeiwnMesaSthLista;
import java.util.ArrayList;
import java.util.Scanner;
import klaseis.Course;
import klaseis.DhmiourgiaAntistoixiasStudentAnCourses;
import klaseis.DhmiourgiaAntistoixiasTrainerAndCourse;
import klaseis.Student;
import klaseis.Trainer;

public class StudentAndCourseThsBashsDedomenwn {

    public StudentAndCourseThsBashsDedomenwn(Course course, Student student) {
        this.course = course;
        this.student = student;
    }

    public StudentAndCourseThsBashsDedomenwn() {

    }

    BaseisMa8htwn bM = new BaseisMa8htwn();
    BaseisCourses bC = new BaseisCourses();
    Course course = new Course();
    Student student = new Student();
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();

    ArrayList<Student> newcourseTouKa8eMa8hth = new ArrayList<Student>();

    ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> combinestudentAndCourses = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>();//proerxetai apo thn arraylist pou eisagei o xrhsths k aythw pou ta dedomena einai aetoima
    ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> existsstudentAndCourses = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>(); //ta hdh uparxonta dedomena
    ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> existsstudentAndCourses2 = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>(); //ta hdh uparxonta dedomena
    ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> existsstudentAndCourses0 = new ArrayList<DhmiourgiaAntistoixiasStudentAnCourses>(); //ta hdh uparxonta dedomena
    ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> existsstudentAndCourses00 = AntistoixiaStudentsMeCourses();

    Scanner scan = new Scanner(System.in);

    private ArrayList AntistoixiaStudentsMeCourses() {
        //Dhmiourgoume ta e3hs antikeimena
        bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses());
        bM.DhmiourgiaArrayListMa8htwn(student.getMa8htes());

        DhmiourgiaAntistoixiasStudentAnCourses sc1 = new DhmiourgiaAntistoixiasStudentAnCourses(bC.getCombineCourses().get(0), bM.getStudentsExists().get(0));//CB8", "java    "Panos", "Louk"
        existsstudentAndCourses0.add(sc1);
        DhmiourgiaAntistoixiasStudentAnCourses sc2 = new DhmiourgiaAntistoixiasStudentAnCourses(bC.getCombineCourses().get(3), bM.getStudentsExists().get(1));//"CB9", "C#" "Eugenia", "Koutsou
        existsstudentAndCourses0.add(sc2);
        DhmiourgiaAntistoixiasStudentAnCourses sc3 = new DhmiourgiaAntistoixiasStudentAnCourses(bC.getCombineCourses().get(1), bM.getStudentsExists().get(3));//"CB8", "C#" Kwstas", "Tyrob
        existsstudentAndCourses0.add(sc3);
        DhmiourgiaAntistoixiasStudentAnCourses sc4 = new DhmiourgiaAntistoixiasStudentAnCourses(bC.getCombineCourses().get(1), bM.getStudentsExists().get(1));//"CB8", "C#" "Eugenia", "Koutsou
        existsstudentAndCourses0.add(sc4);
        DhmiourgiaAntistoixiasStudentAnCourses sc5 = new DhmiourgiaAntistoixiasStudentAnCourses(bC.getCombineCourses().get(1), bM.getStudentsExists().get(0));//"CB8", "C#" Panos", "Louk
        existsstudentAndCourses0.add(sc5);
        DhmiourgiaAntistoixiasStudentAnCourses sc6 = new DhmiourgiaAntistoixiasStudentAnCourses(bC.getCombineCourses().get(0), bM.getStudentsExists().get(2));//CB8", "java" "Panos", "Konid"
        existsstudentAndCourses0.add(sc6);
        DhmiourgiaAntistoixiasStudentAnCourses sc7 = new DhmiourgiaAntistoixiasStudentAnCourses(bC.getCombineCourses().get(1), bM.getStudentsExists().get(1));//CB8", "C#" "Eugenia", "Koutsou
        existsstudentAndCourses0.add(sc7);
        DhmiourgiaAntistoixiasStudentAnCourses sc8 = new DhmiourgiaAntistoixiasStudentAnCourses(bC.getCombineCourses().get(2), bM.getStudentsExists().get(3));//CB9", "java Kwstas", "Tyrob"
        existsstudentAndCourses0.add(sc8);

        return existsstudentAndCourses0;

    }

    public ArrayList DhmiourgiaAntistoixiaStudentAndCourse(ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> newStudentAndCourses) {
        String epilogh = "";
        String epiloghGiaNaStamathseiHAntistoixia = "";

        do {
            System.out.println("****************************Exoume ta e3hs Ma8hmata**************************");
            System.out.println("");
            bC.DhmiourgiaArrayListMa8hmatwn(Course.getCourses());
            bC.EmfanishCourses();

            System.out.println("**************************Exoume tous e3hs Students****************************");
            System.out.println("");
            bM.DhmiourgiaArrayListMa8htwn(Student.getMa8htes());
            bM.EmfanishMa8htwn();

            System.out.println("");

            System.out.println("Diale3e to course");
            int epiloghCourse = 0;
            epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            while (epiloghCourse >= bC.getCombineCourses().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            }
            System.out.println("Diale3e ton Student");
            int epiloghStudent = 0;
            epiloghStudent = em.ElegxosGiaIntMetablhth(epiloghStudent);
            while (epiloghStudent >= bM.getCombineList().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghStudent = em.ElegxosGiaIntMetablhth(epiloghStudent);
            }

            Course course = bC.getCombineCourses().get(epiloghCourse);//einai to course pou exei epile3eii o xrhsths
            Student student = bM.getCombineList().get(epiloghStudent);//einai to student pou exei epile3eii o xrhsths
            DhmiourgiaAntistoixiasStudentAnCourses bSC = new DhmiourgiaAntistoixiasStudentAnCourses(course, student);//ta apo8hkeuoume se mia arraylist
            existsstudentAndCourses.add(bSC);
            boolean existelement = false;
            for (int i = 0; i < existsstudentAndCourses0.size(); i++) {
                if (existsstudentAndCourses0.get(i).getCourse().getTitle().equals(course.getTitle())
                        && existsstudentAndCourses0.get(i).getCourse().getStream().equals(course.getStream())
                        && existsstudentAndCourses0.get(i).getStudent().getFirstName().equals(student.getFirstName())
                        && existsstudentAndCourses0.get(i).getStudent().getLastName().equals(student.getLastName())) {
                    System.out.println("to stoixeio uparxei hdh");
                    existelement = true;
                }
            }
            boolean existelement1 = false;
            for (int i = 0; i < newStudentAndCourses.size(); i++) {
                if (newStudentAndCourses.get(i).getCourse().getTitle().equals(course.getTitle())
                        && newStudentAndCourses.get(i).getCourse().getStream().equals(course.getStream())
                        && newStudentAndCourses.get(i).getStudent().getFirstName().equals(student.getFirstName())
                        && newStudentAndCourses.get(i).getStudent().getLastName().equals(student.getLastName())) {
                    System.out.println("to stoixeio uparxei hdh");
                    existelement1 = true;
                }
            }
            //elegxoume me auto ton tropo an o trainer exei proste8ei sto ma8hma h oxi 
            if ((ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaToEanOStudentExeiProste8eiStoCourse(existsstudentAndCourses, existsstudentAndCourses.get(existsstudentAndCourses.size() - 1)) == true)) {
            } else {
                if (existelement == false && existelement1 == false) {
                    existsstudentAndCourses2.add(bSC);
                }
            }
            System.out.println("Ean 8es na stamathseis tis antistoixies twn Student per Course pata 's' alliws gia sunexeia pata 'n'");
            epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
            while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")) && !(epiloghGiaNaStamathseiHAntistoixia.equals("n"))) {
                System.out.println("den edwses swsto ari8mo 's' h 'n'");
                epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
            }
        } while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")));
        return existsstudentAndCourses2;
    }

    public ArrayList AntistoixiaStudentsMeCoursesThsBashsDedomenwn(ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> newStudentAndCourses) {
        for (int i = 0; i < existsstudentAndCourses00.size(); i++) {
            if (combinestudentAndCourses.contains(existsstudentAndCourses00.get(i))) {
            } else {
                combinestudentAndCourses.add(existsstudentAndCourses00.get(i));
            }
        }
        for (int i = 0; i < existsstudentAndCourses2.size(); i++) {
            if (combinestudentAndCourses.contains(existsstudentAndCourses2.get(i))) {
            } else {
                combinestudentAndCourses.add(existsstudentAndCourses2.get(i));
            }
        }
        for (int i = 0; i < newStudentAndCourses.size(); i++) {
            if (combinestudentAndCourses.contains(newStudentAndCourses.get(i))) {

            } else {
                combinestudentAndCourses.add(newStudentAndCourses.get(i));
            }
        }
        return combinestudentAndCourses;
    }

    public void EmfanishAntistoixiaStudentsMeCourses() {
        String epilogh = "";
        do {
            System.out.println("***************Exoume ta e3hs Ma8hmata****************************");
            System.out.println("");
            bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses());
            bC.EmfanishCourses();
            System.out.println("Diale3e to ma8hma sto opoio 8es na emfanistoun oi ma8htes pou to parakolou8oun");
            int epiloghCourse = 0;
            epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            while (epiloghCourse >= bC.getCombineCourses().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            }
            Course dokimh = bC.getCombineCourses().get(epiloghCourse);

            System.out.format("%13s %11s %14s %15s  %n", "CourseTitle", "CourseStream", "First Name", "Last Name");
            System.out.println("---------------------------------------------------------------------------------");
            for (int i = 0; i < combinestudentAndCourses.size(); i++) {
                if ((combinestudentAndCourses.get(i).getCourse().getStream()).equals(dokimh.getStream()) && (combinestudentAndCourses.get(i).getCourse().getTitle()).equals(dokimh.getTitle())) {
                    //   System.out.println(combinestudentAndCourses.get(i).getCourse().getTitle() + " " + combinestudentAndCourses.get(i).getCourse().getStream()
                    //         + " " + combinestudentAndCourses.get(i).getStudent().getFirstName() + " " + combinestudentAndCourses.get(i).getStudent().getLastName());
                    System.out.print(i);
                    System.out.format("%9s %11s %16s %16s %n", combinestudentAndCourses.get(i).getCourse().getTitle(),
                            combinestudentAndCourses.get(i).getCourse().getStream(),
                            combinestudentAndCourses.get(i).getStudent().getFirstName(),
                            combinestudentAndCourses.get(i).getStudent().getLastName());
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

    public void EmfanishAntistoixiaOlwnTwnStudentMeTaCourses() {
        if (combinestudentAndCourses.isEmpty()) {
            System.out.println("Oxrhsths den exei ftia3ei thn antistoixia Students - Course");
        }
        System.out.format("%13s %11s %14s %15s  %n", "CourseTitle", "CourseStream", "First Name", "Last Name");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < combinestudentAndCourses.size(); i++) {
            System.out.print(i);
            System.out.format("%9s %11s %16s %16s %n", combinestudentAndCourses.get(i).getCourse().getTitle(),
                    combinestudentAndCourses.get(i).getCourse().getStream(),
                    combinestudentAndCourses.get(i).getStudent().getFirstName(),
                    combinestudentAndCourses.get(i).getStudent().getLastName());
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
                EmfanishAntistoixiaOlwnTwnStudentMeTaCourses();
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
        bM.DhmiourgiaArrayListMa8htwn(Student.getMa8htes());
        /*  System.out.println("ddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
                    for (int i = 0; i < bM.getCombineList().size(); i++) {
                        System.out.println(bM.getCombineList().get(i).getFirstName() + " " + bM.getCombineList().get(i).getLastName());
                }
                    System.out.println("**********huhuhu*********************************");
                          for (int i = 0; i < combinestudentAndCourses.size(); i++) {
                        System.out.println(combinestudentAndCourses.get(i).getStudent().getFirstName() + " " + combinestudentAndCourses.get(i).getStudent().getLastName());
                } */

        System.out.println("**********Ara oi student pou parakolou8oun perissotera apo 1 ma8hmata einai:*****************************");
        for (int k = 0; k < bM.getCombineList().size(); k++) {
            Student dokimhStudent = bM.getCombineList().get(k);
            for (int i = 0; i < combinestudentAndCourses.size(); i++) {
                if (combinestudentAndCourses.get(i).getStudent().getFirstName().equals(dokimhStudent.getFirstName()) && combinestudentAndCourses.get(i).getStudent().getLastName().equals(dokimhStudent.getLastName())) {
                    count++;
                    if (count > 1 && count < 3) {
                        // if (count > 1 ) {
                        System.out.println(combinestudentAndCourses.get(i).getStudent().getFirstName() + " " + combinestudentAndCourses.get(i).getStudent().getLastName());

                    }
                }
            }
            count = 0;
        }

    }

    /*    public void ElegxosStudentParakolou8eiPerissoteraCourses() {

        int count = 0;

        System.out.println("Oi Students me ta antistoixa Courses einai:");
        for (int k = 0; k < bM.combineList.size(); k++) {
            Student dokimhStudent = bM.combineList.get(k);
            for (int i = 0; i < combinestudentAndCourses.size(); i++) {
                if (combinestudentAndCourses.get(i).getStudent().getFirstName().equals(dokimhStudent.getFirstName()) && combinestudentAndCourses.get(i).getStudent().getLastName().equals(dokimhStudent.getLastName())) {

                    bC.getCourseTouKa8eMa8hth().add(combinestudentAndCourses.get(i).getStudent()); //sto ka8e ma8hma pros8etw to onoma pou parakolou8ei to sugkekrimeno ma8hma
                    System.out.println(combinestudentAndCourses.get(i).getCourse().getTitle() + " " + combinestudentAndCourses.get(i).getCourse().getStream()
                            + " " + combinestudentAndCourses.get(i).getStudent().getFirstName() + " " + combinestudentAndCourses.get(i).getStudent().getLastName());
                }
            }
        }
        //me ton tropo auto tsekarw poioi ma8htes emfanizontai perissoteres apo 1 fores se ma8hmata
        System.out.println("**********Ara oi student pou parakolou8oun perissotera apo 1 ma8hmata einai:*****************************");
        for (int j = 0; j < bM.getCombineList().size(); j++) {
            for (int i = 0; i < bC.getCourseTouKa8eMa8hth().size(); i++) {
                if (bC.getCourseTouKa8eMa8hth().get(i).equals(bM.getCombineList().get(j))) {
                    count++;
                    if (count > 1) {

                        System.out.println( bC.getCourseTouKa8eMa8hth().get(i).getFirstName() + " " + bC.getCourseTouKa8eMa8hth().get(i).getLastName());
                    }
                }
            }
            count = 0;
        }
    }  */
    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public BaseisMa8htwn getbM() {
        return bM;
    }

    public BaseisCourses getbC() {
        return bC;
    }

    public ElegxoiMetablhtwn getEm() {
        return em;
    }

    public ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> getExistsstudentAndCourses() {
        return existsstudentAndCourses;
    }

    public ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> getExistsstudentAndCourses2() {
        return existsstudentAndCourses2;
    }

    public Scanner getScan() {
        return scan;
    }

    public ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> getCombinestudentAndCourses() {
        return combinestudentAndCourses;
    }

}
