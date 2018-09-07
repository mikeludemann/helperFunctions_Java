import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PermutationSort {

    public static int[] sort(int[] a) {

        List<int[]> list = new ArrayList<int[]>();

        permutation(a, a.length, list);

        for (int[] x : list)
            if (isSorted(x))
                return x;

        return a;

    }

    private static void permutation(int[] a, int n, List<int[]> list) {
        if (n == 1) {

            int[] b = new int[a.length];

            System.arraycopy(a, 0, b, 0, a.length);

            list.add(b);

            return;

        }

        for (int i = 0; i < n; i++) {

            changingPosition(a, i, n - 1);

            permutation(a, n - 1, list);

            changingPosition(a, i, n - 1);

        }

    }

    private static boolean isSorted(int[] a) {

        for (int i = 1; i < a.length; i++)
            if (a[i - 1] > a[i])
                return false;

        return true;

    }

    private static void changingPosition(int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

}
