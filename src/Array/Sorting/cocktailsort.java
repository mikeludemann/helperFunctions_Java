import java.lang.*;
import java.util.Arrays;

class cocktailSort {

    void sort(int nums[]) {

        boolean swapping;

        do {

            swapping = false;

            for (int i = 0; i <= nums.length - 2; i++) {

                if (nums[i] > nums[i + 1]) {
                    
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                    swapping = true;

                }

            }

            if (!swapping) {

                break;

            }

            swapping = false;

            for (int i = nums.length - 2; i >= 0; i--) {

                if (nums[i] > nums[i + 1]) {

                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                    swapping = true;
                }

            }

        } while (swapping);

    }

}
