package klaseis;

import elegxoi.ElegxoiMetablhtwn;
import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {

    private String firstName;
    private String lastName;
    private String subject;

    private static ArrayList<Trainer> trainers = new ArrayList<Trainer>();
    private Scanner scan = new Scanner(System.in);
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn(); //gia na elegxoume tis times pou eisagei o xrhsths

    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public Trainer() {

    }

    public ArrayList DhmiourgiaTrainersApoTonXrhsth() {
        String epilogh = "n";
        do {
            System.out.println("DWSE ONOMA EKPAIDEUTH");
            this.firstName = em.ElegxosGiaStringMeChars();//elegxoume thn periptwsh pou o xrhsths den eisagei mono grammat
            System.out.println("DWSE EPONUMO EKPAIDEUTH");
            this.lastName = em.ElegxosGiaStringMeChars();
            System.out.println("DWSE TO SUBJECT TOU EKPAIDEUTH");
            this.subject = scan.nextLine();
            // this.subject = em.ElegxosGiaStringMeChars();

            Trainer t = new Trainer(firstName, lastName, subject);
            trainers.add(t);

            System.out.println("8ES NA PROS8ESEIS K ALLO TRAINER PATA 'n' -> GIA SUNEXEIA 's' -> gia stop ");
            epilogh = scan.nextLine();
            while (!epilogh.equals("s") && !epilogh.equals("n")) {
                System.out.println("Den edwses tous char 'n' or 's'");
                epilogh = scan.nextLine();
            }
        } while (!epilogh.equals("s"));
        return trainers;
    }

    public void EmfanishListasTrainer() {
        System.out.format("%12s %14s %14s %n", "First Name", "Last Name", "Subject");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < trainers.size(); i++) {
            System.out.print(i);
            System.out.format("%11s %14s %15s %n", trainers.get(i).getFirstName(), trainers.get(i).getLastName(), trainers.get(i).getSubject());
        }

    }
//*****************GET ME8ODOI*******************************

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public static ArrayList<Trainer> getTrainers() {
        return trainers;
    }

}
