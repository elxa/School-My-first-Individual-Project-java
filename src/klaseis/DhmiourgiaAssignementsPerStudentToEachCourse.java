package klaseis;

import elegxoi.ElegxoiMetablhtwn;
import elegxoi.ElegxosYpar3hsStoixeiwnMesaSthLista;
import java.util.ArrayList;
import java.util.Scanner;
import static klaseis.DhmiourgiaAntistoixiasTrainerAndCourse.dhmiourgiaTrainersAndCourses;
//8elei ftia3imo se periptwsh pou o xrhsths den exei eisagei dedomena

public class DhmiourgiaAssignementsPerStudentToEachCourse {

    Scanner scan = new Scanner(System.in);
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn();
    Course course = new Course();
    Student student = new Student();
    Assignment assignment = new Assignment();
    DhmiourgiaAntistoixiasStudentAnCourses dsc = new DhmiourgiaAntistoixiasStudentAnCourses();
    DhmiourgiaAntistoixiasAssignmentAndCourse dac = new DhmiourgiaAntistoixiasAssignmentAndCourse();

    ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    ArrayList<Assignment> newassignments = new ArrayList<Assignment>();
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Student> newstudents = new ArrayList<Student>();
    ArrayList<Course> newcourses = new ArrayList<Course>();
    ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> assignementsPerStudentToEachCourses = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();
    static ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> neaAssignementsPerStudentToEachCourses = new ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse>();

    public DhmiourgiaAssignementsPerStudentToEachCourse(Course course, Student student, Assignment assignment) {
        this.course = course;
        this.student = student;
        this.assignment = assignment;

    }

    public DhmiourgiaAssignementsPerStudentToEachCourse() {
    }

