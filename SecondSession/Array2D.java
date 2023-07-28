import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] arr = new int[3][3];
            System.out.println(arr.length);
            System.out.println("Enter the elements : ");
            for(int rows = 0; rows < arr.length; rows++) {
                for(int cols = 0; cols < arr[rows].length; cols++){
                    arr[rows][cols] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println("Final array is : ");

            // For row-wise printing.
            for(int rows = 0; rows < arr.length; rows++) { 
                System.out.println(Arrays.toString(arr[rows]));
            }

            // Exceptional printing purpose.
            for(int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
