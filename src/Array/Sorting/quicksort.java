import java.lang.*;
import java.util.Arrays;

public class QuickSort {

    private int tmp_arr[];
    private int len;

    public void sort(int[] nums) {

        if (nums == null || nums.length == 0) {
            return;
        }
        this.tmp_arr = nums;
        len = nums.length;
        quickSort(0, len - 1);
    }

    private void quickSort(int indexLow, int indexHigh) {

        int i = indexLow;
        int j = indexHigh;

        int pivot = tmp_arr[indexLow + (indexHigh - indexLow) / 2];

        while (i <= j) {

            while (tmp_arr[i] < pivot) {
                i++;
            }

            while (tmp_arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                changingPosition(i, j);

                i++;
                j--;
            }

        }

        if (indexLow < j)
            quickSort(indexLow, j);

        if (i < indexHigh)
            quickSort(i, indexHigh);
    }

    private void changingPosition(int i, int j) {
        int tmp = tmp_arr[i];
        tmp_arr[i] = tmp_arr[j];
        tmp_arr[j] = tmp;
    }

}
