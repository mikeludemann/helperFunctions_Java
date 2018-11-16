import java.lang.*;
import java.util.*;

public class ArrayMethods {

    public static String uniqueArray(int[] array) {
        int arrLen = array.length;

        for (int i = 0; i < arrLen; i++) {

            for (int j = i + 1; j < arrLen; j++) {

                if (array[i] == array[j]) {

                    array[j] = array[arrLen - 1];

                    arrLen--;

                    j--;

                }

            }

        }

        int[] newArray = Arrays.copyOf(array, arrLen);

        String result = "";

        for (int i = 0; i < newArray.length; i++) {

            result += newArray[i] + " ";

        }

        return result;
    }
}