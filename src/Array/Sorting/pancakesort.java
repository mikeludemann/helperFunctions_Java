import java.lang.*;
import java.util.Arrays;

public class PancakeSort {

    int[] heap;

    public String toString() {

        String info = "";

        for (int x : heap)
            info += x + " ";

        return info;

    }

    public void changingPosition(int n) {

        for (int i = 0; i < (n + 1) / 2; ++i) {

            int tmp = heap[i];
            heap[i] = heap[n - i];
            heap[n - i] = tmp;

        }

    }

    public int[] smallAndHigh(int n) {
        int min, max;

        min = max = heap[0];

        int minPosition = 0, maxPosition = 0;

        for (int i = 1; i < n; ++i) {

            if (heap[i] < min) {

                min = heap[i];
                minPosition = i;

            } else if (heap[i] > max) {

                max = heap[i];
                maxPosition = i;

            }

        }

        return new int[] { minPosition, maxPosition };
    }

    public void sort(int n, int dir) {

        if (n == 0)
            return;

        int[] sah = smallAndHigh(n);
        int newPosition = sah[dir];
        int altPosition = sah[1 - dir];
        boolean changingPositionped = false;

        if (newPosition == n - 1) {

            --n;

        } else if (newPosition == 0) {

            changingPosition(n - 1);
            --n;

        } else if (altPosition == n - 1) {

            dir = 1 - dir;
            --n;
            changingPositionped = true;

        } else {

            changingPosition(newPosition);

        }

        sort(n, dir);

        if (changingPositionped) {

            changingPosition(n);

        }

    }

    PancakeSort(int[] numbers) {

        heap = numbers;
        sort(numbers.length, 1);

    }

}
