package dhmiourgiaBasewndedomenwn;

import java.util.ArrayList;
import klaseis.Course;
import klaseis.Student;

public class BaseisCourses {

    Course c;
    ArrayList<Course> existsCourses = new ArrayList<Course>();
    ArrayList<Course> existsCourses2 = DhmiourgiaArrayListCourses();
    ArrayList<Course> combineCourses = new ArrayList<Course>();

    ArrayList<Student> courseTouKa8eMa8hth = new ArrayList<Student>();

    public BaseisCourses() {
    }

    private ArrayList DhmiourgiaArrayListCourses() {
        Course c1 = new Course("CB8", "java", "Full Time", "11/02/2019", "15/05/2019");
        existsCourses.add(c1);
        Course c2 = new Course("CB8", "C#", "Part Time", "11/02/2019", "15/05/2019");
        existsCourses.add(c2);
        Course c3 = new Course("CB9", "java", "Part Time", "13/06/2019", "15/09/2019");
        existsCourses.add(c3);
        Course c4 = new Course("CB9", "C#", "Full Time", "11/06/2019", "15/09/2019");
        existsCourses.add(c4);
        Course c5 = new Course("CB10", "C#", "Part Time", "11/09/2019", "15/12/2019");
        existsCourses.add(c5);

        return existsCourses;
    }

    public ArrayList DhmiourgiaArrayListMa8hmatwn(ArrayList<Course> newCourses) {

        for (int i = 0; i < existsCourses2.size(); i++) {
            if (combineCourses.contains(existsCourses2.get(i))) {
            } else {
                combineCourses.add(existsCourses2.get(i));
            }
        }
        for (int i = 0; i < newCourses.size(); i++) {
            if (combineCourses.contains(newCourses.get(i))) {

            } else {
                combineCourses.add(newCourses.get(i));
            }
        }
        return combineCourses;

    }

    public void EmfanishCourses() {
        System.out.format("%8s %9s %10s %14s %11s %n", "Title", "Stream", "Type", "Start Date", "End Date");
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < combineCourses.size(); i++) {
            System.out.print(i);
            System.out.format("%7s %7s %14s %13s %12s %n", combineCourses.get(i).getTitle(),
                    combineCourses.get(i).getStream(), combineCourses.get(i).getType(),
                    combineCourses.get(i).getStart_date(), combineCourses.get(i).getEnd_date());
        }
    }

    public ArrayList<Course> getCombineCourses() {
        return combineCourses;
    }

    public ArrayList<Course> getExistsCourses() {
        return existsCourses;
    }

    public ArrayList<Course> getExistsCourses2() {
        return existsCourses2;
    }

    public ArrayList<Student> getCourseTouKa8eMa8hth() {
        return courseTouKa8eMa8hth;
    }

}
