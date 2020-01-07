package dhmiourgiaBasewndedomenwn;

import java.util.ArrayList;
import klaseis.Course;
import klaseis.Student;

public class BaseisMa8htwn extends Student {

    Student s = new Student();
    ArrayList<Course> courseTouKa8eMa8hth = new ArrayList<Course>();
    ArrayList<Student> studentsExists = new ArrayList<Student>();
    ArrayList<Student> combineList = new ArrayList<Student>();
    ArrayList<Student> studentsExists2 = DhmiourgiaArrayListPouHdhYparxounTaDedomenaSthBash();  //einai h arraylist p

    public BaseisMa8htwn() {

    }

    private ArrayList DhmiourgiaArrayListPouHdhYparxounTaDedomenaSthBash() {
        Student s1 = new Student("Panos", "Louk", "28/5/1991", 2500);
        studentsExists.add(s1);
        Student s2 = new Student("Eugenia", "Koutsou", "29/5/1995", 450);
        studentsExists.add(s2);
        Student s3 = new Student("Panos", "Konid", "30/3/1995", 2500);
        studentsExists.add(s3);
        Student s4 = new Student("Kwstas", "Tyrob", "28/5/1991", 2500);
        studentsExists.add(s4);

        return studentsExists;

    }

    public ArrayList DhmiourgiaArrayListMa8htwn(ArrayList<Student> newStudents) {

        for (int i = 0; i < studentsExists2.size(); i++) {
            if (combineList.contains(studentsExists2.get(i))) {
            } else {
                combineList.add(studentsExists2.get(i));
            }
        }
        for (int i = 0; i < newStudents.size(); i++) {
            if (combineList.contains(newStudents.get(i))) {

            } else {
                combineList.add(newStudents.get(i));
            }
        }
        return combineList;

    }

    public void EmfanishMa8htwn() {
        System.out.format("%13s %15s %17s %17s %n", "First Name", "Last Name", "Date Of Birth", "Tuition Fees");
        System.out.println("-----------------------------------------------------------------------------------");
        for (int i = 0; i < combineList.size(); i++) {
            System.out.print(i);
            System.out.format("%10s %16s %16s %16s %n", combineList.get(i).getFirstName(), combineList.get(i).getLastName(), combineList.get(i).getDateOfBirth(), combineList.get(i).getTuitionFees());
        }

    }

    public Student getS() {
        return s;
    }

    public ArrayList<Student> getCombineList() {
        return combineList;
    }

    public ArrayList<Student> getStudentsExists2() {
        return studentsExists2;
    }

    public ArrayList<Student> getStudentsExists() {
        return combineList;
    }

    public ArrayList<Course> getCourseTouKa8eMa8hth() {
        return courseTouKa8eMa8hth;
    }

}
