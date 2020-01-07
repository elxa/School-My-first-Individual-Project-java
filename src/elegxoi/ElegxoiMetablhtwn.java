package elegxoi;

import java.util.Scanner;

public class ElegxoiMetablhtwn {

    Scanner scan = new Scanner(System.in);
//**************************GIA NA EISAGOUME DOUBLE************************************************

    public double ElegxosGiaDoubleMetablhth(double timhDouble) {
        while (true) {
            try {
                //  timhDouble = Double.parseDouble(scan.next());
                timhDouble = Double.parseDouble(scan.nextLine());
                while (timhDouble < 0) {
                    System.out.println("EDWSES ARNHTIKO");
                    //  timhDouble = Double.parseDouble(scan.next());
                    timhDouble = Double.parseDouble(scan.nextLine());
                }
                break; // will only get to here if input was a double
            } catch (NumberFormatException ignore) {
                System.out.println("Kati ekanes la8os!!!!! Dwse 3ana ari8mo");
            }
        }
        return timhDouble;
    }
//**************************GIA NA EISAGOUME INT************************************************

    public int ElegxosGiaIntMetablhth(int timhInt) {
        while (true) {
            try {
                // timhInt = Integer.parseInt(scan.next());
                timhInt = Integer.parseInt(scan.nextLine());
                while (timhInt < 0) {
                    System.out.println("EDWSES ARNHTIKO");
                    //   timhInt = Integer.parseInt(scan.next());
                    timhInt = Integer.parseInt(scan.nextLine());
                }
                break; // will only get to here if input was a double
            } catch (NumberFormatException ignore) {
                System.out.println("Kati ekanes la8os!!!!! Dwse 3ana ari8mo");
            }
        }
        return timhInt;
    }

    //**************************GIA NA EISAGOUME STRING MONO ME CHAR************************************************
    public String ElegxosGiaStringMeChars() {
        String temp = "";
        //while (!scan.hasNext("[A-Za-z]+")) {
        while (!scan.hasNext("[A-Za-z]+")) {
            System.out.println("Nope, that's not it!");
            scan.nextLine();
        }
        temp = scan.nextLine();

        return temp;
    }

}
