import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5]; // int[] arr part goes to stack memory while new int[5] goes to heap memory.
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr)); // Gives initial array without changes.
            changes(arr);
            System.out.println(Arrays.toString(arr)); // Gives array after changing elements.
            swap(arr, 0, 4);
            System.out.println(Arrays.toString(arr)); // Gives array after swapping.
            System.out.println("Maximum value in the array is : " + max(arr)); // Calculate the highest element in the array.
        }
    }

    static void changes(int[] arr) {
        arr[2] = 8; // Change the third element in the array.
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
