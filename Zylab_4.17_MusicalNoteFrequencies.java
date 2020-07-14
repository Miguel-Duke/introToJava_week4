import java.util.Scanner;
import java.lang.Math;

public class MusicalNotes {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */

        double firstKey;
        double secondKey;
        double thirdKey;
        double fourthKey;
        double fifthKey;

        firstKey = scnr.nextDouble();

        secondKey = firstKey * 1 * Math.pow(2.0, (1.0/12) );
        thirdKey = secondKey * 1 * Math.pow(2.0, (1.0/12) );
        fourthKey = thirdKey * 1 * Math.pow(2.0, (1.0/12) );
        fifthKey = fourthKey * 1 * Math.pow(2.0, (1.0/12) );

        System.out.printf("%.2f", firstKey);
        System.out.print(" ");
        System.out.printf("%.2f", secondKey);
        System.out.print(" ");
        System.out.printf("%.2f", thirdKey);
        System.out.print(" ");
        System.out.printf("%.2f", fourthKey);
        System.out.print(" ");
        System.out.printf("%.2f", fifthKey);
        System.out.println("");

    }
}

/* All tests passed */