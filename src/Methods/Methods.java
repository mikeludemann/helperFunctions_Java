import java.lang.*;
import java.util.*;

public class Methods {

    public static int countVowel(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                counter++;
            }
        }

        return counter;
    }

    public static int countConsonant(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                counter++;
            }
        }
        int strlen = str.length();
        int result = strlen - counter;

        return result;
    }

    public static void printCharacterDistance(char firstCharacter, char secondCharacter, int index) {
        for (int ctr = 1; firstCharacter <= secondCharacter; ctr++, firstCharacter++) {

            System.out.print(firstCharacter + " ");

            if (ctr % index == 0) {
                System.out.println("");
            }

        }

        System.out.print("\n");
    }

}