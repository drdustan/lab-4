import java.util.Scanner;

public class Main {
    public static void main(String[] Args)
    {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a hexadecimal number: ");
        String val = scn.next();

        if ( val.charAt(1) == 'x')
        { val = val.substring(2); }

        long X = 0;
        int exponent = 0;
        int countDown = val.length();

        while (countDown > 0) {
            char currentDigit = val.charAt(countDown - 1);

            if (currentDigit == '0') { X += 0; }

            if (currentDigit == '1') {
                double multi = Math.pow(16,exponent);
                X += (1 * multi); }

            if (currentDigit == '2') {
                double multi= Math.pow(16,exponent);
                X += (2 * multi); }

            if (currentDigit == '3') {
                double multi = Math.pow(16,exponent);
                X += (3 * multi); }

            if (currentDigit == '4') {
                double multi = Math.pow(16,exponent);

                X += (4 * multi);
            }
            if (currentDigit == '5') {
                double multi = Math.pow(16,exponent);

                X += (5 * multi);
            }
            if (currentDigit == '6') {
                double multi = Math.pow(16,exponent);

                X += (6 * multi);
            }

            if (currentDigit == '7') {
                double multi= Math.pow(16,exponent);

                X += (7 * multi);
            }

            if (currentDigit == '8') {
                double multi = Math.pow(16,exponent);

                X += (8 * multi);
            }

            if (currentDigit == '9') {
                double multi = Math.pow(16,exponent);
                X += (9 * multi);
            }

            if ((currentDigit == 'A') || (currentDigit == 'a')) {
                double multi = Math.pow(16,exponent);
                X += (10 * multi);
            }

            if ((currentDigit == 'B') || (currentDigit == 'b')) {
                double multi = Math.pow(16,exponent);
                X += (11 * multi);
            }

            if ((currentDigit == 'C') || (currentDigit == 'c')) {
                double multi = Math.pow(16,exponent);
                X += (12 * multi);
            }

            if ((currentDigit == 'D') || (currentDigit == 'd')) {
                double multi = Math.pow(16,exponent);
                X += (13 * multi);
            }

            if ((currentDigit == 'E') || (currentDigit == 'e')) {
                double multi = Math.pow(16,exponent);
                X += (14 * multi);
            }

            if (( currentDigit == 'F') || (currentDigit == 'f')) {
                double multi = Math.pow(16,exponent);
                X += (15 * multi);
            }
            exponent++;
            countDown--;
        }
        System.out.print("Your number is " + X + " in decimal");
    }
}

