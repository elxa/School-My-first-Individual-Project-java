package klaseis;

import elegxoi.ElegxoiMetablhtwn;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {

    private String title;
    private String description;
    private String subDateTime;
    private double oralMark;
    private double totalMark;

    private static ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    Scanner scan = new Scanner(System.in);
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn(); //gia na elegxoume tis times pou eisagei o xrhsths
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateValidator validator = new DateValidatorUsingLocalDate(dateFormatter);

    public Assignment(String title, String description, String subDateTime, double oralMark, double totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public Assignment() {
    }

    public ArrayList DhmiourgiaAna8esewnApoTonXrhsth() {
        String epilogh = "n";
        do {
            System.out.println("DWSE TON TITLO THS ERGASIAS");
            this.title = em.ElegxosGiaStringMeChars();
            System.out.println("DWSE THN PERIGRAFH");
            //  this.description = em.ElegxosGiaStringMeChars();
            this.description = scan.nextLine();
            System.out.println("DWSE THN HMEROMHNIA UPOBOLHS dd/MM/yyyy");
            //elegxoume ean o xrhsths exei balei swstsa thn date
            boolean trueDate = false;
            while (trueDate != true) {
                subDateTime = scan.nextLine();
                trueDate = validator.isValid(subDateTime);
            }
            System.out.println("DWSE TON BA8MO THS KA8E ERGASIAS O OPOIOS 0 <= ORAL MARK < 40");
            double oralM = 0;
            oralM = em.ElegxosGiaDoubleMetablhth(oralM);
            while (oralM < 0 || oralM > 40) {
                System.out.println("O oral Mark prepei na einai 0 < oral Mark < 40");
                oralM = em.ElegxosGiaDoubleMetablhth(oralM);
            }
            System.out.println("DWSE TON SUNOLIKO BA8MO O OPOIOS 0 <= TOTAL MARK < 60");
            double totalM = 0;
            totalM = em.ElegxosGiaDoubleMetablhth(totalM);
            while (totalM < 0 || totalM > 60) {
                System.out.println("O total Mark prepei na einai 0 < total Mark < 60");
                totalM = em.ElegxosGiaDoubleMetablhth(totalM);
            }
            Assignment a = new Assignment(title, description, subDateTime, oralM, totalM);
            assignments.add(a);

            System.out.println("8ES NA PROS8ESEIS KAPOIA ALLH ERGASIA PATA 'n' -> GIA SUNEXEIA  's' -> gia stop ");
            epilogh = scan.nextLine();
            while (!epilogh.equals("s") && !epilogh.equals("n")) {
                System.out.println("Den edwses tous char 'n' or 's'");
                epilogh = scan.nextLine();
            }
        } while (!epilogh.equals("s"));
        return assignments;
    }

    public void EmfanishListasAna8esewn() {
        System.out.format("%10s %16s %15s %13s %14s %n", "Title", "Description", "SubDateTime", "Oral Mark", "Total Mark");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (int i = 0; i < assignments.size(); i++) {
            System.out.print(i);
            System.out.format("%10s %15s %14s %12s %13s %n", assignments.get(i).getTitle(),
                    assignments.get(i).getDescription(),
                    assignments.get(i).getSubDateTime(),
                    assignments.get(i).getOralMark(),
                    assignments.get(i).getTotalMark());
        }

    }

    //***********************GET ME8ODOUS***************************
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSubDateTime() {
        return subDateTime;
    }

    public double getOralMark() {
        return oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public static ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public Scanner getScan() {
        return scan;
    }

}
