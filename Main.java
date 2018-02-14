import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);

    double mpg;
    double tc;
    double gt;
    double rawRange;

    System.out.println("Enter your car's MPG rating " +
                "(miles/gallon) as a positive integer: ");
        mpg = scnr.nextDouble();


    if (mpg >= 1) {

        System.out.println("Enter your car's tank capacity (gallons)" +
                " as a positive decimal number: ");
        tc = scnr.nextDouble();
    }
    else {
        System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE " +
                "ACCEPTED FOR MPG!!!");
        return;
    }



    if (tc >= 1) {
            System.out.println("Enter the percentage of the gas tank that is" +
                    " currently filled (from 0-100%): ");
            gt = scnr.nextDouble();
    }
    else {
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED " +
                    "FOR TANK CAPACITY!!!");
            return;
    }


    rawRange = Math.floor(mpg * tc * (gt * 0.01));

    if (gt >= 0 && gt <= 100) {
        if (rawRange <= 25) {
            System.out.print("Attention! Your current estimated range is running" +
                    " low: " + (int) rawRange + " miles left!!!");
        }
        if (rawRange > 25) {
            System.out.print("Keep driving! Your current estimated range is: " + (int) rawRange + " miles!");
        }
    }
    else {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
        }
    }




    }






