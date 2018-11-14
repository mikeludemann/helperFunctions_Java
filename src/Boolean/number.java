import java.lang.*;
import java.util.*;

public class NumberBoolean {

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

}