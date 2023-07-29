package FourthSession;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergesort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergesort(left), mergesort(right));
    }

    private static int[] merge(int[] mergesort, int[] mergesort2) {
        int[] result = new int[mergesort.length + mergesort2.length];
        int i = 0, j = 0, k = 0;
        while (i < mergesort.length && j < mergesort2.length) {
            if (mergesort[i] < mergesort2[j]) {
                result[k++] = mergesort[i++];
            } else {
                result[k++] = mergesort2[j++];
            }
        }
        while (i < mergesort.length) {
            result[k++] = mergesort[i++];
        }
        while (j < mergesort2.length) {
            result[k++] = mergesort2[j++];
        }
        return result;
    }
}
