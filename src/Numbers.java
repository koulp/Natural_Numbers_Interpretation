
import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("---Please Type in Your Number ");

        String number = in.nextLine();
        number = number.replaceAll("\\s+", "");

        //try convert string to int to see if it contains only digits
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            /*System.out.println("---Your Number must contain digits only");
            number = in.nextLine();
            number = number.replaceAll("\\s+", "");*/
        }
        in.close();

        //if number is validated return 1 else 0
        if (validation(number) == 1)
            System.out.println("---Your Number is: " + number + " [phone number:VALID]");
        else
            System.out.println("---Your Number is: " + number + " [phone number:INVALID]");

        //ambiguities(number);
    }


    static int validation(String number) {
        String[] number2 = number.split("");

        if (number2.length == 10
                && (number2[0].equals("2")
                || (number2[0].equals("6") && number2[1].equals("9"))))
            return 1;

        if (number2.length == 14
                && number2[0].equals("0")
                && number2[1].equals("0")
                && number2[2].equals("3")
                && number2[3].equals("0")

                && (number2[4].equals("2")
                || (number2[4].equals("6") && number2[5].equals("9")))
                )
            return 1;

        return 0;
    }

    /*static void ambiguities(String number) {
        String[] valid = number.split("");
        int [] valid2= new int[valid.length];

        //converting String array to Int array
        for (int i = 0; i < valid.length; i++) {
            valid2[i]= Integer.parseInt(valid[i]);
        }
        //Adding ambiguities
        long num = 0;

        for (int a : valid2) {
            if (a < 0) throw new IllegalArgumentException();
            int i = a;
            do {
                num *= 10;
                i /= 10;
            } while (i != 0);
            num += a;
        }
                System.out.println("Interpretation 1: " + num);

        for (int i = 0; i < valid2.length; i++) {
            int digitlength = valid[i].length();

            if(digitlength == 2) {
                for (int a : valid2) {
                    if (a < 0) throw new IllegalArgumentException();
                    int i2 = a;
                    do {
                        //num *= 10;
                        i2 /= 10;
                    } while (i2 != 0);
                    num += a;
                }
                System.out.println("Interpretation : " + num);
            }
        }
    }*/
}
