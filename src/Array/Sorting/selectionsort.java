import java.lang.*;
import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            int smallest = Integer.MAX_VALUE;
            int smallestPosition = i + 1;

            for (int check = i; check < nums.length; check++) {

                if (nums[check] < smallest) {

                    smallestPosition = check;
                    smallest = nums[check];

                }

            }

            int temp = nums[i];
            nums[i] = nums[smallestPosition];
            nums[smallestPosition] = temp;

        }

    }
        
}
