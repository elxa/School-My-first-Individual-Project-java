package dhmiourgiaBasewndedomenwn;

import java.util.ArrayList;
import klaseis.Course;
import klaseis.Trainer;

public class BaseisTrainers {

    Trainer t;
    ArrayList<Trainer> combineTrainers = new ArrayList<Trainer>();
    ArrayList<Trainer> existsTrainers = new ArrayList<Trainer>();
    ArrayList<Trainer> existsTrainers2 = DhmiourgiaArrayListEkpaideutwn();

    public BaseisTrainers() {

    }

    private ArrayList DhmiourgiaArrayListEkpaideutwn() {
        Trainer t1 = new Trainer("Lukodhmos", "Blashs", "Java");
        existsTrainers.add(t1);
        Trainer t2 = new Trainer("Simseridhs", "Konstantinos", "CSS");
        existsTrainers.add(t2);
        Trainer t3 = new Trainer("Rodith", "Anna", "Javascript");
        existsTrainers.add(t3);
        Trainer t4 = new Trainer("Reish", "Blashs", "Java");
        existsTrainers.add(t4);
        Trainer t5 = new Trainer("Lelidhs", "Iwannhs", "Spring");
        existsTrainers.add(t5);
        Trainer t6 = new Trainer("Stefanou", "Nikos", "Java");
        existsTrainers.add(t6);

        return existsTrainers;
    }

    public ArrayList DhmiourgiaArrayListTrainers(ArrayList<Trainer> newTrainers) {

        for (int i = 0; i < existsTrainers2.size(); i++) {
            if (combineTrainers.contains(existsTrainers2.get(i))) {
            } else {
                combineTrainers.add(existsTrainers2.get(i));
            }
        }
        for (int i = 0; i < newTrainers.size(); i++) {
            if (combineTrainers.contains(newTrainers.get(i))) {

            } else {
                combineTrainers.add(newTrainers.get(i));
            }
        }
        return combineTrainers;
    }

    public void EmfanishEkpaideutwn() {
        System.out.format("%12s %16s %17s %n", "Last Name", "First Name", "Subject");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < combineTrainers.size(); i++) {
            System.out.print(i);
            System.out.format("%11s %17s %16s %n", combineTrainers.get(i).getFirstName(), combineTrainers.get(i).getLastName(), combineTrainers.get(i).getSubject());
        }
    }

    public Trainer getT() {
        return t;
    }

    public ArrayList<Trainer> getCombineTrainers() {
        return combineTrainers;
    }

    public ArrayList<Trainer> getExistsTrainers() {
        return existsTrainers;
    }

    public ArrayList<Trainer> getExistsTrainers2() {
        return existsTrainers2;
    }

}
