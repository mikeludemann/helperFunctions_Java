import java.lang.*;
import java.util.Arrays;

public class StoogeSort {

    public static void sort(int[] arrLength) {

        sortingStooge(arrLength, 0, arrLength.length - 1);

    }

    public static void sortingStooge(int[] arrLength, int i, int j) {

        if (arrLength[j] < arrLength[i]) {

            int tmp = arrLength[i];
            arrLength[i] = arrLength[j];
            arrLength[j] = tmp;
            
        }

        if (j - i > 1) {

            int t = (j - i + 1) / 3;
            sortingStooge(arrLength, i, j - t);
            sortingStooge(arrLength, i + t, j);
            sortingStooge(arrLength, i, j - t);

        }

    }

}
