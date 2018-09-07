import java.lang.*;
import java.util.Arrays;

public class BucketSort {

    static int[] sort(int[] nums, int maxValue) {

        int[] bucketArray = new int[maxValue + 1];
        int[] sortingArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            bucketArray[nums[i]]++;

        int outPos = 0;

        for (int i = 0; i < bucketArray.length; i++)
            for (int j = 0; j < bucketArray[i]; j++)
                sortingArray[outPos++] = i;

        return sortingArray;

    }

    static int maxValue(int[] nums) {

        int maxValue = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > maxValue)
                maxValue = nums[i];

        return maxValue;

    }

}
