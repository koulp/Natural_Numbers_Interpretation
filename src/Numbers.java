import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("---Please Type in Your Number ");

        String number = in.nextLine();
        number = number.replaceAll("\\s+", "");

        //try convert string to int to see if it contains only digits else scan new number
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("---Your Number must contain digits only");
            number = in.nextLine();
            number = number.replaceAll("\\s+", "");
        }

        in.close();

        //if number is validated return 1 else 0
        if (validation(number) == 1)
            System.out.println("---Your Number is: " + number + " [phone number:VALID]");
        else
            System.out.println("---Your Number is: " + number + " [phone number:INVALID]");

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
}
