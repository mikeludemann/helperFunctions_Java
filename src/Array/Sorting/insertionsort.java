import java.lang.*;
import java.util.Arrays;

public class InsertionSort {
    
    void sort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            int value = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > value) {

                nums[j + 1] = nums[j];
                j = j - 1;

            }

            nums[j + 1] = value;

        }

    }

}
