import java.util.Scanner;

public class PhoneNumberBreakdown {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        long phoneNumber;
        // Add more variables as needed

        phoneNumber = scnr.nextLong();

        /* Type your code here. */

        long areaCode = phoneNumber / 10000000;
        long firstThree = (phoneNumber / 1000) % 10000 /10;
        long lastFour = (phoneNumber % 10000000) % 10000;


        System.out.print("(" + areaCode + ") " + firstThree + "-" + lastFour);
        System.out.println("");
    }
}
/* Passed all tests! */