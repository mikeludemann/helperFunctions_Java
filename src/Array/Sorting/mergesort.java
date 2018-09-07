import java.lang.*;
import java.util.Arrays;

public class MergeSort {

    private void merge(int nums[], int leftPosition, int m, int rightPosition) {
        int n1 = m - leftPosition + 1;
        int n2 = rightPosition - m;

        int leftPosition_arr[] = new int[n1];
        int rightPosition_arr[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftPosition_arr[i] = nums[leftPosition + i];

        for (int j = 0; j < n2; ++j)
            rightPosition_arr[j] = nums[m + 1 + j];

        int i = 0, j = 0;

        int k = leftPosition;

        while (i < n1 && j < n2) {

            if (leftPosition_arr[i] <= rightPosition_arr[j]) {

                nums[k] = leftPosition_arr[i];
                i++;

            } else {

                nums[k] = rightPosition_arr[j];
                j++;

            }

            k++;

        }

        while (i < n1) {

            nums[k] = leftPosition_arr[i];
            i++;
            k++;

        }

        while (j < n2) {

            nums[k] = rightPosition_arr[j];
            j++;
            k++;

        }

    }

    void sort(int nums[], int leftPosition, int rightPosition) {

        if (leftPosition < rightPosition) {
            
            int m = (leftPosition + rightPosition) / 2;

            sort(nums, leftPosition, m);
            
            sort(nums, m + 1, rightPosition);

            merge(nums, leftPosition, m, rightPosition);

        }

    }

}
