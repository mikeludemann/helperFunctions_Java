import java.lang.*;
import java.util.Arrays;

public class BeadSort {

    int[] sort(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        char[][] grid = new char[arr.length][max];
        int[] counter = new int[max];
        for (int i = 0; i < max; i++) {
            counter[i] = 0;
            for (int j = 0; j < arr.length; j++)
                grid[j][i] = '_';
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 0; num > 0; j++) {
                grid[counter[j]++][j] = '*';
                num--;
            }

        }

        System.out.println();

        int[] sortingArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int putt = 0;
            for (int j = 0; j < max && grid[arr.length - 1 - i][j] == '*'; j++)
                putt++;
            sortingArray[i] = putt;
        }

        return sortingArray;
    }

    void display1D(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    void display1D(char[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    void display2D(char[][] arr) {

        for (int i = 0; i < arr.length; i++)
            display1D(arr[i]);

    }

}
