package dhmiourgiaBasewndedomenwn;

import elegxoi.ElegxoiMetablhtwn;
import elegxoi.ElegxosYpar3hsStoixeiwnMesaSthLista;
import java.util.ArrayList;
import java.util.Scanner;
import klaseis.Assignment;
import klaseis.Course;
import klaseis.DhmiourgiaAntistoixiasAssignmentAndCourse;
import klaseis.DhmiourgiaAntistoixiasStudentAnCourses;
import klaseis.DhmiourgiaAssignementsPerStudentToEachCourse;
import klaseis.Student;

public class AssignementsPerStudentToEachCourseThsBashsDedomenwn {

    BaseisMa8htwn bM = new BaseisMa8htwn();
    BaseisCourses bC = new BaseisCourses();
    BaseisAna8esewn bA = new BaseisAna8esewn();

    Course course = new Course();
    Student student = new Student();
    Assignment assignment = new Assignment();
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();
    ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    ArrayList<Assignment> newassignments = new ArrayList<Assignment>();
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Student> newstudents = new ArrayList<Student>();
    ArrayList<Course> courses = new ArrayList<Course>();
    ArrayList<Course> newcourses = new ArrayList<Course>();

    DhmiourgiaAntistoixiasStudentAnCourses dsc = new DhmiourgiaAntistoixiasStudentAnCourses();
    DhmiourgiaAntistoixiasAssignmentAndCourse dac = new DhmiourgiaAntistoixiasAssignmentAndCourse();
    DhmiourgiaAssignementsPerStudentToEachCourse dasc = new DhmiourgiaAssignementsPerStudentToEachCourse();

    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> combineAssignmentsPerStudents = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();
    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> dhmiourgiaAssignmentsPerStudents = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();
    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> assignementsPerStudentToEachCourses = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();
    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> newassignementsPerStudentToEachCourses = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();

    StudentAndCourseThsBashsDedomenwn bSC = new StudentAndCourseThsBashsDedomenwn();
    AssignmentAndCourseThsBashsDedomenwn bAC = new AssignmentAndCourseThsBashsDedomenwn();

    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> combineAssignmentsPerStudent = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();
    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> existsAssignmentsPerStudent = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();
    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> existsAssignmentsPerStudent0 = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();
    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> existsAssignmentsPerStudent2 = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();
    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> existsAssignmentsPerStudent00 = AntistoixiasAssignmentsPerStudent();
    Scanner scan = new Scanner(System.in);

    private ArrayList AntistoixiasAssignmentsPerStudent() {
        //gia na ftia3oume ta dedomenena prepei prwta na dhmiourgh8oun oi antistoixes arraylist pou ta periexoun
        bM.DhmiourgiaArrayListMa8htwn(students);
        bA.DhmiourgiaArrayListAna8esewn(assignments);
        bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses());