    public void DhmiourgiaAntistoixiaAssignmentsPerStudents() {

        String epilogh = "";
        String stop = " ";
        String epiloghGiaNaStamathseiHAntistoixia = "";
        boolean existList = true;
        boolean existList1 = true;

        if (student.getMa8htes().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei students");
            existList = false;
        }
        if (course.getCourses().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei courses");
            existList = false; //efoson den uparxei bgainoume e3w apo th me8odo
        }
        if (assignment.getAssignments().isEmpty()) {
            System.out.println("Oxrhsths den exei eisagei assignment");
            existList = false;//efoson den uparxei bgainoume e3w apo th me8odo
        }
        if (DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().isEmpty()) {
            System.out.println("Oxrhsths den exei dhmiourgh8ei h antistoixia student - course");
            existList = false;//efoson den uparxei bgainoume e3w apo th me8odo
        }
        if (DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().isEmpty()) {
            System.out.println("Oxrhsths den exei dhmiourgh8ei h antistoixia assignement - course");
            existList = false;//efoson den uparxei bgainoume e3w apo th me8odo
        } else {

            while (!epiloghGiaNaStamathseiHAntistoixia.equals("s") && existList == true) {

                System.out.println("************************Exoume ta e3hs Ma8hmata******************************");
                System.out.println("");
                course.EmfanishListasCourse();

                System.out.println("Diale3e to ma8hma to opoio se endiaferei");
                int epiloghCourse = 0;
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                while (epiloghCourse >= Course.getCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                }

                Course dokimh = Course.getCourses().get(epiloghCourse);

                for (int i = 0; i < DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().size(); i++) {
                    if ((DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getCourse().getTitle()).equals(dokimh.getTitle())
                            && (DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getCourse().getStream()).equals(dokimh.getStream())) {
                        student = DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getStudent();
                        students.add(student);
                        newstudents = ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaYpar3hDiplwnStudents(students);
                    }
                }
                for (int j = 0; j < DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().size(); j++) {
                    if ((DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().get(j).getCourse().getTitle()).equals(dokimh.getTitle())
                            && (DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().get(j).getCourse().getStream()).equals(dokimh.getStream())) {
                        assignment = DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().get(j).getAssignment();
                        assignments.add(assignment);
                        newassignments = ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaYpar3hDiplwnAssignement(assignments);
                    }
                }

                /* for (int i = 0; i < DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().size(); i++) {
                    for (int j = 0; j < DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().size(); j++) {
                        if ((DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().get(j).getCourse().getTitle()).equals(dokimh.getTitle()) && (DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getCourse().getTitle()).equals(dokimh.getTitle())
                                && (DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().get(j).getCourse().getStream()).equals(dokimh.getStream()) && (DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getCourse().getStream()).equals(dokimh.getStream())) {
                            //  if ((bAC.getCombineAssignmentAndCourses().get(i).getCourse()).equals(dokimh) && (bSC.getCombinestudentAndCourses().get(i).getCourse()).equals(dokimh)) {
                            assignment = DhmiourgiaAntistoixiasAssignmentAndCourse.getNeadhmiourgiaAssignmentsAndCourses().get(i).getAssignment();
                            assignments.add(assignment);
                            System.out.println(assignments.get(i).getTitle());
                            newassignments = ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaYpar3hDiplwnAssignement(assignments);
                            student = DhmiourgiaAntistoixiasStudentAnCourses.getNeadhmiourgiaStudentAndCourses().get(i).getStudent();
                            students.add(student);
                            System.out.println(students.get(i).getFirstName());
                            newstudents = ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaYpar3hDiplwnStudents(students);
                        }
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
                    System.out.println("************************Exoume tous e3hs Students**********************************");
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

                    System.out.println("*********************Exoume ta e3hs Assignements*****************************************");
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
                        DhmiourgiaAssignementsPerStudentToEachCourse dasc = new DhmiourgiaAssignementsPerStudentToEachCourse(Course.getCourses().get(epiloghCourse), student, assignment);
                        assignementsPerStudentToEachCourses.add(dasc);

                        //gia na mhn pros8esoume to idio assignements 2 fores kanoume
                        if (ElegxosYpar3hsStoixeiwnMesaSthLista.ElegxosGiaToEanToAssignementExeiDw8eiStoStudent(assignementsPerStudentToEachCourses, assignementsPerStudentToEachCourses.get(assignementsPerStudentToEachCourses.size() - 1)) == true) {
                        } else {
                            neaAssignementsPerStudentToEachCourses.add(dasc);
                        }
                        System.out.println("Ean 8es na stamathseis pata 'stop' ");
                        pros8hkhErgasiwnSeStudents = scan.nextLine();

                    }

                }
                System.out.println("Ean 8es na stamathseis tis antistoixies twn assignement per student se ka8e course pata 's' alliws gia sunexeia pata 'n'");
                epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
                while (!(epiloghGiaNaStamathseiHAntistoixia.equals("s")) && !(epiloghGiaNaStamathseiHAntistoixia.equals("n"))) {
                    System.out.println("den edwses swsto ari8mo 's' h 'n'");
                    epiloghGiaNaStamathseiHAntistoixia = scan.nextLine();
                }
                //ta mhdenizw etsi wste na mhn gemizoun me ta nea stoixei aka8e fora pou epilwgw ena course
                //8elw na mou emfanizontai oi student k ta assignment pou uparxoun sto sugkekrimeno ma8hma
                students.clear();
                newstudents.clear();
                assignments.clear();
                newassignments.clear();
            }

        }
    }

    public void EmfanishOlwnTwnAssigmentPerStudent() {
        if (neaAssignementsPerStudentToEachCourses.isEmpty()) {
            System.out.println("o xrhsths den exei ftia3ei thn antistoixia assignment -course");
        }
        System.out.format("%14s %10s %10s %10s %12s %13s %n", "CourseTitle", "CourseStream", "FirstName", "LastName", "AssignmentTitle", "AssignmentDescription");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < neaAssignementsPerStudentToEachCourses.size(); i++) {
            System.out.print(i);
            System.out.format("%12s %12s %12s %9s %12s %20s %n", neaAssignementsPerStudentToEachCourses.get(i).getCourse().getTitle(),
                    neaAssignementsPerStudentToEachCourses.get(i).getCourse().getStream(),
                    neaAssignementsPerStudentToEachCourses.get(i).getStudent().getFirstName(),
                    neaAssignementsPerStudentToEachCourses.get(i).getStudent().getLastName(),
                    neaAssignementsPerStudentToEachCourses.get(i).getAssignment().getTitle(),
                    neaAssignementsPerStudentToEachCourses.get(i).getAssignment().getDescription());
        }

    }

    public void EmfanishAssigmentPerStudent() {
        String epilogh = "";
        if (!(neaAssignementsPerStudentToEachCourses.isEmpty()) && !(neaAssignementsPerStudentToEachCourses.isEmpty())) {
            while (!epilogh.equals("s")) {
                System.out.println("***************************Exoume ta e3hs Ma8hmata********************************");
                System.out.println("");
                course.EmfanishListasCourse();
                System.out.println("Poio ma8hma se endiaferei gia na deis ta assignements per students");
                int epiloghCourse = 0;
                epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                while (epiloghCourse >= Course.getCourses().size()) {
                    System.out.println("den edwses swsto ari8mo");
                    epiloghCourse = em.ElegxosGiaIntMetablhth(epiloghCourse);
                }
                Course tsekarwCourse = Course.getCourses().get(epiloghCourse);

                System.out.format("%14s %10s %10s %10s %12s %13s %n", "CourseTitle", "CourseStream", "FirstName", "LastName", "AssignmentTitle", "AssignmentDescription");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                for (int i = 0; i < neaAssignementsPerStudentToEachCourses.size(); i++) {
                    if (neaAssignementsPerStudentToEachCourses.get(i).getCourse().getTitle().equals(tsekarwCourse.getTitle()) && neaAssignementsPerStudentToEachCourses.get(i).getCourse().getStream().equals(tsekarwCourse.getStream())) {
                        System.out.print(i);
                        System.out.format("%12s %12s %12s %9s %12s %20s %n", neaAssignementsPerStudentToEachCourses.get(i).getCourse().getTitle(),
                                neaAssignementsPerStudentToEachCourses.get(i).getCourse().getStream(),
                                neaAssignementsPerStudentToEachCourses.get(i).getStudent().getFirstName(),
                                neaAssignementsPerStudentToEachCourses.get(i).getStudent().getLastName(),
                                neaAssignementsPerStudentToEachCourses.get(i).getAssignment().getTitle(),
                                neaAssignementsPerStudentToEachCourses.get(i).getAssignment().getDescription());
                    }
                }
                System.out.println("8es na deis allh lista me tous ma8htes? ean nai pata 'n' alliws 's' ");
                epilogh = scan.nextLine();
                while (!epilogh.equals("n") && !epilogh.equals("s")) {
                    System.out.println("den edwses swsto xarakthra");
                    epilogh = scan.nextLine();
                }
            }
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
                EmfanishOlwnTwnAssigmentPerStudent();
                break;
            case 2:
                EmfanishAssigmentPerStudent();
                break;
            default:
                break;
        }
    }

    public Scanner getScan() {
        return scan;
    }

    public ElegxoiMetablhtwn getEm() {
        return em;
    }

    public DhmiourgiaAntistoixiasStudentAnCourses getDsc() {
        return dsc;
    }

    public DhmiourgiaAntistoixiasAssignmentAndCourse getDac() {
        return dac;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> getAssignementsPerStudentToEachCourses() {
        return assignementsPerStudentToEachCourses;
    }

    public Course getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public ArrayList<Assignment> getNewassignments() {
        return newassignments;
    }

    public ArrayList<Student> getNewstudents() {
        return newstudents;
    }

    public ArrayList<Course> getNewcourses() {
        return newcourses;
    }

    public static ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> getNeaAssignementsPerStudentToEachCourses() {
        return neaAssignementsPerStudentToEachCourses;
    }

    public Assignment getAssignment() {
        return assignment;
    }

}
