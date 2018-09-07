import java.lang.*;
import java.util.Arrays;

class CombSort {

    void sort(int nums[]) {

        int len = nums.length;

        float shrinkFactor = 1.3f;

        boolean swapping = false;

        while (len > 1 || swapping) {

            if (len > 1) {

                len = (int) (len / shrinkFactor);

            }

            swapping = false;

            for (int i = 0; len + i < nums.length; i++) {

                if (nums[i] > nums[i + len]) {

                    swap(nums, i, i + len);
                    swapping = true;

                }

            }

        }

    }

    private static void swap(int nums[], int x, int y) {

        Integer tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;

    }

}
