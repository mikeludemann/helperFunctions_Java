import java.lang.*;
import java.util.Arrays;

public class BogoSort {

    void bogo(int[] arr) {

        int shuffle = 1;
        for (; !isSorted(arr); shuffle++)
            shuffling(arr);

        System.out.println("This took " + shuffle + " shuffles.");
    }

    void shuffling(int[] arr) {

        int i = arr.length - 1;

        while (i > 0)
            changingPosition(arr, i--, (int) (Math.random() * i));

    }

    void changingPosition(int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++)

            if (arr[i] < arr[i - 1])
                return false;

        return true;
    }

    void display1D(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

}
