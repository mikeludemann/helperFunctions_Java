import java.lang.*;
import java.util.*;

public class Boolean {

    private static boolean isPrime(int number) {
        if (number == 2) {

            return true;

        }
        if (number % 2 == 0) {

            return false;

        }
        for (int i = 3; i * i <= number; i += 2) {

            if (number % i == 0) {

                return false;

            }

        }

        return true;
    }

    public static boolean isLeapYear(int year) {
        boolean small = (year % 4) == 0;
        boolean middle = (year % 100) != 0;
        boolean big = ((year % 100 == 0) && (year % 400 == 0));

        return small && (middle || big);
    }

    public static boolean isPasswordValid(String password, int passwordLength) {

        if (password.length() < passwordLength) {
            return false;
        }

        int countCharacter = 0;
        int numberCharacter = 0;

        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (isNumeric(character)) {
                numberCharacter++;
            } else if (isLetter(character)) {
                countCharacter++;
            } else {
                return false;
            }
        }

        return (countCharacter >= 2 && numberCharacter >= 2);
    }

    public static boolean isLetter(char character) {
        character = Character.toUpperCase(character);

        return (character >= 'A' && character <= 'Z');
    }

    public static boolean isNumeric(char character) {
        return (character >= '0' && character <= '9');
    }

}