        DhmiourgiaAssignementsPerStudentToEachCourse dasc1 = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(0), bM.getCombineList().get(1), bA.getCombineAssignments().get(0));
        existsAssignmentsPerStudent0.add(dasc1);
        DhmiourgiaAssignementsPerStudentToEachCourse dasc2 = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(1), bM.getCombineList().get(2), bA.getCombineAssignments().get(6));
        existsAssignmentsPerStudent0.add(dasc2);
        DhmiourgiaAssignementsPerStudentToEachCourse dasc3 = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(2), bM.getCombineList().get(2), bA.getCombineAssignments().get(5));
        existsAssignmentsPerStudent0.add(dasc3);
        DhmiourgiaAssignementsPerStudentToEachCourse dasc4 = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(0), bM.getCombineList().get(3), bA.getCombineAssignments().get(0));
        existsAssignmentsPerStudent0.add(dasc4);
        DhmiourgiaAssignementsPerStudentToEachCourse dasc5 = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(4), bM.getCombineList().get(3), bA.getCombineAssignments().get(1));
        existsAssignmentsPerStudent0.add(dasc5);
        DhmiourgiaAssignementsPerStudentToEachCourse dasc6 = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(2), bM.getCombineList().get(2), bA.getCombineAssignments().get(2));
        existsAssignmentsPerStudent0.add(dasc6);
        DhmiourgiaAssignementsPerStudentToEachCourse dasc7 = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(1), bM.getCombineList().get(0), bA.getCombineAssignments().get(3));
        existsAssignmentsPerStudent0.add(dasc7);
        DhmiourgiaAssignementsPerStudentToEachCourse dasc8 = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(3), bM.getCombineList().get(0), bA.getCombineAssignments().get(0));
        existsAssignmentsPerStudent0.add(dasc8);

        return existsAssignmentsPerStudent0;

    }

    public void DhmiourgiaAntistoixiaAssignmentsPerStudents(ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> newAssignmentsPerStudent) {

        //orizontai oi antistoixes arraylist assignement-course, student-course opou periexoun k ta kainourgia dedomena
        bAC.AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(dac.getNeadhmiourgiaAssignmentsAndCourses());
        bSC.AntistoixiaStudentsMeCoursesThsBashsDedomenwn(dsc.getNeadhmiourgiaStudentAndCourses());

        System.out.println(bSC.getCombinestudentAndCourses().size());
        String epilogh = "";
        String epiloghGiaNaStamathseiHAntistoixia = "";

        do {
            boolean existList1 = true;
            //emfanizontai ta courses
            System.out.println("*********************Exoume ta e3hs Ma8hmata************************");
            System.out.println("");
            bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses());
            bC.EmfanishCourses();
            System.out.println("Diale3e to ma8hma to opoio se endiaferei");
            int epiloghCourse = 0;
            epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            while (epiloghCourse >= bC.getCombineCourses().size()) { //elegxoume thn periptwsh pou o xrhsths epeile3ei kapoio noumero to opoio einai megalytero apo auto pou uparxei sthn arraylist
                System.out.println("den edwses swsto ari8mo");
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            }

            //pairnei apo8hkeuei se mia metablhth tupou course thn epilogh pou ekane o xrhsths
            Course dokimh = bC.getCombineCourses().get(epiloghCourse);
            for (int i = 0; i < bSC.getCombinestudentAndCourses().size(); i++) {
                if ((bSC.getCombinestudentAndCourses().get(i).getCourse().getTitle()).equals(dokimh.getTitle())
                        && (bSC.getCombinestudentAndCourses().get(i).getCourse().getStream()).equals(dokimh.getStream())) {
                    student = bSC.getCombinestudentAndCourses().get(i).getStudent();
                    students.add(student);
                    newstudents = ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaYpar3hDiplwnStudents(students);
                }
            }
            for (int j = 0; j < bAC.getCombineAssignmentAndCourses().size(); j++) {
                if ((bAC.getCombineAssignmentAndCourses().get(j).getCourse().getTitle()).equals(dokimh.getTitle())
                        && (bAC.getCombineAssignmentAndCourses().get(j).getCourse().getStream()).equals(dokimh.getStream())) {
                    assignment = bAC.getCombineAssignmentAndCourses().get(j).getAssignment();
                    assignments.add(assignment);
                    newassignments = ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaYpar3hDiplwnAssignement(assignments);
                }
            }

            //8a emfanistoun ta assignment k student pou antistoixoun mono sto ma8hma pou exei epile3ei o xrhsths
            /*   for (int i = 0; i < bSC.getCombinestudentAndCourses().size(); i++) {
                if ((bAC.getCombineAssignmentAndCourses().get(i).getCourse().getTitle()).equals(dokimh.getTitle()) && (bSC.getCombinestudentAndCourses().get(i).getCourse().getTitle()).equals(dokimh.getTitle())
                        && (bAC.getCombineAssignmentAndCourses().get(i).getCourse().getStream()).equals(dokimh.getStream()) && (bSC.getCombinestudentAndCourses().get(i).getCourse().getStream()).equals(dokimh.getStream())) {
                    assignment = bAC.getCombineAssignmentAndCourses().get(i).getAssignment();
                    assignments.add(assignment);
                    newassignments = ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaYpar3hDiplwnAssignement(assignments); //gia na apofugw tis epanalhpseis sthn arraylist
                    student = bSC.getCombinestudentAndCourses().get(i).getStudent();
                    students.add(student);
                    newstudents = ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaYpar3hDiplwnStudents(students);
                }
                
            }  */
            if (newstudents.isEmpty()) {
                System.out.println("den uparxoun students sto antistoixo course");
                existList1 = false;
            }
            if (newassignments.isEmpty()) {
                System.out.println("den uparxoun assignment sto antistoixo course");
                existList1 = false;
            } else if (existList1 == true) {

                //ta emfanizoume stoixismena
                System.out.println("*******************Exoume tous e3hs Students*********************************");
                System.out.println("");
                System.out.format("%13s %15s %17s %17s %n", "First Name", "Last Name", "Date Of Birth", "Tuition Fees");
                System.out.println("------------------------------------------------------------------------------------");
                for (int i = 0; i < newstudents.size(); i++) {
                    System.out.print(i);
                    System.out.format("%10s %16s %16s %16s %n", newstudents.get(i).getFirstName(),
                            newstudents.get(i).getLastName(),
                            newstudents.get(i).getDateOfBirth(),
                            newstudents.get(i).getTuitionFees());
                }
                System.out.println("******************Exoume ta e3hs Assignements**************************************");
                System.out.println("");
                System.out.format("%10s %16s %15s %13s %14s %n", "Title", "Description", "SubDateTime", "Oral Mark", "Total Mark");
                System.out.println("-----------------------------------------------------------------------------------------------");
                for (int i = 0; i < newassignments.size(); i++) {
                    System.out.print(i);
                    System.out.format("%10s %15s %14s %12s %13s %n", newassignments.get(i).getTitle(),
                            newassignments.get(i).getDescription(),
                            newassignments.get(i).getSubDateTime(),
                            newassignments.get(i).getOralMark(),
                            newassignments.get(i).getTotalMark());
                }
                String pros8hkhErgasiwnSeStudents = "";
                while (!pros8hkhErgasiwnSeStudents.equals("stop")) {
                    System.out.println("");

                    System.out.println("Diale3e to ma8hth ston opoio 8es na tou dw8oun ta assignements");
                    int epiloghStudent = 0;
                    epiloghStudent = em.ElegxosGiaIntMetablhth(epiloghStudent);
                    while (epiloghStudent >= newstudents.size()) {
                        System.out.println("den edwses swsto ari8mo");
                        epiloghStudent = em.ElegxosGiaIntMetablhth(epiloghStudent);
                    }
                    System.out.println("Diale3e to assignements");
                    int epiloghAssignements = 0;
                    epiloghAssignements = em.ElegxosGiaIntMetablhth(epiloghAssignements);
                    while (epiloghAssignements >= newassignments.size()) {
                        System.out.println("den edwses swsto ari8mo");
                        epiloghAssignements = em.ElegxosGiaIntMetablhth(epiloghAssignements);
                    }
                    student = newstudents.get(epiloghStudent);
                    assignment = newassignments.get(epiloghAssignements);
                    DhmiourgiaAssignementsPerStudentToEachCourse dasc = new DhmiourgiaAssignementsPerStudentToEachCourse(bC.getCombineCourses().get(epiloghCourse), student, assignment);
                    existsAssignmentsPerStudent.add(dasc);

                    //elegxoume ena o sunduasmos uparxei hdh sta etoima dedomena, se auta pou exei ftia3ei o xrhsths k se auta pou 3anakanei sunduasmo o xrhsth
                    boolean existelement = false;
                    for (int i = 0; i < existsAssignmentsPerStudent0.size(); i++) {
                        if (existsAssignmentsPerStudent0.get(i).getCourse().getTitle().equals(course.getTitle())
                                && existsAssignmentsPerStudent0.get(i).getCourse().getStream().equals(course.getStream())
                                && existsAssignmentsPerStudent0.get(i).getStudent().getFirstName().equals(student.getFirstName())
                                && existsAssignmentsPerStudent0.get(i).getStudent().getLastName().equals(student.getLastName())
                                && existsAssignmentsPerStudent0.get(i).getAssignment().getTitle().equals(assignment.getTitle())
                                && existsAssignmentsPerStudent0.get(i).getAssignment().getDescription().equals(assignment.getDescription())) {
                            System.out.println("to stoixeio uparxei hdh");
                            existelement = true;
                        }
                    }
                    boolean existelement1 = false;
                    for (int i = 0; i < newAssignmentsPerStudent.size(); i++) {
                        if (newAssignmentsPerStudent.get(i).getCourse().getTitle().equals(course.getTitle())
                                && newAssignmentsPerStudent.get(i).getCourse().getStream().equals(course.getStream())
                                && newAssignmentsPerStudent.get(i).getStudent().getFirstName().equals(student.getFirstName())
                                && newAssignmentsPerStudent.get(i).getStudent().getLastName().equals(student.getLastName())
                                && newAssignmentsPerStudent.get(i).getAssignment().getTitle().equals(assignment.getTitle())
                                && newAssignmentsPerStudent.get(i).getAssignment().getDescription().equals(assignment.getDescription())) {
                            System.out.println("to stoixeio uparxei hdh");
                            existelement = true;
                        }
                    }
                    if ((ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaToEanToAssignementExeiDw8eiStoStudent(existsAssignmentsPerStudent, existsAssignmentsPerStudent.get(existsAssignmentsPerStudent.size() - 1)) == true)) {
                    } else {
                        if (existelement == false && existelement1 == false) {
                            existsAssignmentsPerStudent2.add(dasc);
                        }
                    }
                    System.out.println("Ean 8es na stamathseis pata 'stop' ");
                    pros8hkhErgasiwnSeStudents = scan.nextLine();

                }
                System.out.println("Ean 8es na stamathseis tis antistoixies twn assignement per student se ka8e course pata 's' alliws gia sunexeia alla se allo Course pata 'n'");
                epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
                while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")) && !(epiloghGiaNaStamathseiHAntistoixia.equals("n"))) {
                    System.out.println("den edwses swsto ari8mo 's' h 'n'");
                    epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
                }
                newassignments.clear();
                newstudents.clear();
                students.clear();
                assignments.clear();

            }
        } while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")));
    }

    public ArrayList AntistoixiaAssigmentsMeCoursesThsBashsDedomenwn(ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> newAssignmentsPerStudent) {

        //gia na mhn 3anaproste8oun ta dedomena
        for (int i = 0; i < existsAssignmentsPerStudent00.size(); i++) {
            if (combineAssignmentsPerStudent.contains(existsAssignmentsPerStudent00.get(i))) {
            } else {
                combineAssignmentsPerStudent.add(existsAssignmentsPerStudent00.get(i));
            }
        }
        for (int i = 0; i < existsAssignmentsPerStudent2.size(); i++) {
            if (combineAssignmentsPerStudent.contains(existsAssignmentsPerStudent2.get(i))) {
            } else {
                combineAssignmentsPerStudent.add(existsAssignmentsPerStudent2.get(i));
            }
        }
        for (int i = 0; i < newAssignmentsPerStudent.size(); i++) {
            if (combineAssignmentsPerStudent.contains(newAssignmentsPerStudent.get(i))) {

            } else {
                combineAssignmentsPerStudent.add(newAssignmentsPerStudent.get(i));
            }
        }
        return combineAssignmentsPerStudent;
    }

    public void EmfanishAntistoixiaAssignmentsMeStudent() {
        String epilogh = "";
        // do{

        while (!epilogh.equals("s")) {
            System.out.println("*********************Exoume ta e3hs Ma8hmata****************************************");
            System.out.println("");
            bC.DhmiourgiaArrayListMa8hmatwn(course.getCourses()); //gia na emfanisei k ta kainourgia ma8hmatas
            bC.EmfanishCourses();
            System.out.println("Poio ma8hma se endiaferei gia na deis ta assignements per students");
            int epiloghCourse = 0;
            epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            while (epiloghCourse >= bC.getCombineCourses().size()) {
                System.out.println("den edwses swsto ari8mo");
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
            }
            Course tsekarwCourse = bC.getCombineCourses().get(epiloghCourse);

            System.out.format("%14s %8s %12s %11s %18s %25s %n", "CourseTitle", "CourseStream", "FirstName", "LastName", "AssignmentTitle", "AssignmentDescription");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < combineAssignmentsPerStudent.size(); i++) {
                if (combineAssignmentsPerStudent.get(i).getCourse().getTitle().equals(tsekarwCourse.getTitle()) && combineAssignmentsPerStudent.get(i).getCourse().getStream().equals(tsekarwCourse.getStream())) {
                    System.out.print(i);
                    System.out.format("%10s %11s %15s %11s %17s %22s %n", combineAssignmentsPerStudent.get(i).getCourse().getTitle(),
                            combineAssignmentsPerStudent.get(i).getCourse().getStream(),
                            combineAssignmentsPerStudent.get(i).getStudent().getFirstName(),
                            combineAssignmentsPerStudent.get(i).getStudent().getLastName(),
                            combineAssignmentsPerStudent.get(i).getAssignment().getTitle(),
                            combineAssignmentsPerStudent.get(i).getAssignment().getDescription());
                }
            }
            System.out.println("8es na deis allh lista me tous ma8htew? ean nai pata 'n' alliws 's' ");
            epilogh = scan.nextLine();
            while (!epilogh.equals("n") && !epilogh.equals("s")) {
                System.out.println("den edwses swsto xarakthra");
                epilogh = scan.nextLine();
            }
        }
    }

    public void EmfanishOlwnAssigmentPerStudent() {
        if (combineAssignmentsPerStudent.isEmpty()) {
            System.out.println("Oxrhsths den exei ftia3ei thn antistoixia Assignment - Student");
        }
        System.out.format("%14s %8s %12s %11s %18s %25s %n", "CourseTitle", "CourseStream", "FirstName", "LastName", "AssignmentTitle", "AssignmentDescription");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < combineAssignmentsPerStudent.size(); i++) {
            System.out.print(i);
            System.out.format("%10s %11s %15s %11s %17s %22s %n", combineAssignmentsPerStudent.get(i).getCourse().getTitle(),
                    combineAssignmentsPerStudent.get(i).getCourse().getStream(),
                    combineAssignmentsPerStudent.get(i).getStudent().getFirstName(),
                    combineAssignmentsPerStudent.get(i).getStudent().getLastName(),
                    combineAssignmentsPerStudent.get(i).getAssignment().getTitle(),
                    combineAssignmentsPerStudent.get(i).getAssignment().getDescription());
        }
    }

    public void MenouEpiolghsEmfanishsStudentPerAssignmentsHOlwnTwnStudent() {
        int choise = 0;
        System.out.println("1)8es na emfanistoun oloi oi Student me ta Courses 2) na emfanistoun Analoga me to ma8hma pou epile3eis?");
        while (choise != 1 && choise != 2) {
            choise = em.ElegxosGiaIntMetablhth(choise);
        }
        switch (choise) {
            case 1:
                EmfanishOlwnAssigmentPerStudent();
                break;
            case 2:
                EmfanishAntistoixiaAssignmentsMeStudent();
                break;
            default:
                break;
        }
    }

    public BaseisMa8htwn getbM() {
        return bM;
    }

    public BaseisCourses getbC() {
        return bC;
    }

    public BaseisAna8esewn getbA() {
        return bA;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public ElegxoiMetablhtwn getEm() {
        return em;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public DhmiourgiaAntistoixiasStudentAnCourses getDsc() {
        return dsc;
    }

    public DhmiourgiaAntistoixiasAssignmentAndCourse getDac() {
        return dac;
    }

    public ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> getAssignementsPerStudentToEachCourses() {
        return assignementsPerStudentToEachCourses;
    }

    public StudentAndCourseThsBashsDedomenwn getbSC() {
        return bSC;
    }

    public AssignmentAndCourseThsBashsDedomenwn getbAC() {
        return bAC;
    }

    public DhmiourgiaAssignementsPerStudentToEachCourse getDas() {
        return dasc;
    }

    public ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> getCombineAssignmentsPerStudents() {
        return combineAssignmentsPerStudents;
    }

    public ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> getCombineAssignmentsPerStudent() {
        return combineAssignmentsPerStudent;
    }

    public ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> getExistsAssignmentsPerStudent() {
        return existsAssignmentsPerStudent;
    }

    public Scanner getScan() {
        return scan;
    }

}
