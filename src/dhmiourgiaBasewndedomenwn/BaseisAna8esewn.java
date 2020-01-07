package dhmiourgiaBasewndedomenwn;

import java.util.ArrayList;
import klaseis.Assignment;
import klaseis.Student;
import klaseis.Trainer;

public class BaseisAna8esewn {

    Assignment a;
    ArrayList<Assignment> combineAssignments = new ArrayList<Assignment>();
    ArrayList<Assignment> existsAssignments = new ArrayList<Assignment>();
    ArrayList<Assignment> existsAssignments2 = DhmiourgiaArrayListAna8esewn();

    public BaseisAna8esewn() {

    }

    private ArrayList DhmiourgiaArrayListAna8esewn() {

        Assignment a1 = new Assignment("CSS", "gjrfrfhhih", "24/12/2019", 20, 55);
        existsAssignments.add(a1);
        Assignment a2 = new Assignment("Spring", "gjhrfrhih", "02/01/2019", 30, 60);
        existsAssignments.add(a2);
        Assignment a3 = new Assignment("HTML", "gjrfrhhih", "30/12/2019", 40, 25);
        existsAssignments.add(a3);
        Assignment a4 = new Assignment("Database", "gjhhyhhih", "16/12/2019", 35, 40);
        existsAssignments.add(a4);
        Assignment a5 = new Assignment("Frond End", "gjbhhhih", "26/12/2019", 12, 30);
        existsAssignments.add(a5);
        Assignment a6 = new Assignment("Back End", "gjhhbhbhih", "06/12/2019", 15, 55);
        existsAssignments.add(a6);
        Assignment a7 = new Assignment("Javascript", "gjhhgnuuih", "28/11/2019", 25, 60);
        existsAssignments.add(a7);

        return existsAssignments;
    }

    public ArrayList DhmiourgiaArrayListAna8esewn(ArrayList<Assignment> newAssignments) {

        for (int i = 0; i < existsAssignments2.size(); i++) {
            if (combineAssignments.contains(existsAssignments2.get(i))) {
            } else {
                combineAssignments.add(existsAssignments2.get(i));
            }
        }
        for (int i = 0; i < newAssignments.size(); i++) {
            if (combineAssignments.contains(newAssignments.get(i))) {

            } else {
                combineAssignments.add(newAssignments.get(i));
            }
        }
        return combineAssignments;
    }

    public void EmfanishAssigment() {
        System.out.format("%8s %15s %14s %12s %13s %n", "Title", "Description", "SubDateTime", "Oral Mark", "Total Mark");
        System.out.println("----------------------------------------------------------------------------------------------");
        for (int i = 0; i < combineAssignments.size(); i++) {
            System.out.print(i);
            System.out.format("%8s %13s %14s %11s %12s %n", combineAssignments.get(i).getTitle(),
                    combineAssignments.get(i).getDescription(),
                    combineAssignments.get(i).getSubDateTime(),
                    combineAssignments.get(i).getOralMark(),
                    combineAssignments.get(i).getTotalMark());
        }
    }

    public Assignment getA() {
        return a;
    }

    public ArrayList<Assignment> getCombineAssignments() {
        return combineAssignments;
    }

    public ArrayList<Assignment> getExistsAssignments() {
        return existsAssignments;
    }

    public ArrayList<Assignment> getExistsAssignments2() {
        return existsAssignments2;
    }

}
