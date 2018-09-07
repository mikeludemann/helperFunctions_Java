import java.lang.*;
import java.util.Arrays;

class countingSort {

    void sort(int[] nums, int min, int max) {

        int[] counting = new int[max - min + 1];

        for (int number : nums) {

            counting[number - min]++;

        }

        int j = 0;

        for (int i = min; i <= max; i++) {

            while (counting[i - min] > 0) {

                nums[j] = i;
                j++;
                counting[i - min]--;

            }

        }

    }

}
