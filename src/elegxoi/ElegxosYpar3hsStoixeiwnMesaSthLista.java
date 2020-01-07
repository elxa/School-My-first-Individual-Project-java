package elegxoi;

import java.util.ArrayList;
import klaseis.Assignment;
import klaseis.Course;
import klaseis.DhmiourgiaAntistoixiasAssignmentAndCourse;
import klaseis.DhmiourgiaAntistoixiasStudentAnCourses;
import klaseis.DhmiourgiaAntistoixiasTrainerAndCourse;
import klaseis.DhmiourgiaAssignementsPerStudentToEachCourse;
import klaseis.Student;

public class ElegxosYpar3hsStoixeiwnMesaSthLista {

    public static ArrayList ElegxosGiaYpar3hDiplwnAssignement(ArrayList<Assignment> assignments) {
        ArrayList<Assignment> newassignments = new ArrayList<Assignment>();
        for (int i = 0; i < assignments.size(); i++) {
            if (newassignments.contains(assignments.get(i))) {
            } else {
                newassignments.add(assignments.get(i));
            }
        }
        return newassignments;

    }

    public static ArrayList ElegxosGiaYpar3hDiplwnCourses(ArrayList<Course> courses) {
        ArrayList<Course> newcourses = new ArrayList<Course>();
        for (int i = 0; i < courses.size(); i++) {
            if (newcourses.contains(courses.get(i))) {
            } else {
                newcourses.add(courses.get(i));
            }
        }
        return newcourses;

    }

    public static ArrayList ElegxosGiaYpar3hDiplwnStudents(ArrayList<Student> students) {
        ArrayList<Student> newstudents = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            if (newstudents.contains(students.get(i))) {
            } else {
                newstudents.add(students.get(i));
            }
        }
        return newstudents;

    }

    public static boolean ElegxosGiaToEanOStudentExeiProste8eiStoCourse(ArrayList<DhmiourgiaAntistoixiasStudentAnCourses> studentAndCourses, DhmiourgiaAntistoixiasStudentAnCourses studentAndCourse1) {
        int count = 0;
        for (int i = 0; i < studentAndCourses.size(); i++) {
            // if (trainerAndCourse.contains(trainerAndCourse1)) {
            if (studentAndCourses.get(i).getCourse().getTitle().equals(studentAndCourse1.getCourse().getTitle())
                    && studentAndCourses.get(i).getCourse().getStream().equals(studentAndCourse1.getCourse().getStream())
                    && studentAndCourses.get(i).getStudent().getFirstName().equals(studentAndCourse1.getStudent().getFirstName())
                    && studentAndCourses.get(i).getStudent().getLastName().equals(studentAndCourse1.getStudent().getLastName())) {
                //  System.out.println("O trainers exei hdh analabei auto to ma8hma");
                count++;
                if (count > 1) {
                    System.out.println("O student exei hdh proste8ei se auto to ma8hma");
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean ElegxosGiaToEanOTrainerExeiProste8eiStoCourse(ArrayList<DhmiourgiaAntistoixiasTrainerAndCourse> trainerAndCourse, DhmiourgiaAntistoixiasTrainerAndCourse trainerAndCourse1) {
        int count = 0;
        for (int i = 0; i < trainerAndCourse.size(); i++) {
            // if (trainerAndCourse.contains(trainerAndCourse1)) {
            if (trainerAndCourse.get(i).getCourse().getTitle().equals(trainerAndCourse1.getCourse().getTitle())
                    && trainerAndCourse.get(i).getCourse().getStream().equals(trainerAndCourse1.getCourse().getStream())
                    && trainerAndCourse.get(i).getTrainer().getFirstName().equals(trainerAndCourse1.getTrainer().getFirstName())
                    && trainerAndCourse.get(i).getTrainer().getLastName().equals(trainerAndCourse1.getTrainer().getLastName())) {
                //  System.out.println("O trainers exei hdh analabei auto to ma8hma");
                count++;
                if (count > 1) {
                    System.out.println("O trainers exei hdh analabei auto to ma8hma");
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean ElegxosGiaToEanToAssignementExeiProste8eiStoCourse(ArrayList<DhmiourgiaAntistoixiasAssignmentAndCourse> assignmentAndCourses, DhmiourgiaAntistoixiasAssignmentAndCourse assignmentAndCourse1) {
        int count = 0;
        for (int i = 0; i < assignmentAndCourses.size(); i++) {
            // if (trainerAndCourse.contains(trainerAndCourse1)) {
            if (assignmentAndCourses.get(i).getCourse().getTitle().equals(assignmentAndCourse1.getCourse().getTitle())
                    && assignmentAndCourses.get(i).getCourse().getStream().equals(assignmentAndCourse1.getCourse().getStream())
                    && assignmentAndCourses.get(i).getAssignment().getTitle().equals(assignmentAndCourse1.getAssignment().getTitle())
                    && assignmentAndCourses.get(i).getAssignment().getDescription().equals(assignmentAndCourse1.getAssignment().getDescription())) {
                //  System.out.println("O trainers exei hdh analabei auto to ma8hma");
                count++;
                if (count > 1) {
                    System.out.println("O assignment exei hdh dw8ei se auto to ma8hma");
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean ElegxosGiaToEanToAssignementExeiDw8eiStoStudent(ArrayList<DhmiourgiaAssignementsPerStudentToEachCourse> assignmentAndStudents, DhmiourgiaAssignementsPerStudentToEachCourse assignmentAndStudent1) {
        int count = 0;
        for (int i = 0; i < assignmentAndStudents.size(); i++) {
            if (assignmentAndStudents.get(i).getStudent().getFirstName().equals(assignmentAndStudent1.getStudent().getFirstName())
                    && assignmentAndStudents.get(i).getStudent().getLastName().equals(assignmentAndStudent1.getStudent().getLastName())
                    && assignmentAndStudents.get(i).getAssignment().getTitle().equals(assignmentAndStudent1.getAssignment().getTitle())
                    && assignmentAndStudents.get(i).getAssignment().getDescription().equals(assignmentAndStudent1.getAssignment().getDescription())) {
                count++;
                if (count > 1) {
                    System.out.println("O assignment exei hdh dw8ei se auto ton Student");
                    return true;
                }

            }
        }
        return false;
    }

}
