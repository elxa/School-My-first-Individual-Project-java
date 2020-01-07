package klaseis;

import elegxoi.ElegxoiMetablhtwn;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double tuitionFees;
    public String testDate;

    private Scanner scan = new Scanner(System.in);
    private static ArrayList<Student> ma8htes = new ArrayList<Student>();
    ElegxoiMetablhtwn em = new ElegxoiMetablhtwn(); //gia na elegxoume tis times pou eisagei o xrhsths

    // DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateValidator validator = new DateValidatorUsingLocalDate(dateFormatter);

    public Student(String firstName, String lastName, String dateOfBirth, double tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public Student(String firstName, double tuitionFees) {
        this.firstName = firstName;
        this.tuitionFees = tuitionFees;
    }

    public Student() {

    }

    public void DhmiourgiaMa8htwnApoTonXrhsth() {
        String epilogh = "n";

        do {
            System.out.println("DWSE ONOMA Ma8hth");
            firstName = em.ElegxosGiaStringMeChars();
            System.out.println("DWSE EPONUMO Ma8hth");
            this.lastName = em.ElegxosGiaStringMeChars();
            System.out.println("DWSE HMEROMHNIA GENNHSHS (dd/MM/yyyy) "); //o xrhsth eisagei thn hmeromhnia k elegxei an thn exei eisagei swsta
            boolean trueDate = false;
            while (trueDate != true) {
                dateOfBirth = scan.nextLine();
                trueDate = validator.isValid(dateOfBirth);
            }
//****ME TON TROPO AUTO ELEGXOUME EAN O XRHSTHS EXEI DWSEI DOUBLE METABLHTH GIA NA MHN PETAEI ERROR***********************
            double didaktra = 0;
            System.out.println("DWSE dIDAKTRA");
            didaktra = em.ElegxosGiaDoubleMetablhth(didaktra);
            Student s = new Student(firstName, lastName, dateOfBirth, didaktra);
            ma8htes.add(s);
            System.out.println("8ES NA PROS8ESEIS K ALLO MA8HTH PATA 'n' -> GIA SUNEXEIA  's' -> gia stop ");
            epilogh = scan.nextLine();
            while (!epilogh.equals("s") && !epilogh.equals("n")) {
                System.out.println("Den edwses tous char 'n' or 's'");
                epilogh = scan.nextLine();
            }
        } while (!epilogh.equals("s"));
        // return ma8htes;
    }

    public void EmfanishListasMa8htwn() {
        System.out.format("%13s %15s %17s %17s %n", "First Name", "Last Name", "Date Of Birth", "Tuition Fees");
        System.out.println("------------------------------------------------------------------------------------");
        for (int i = 0; i < ma8htes.size(); i++) {
            System.out.print(i);
            System.out.format("%10s %16s %16s %16s %n", ma8htes.get(i).getFirstName(),
                    ma8htes.get(i).getLastName(),
                    ma8htes.get(i).getDateOfBirth(),
                    ma8htes.get(i).getTuitionFees());
        }

    }

//************************GET ME8ODOI****************************    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public static ArrayList<Student> getMa8htes() {
        return ma8htes;
    }

}
