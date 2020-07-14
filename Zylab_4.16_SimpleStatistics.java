import java.util.Scanner;

public class SimpleStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        int ansr1;
        int ansr2;

        double ansr3;
        double ansr4;

        /* Type your code here. */

        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();

        ansr1 = num1 * num2 * num3 * num4;
        ansr2 = (num1 + num2 + num3 + num4) / 4;

        System.out.println(ansr1 + " " + ansr2);

        ansr3 = ( (double)(num1) * num2 * num3 * num4 );
        ansr4 = ( (double)(num1) + num2 + num3 + num4 ) / 4;

        System.out.printf("%.3f", ansr3);
        System.out.print(" ");
        System.out.printf("%.3f", ansr4);
        System.out.println("");

    }
}

/* Passed all tests */