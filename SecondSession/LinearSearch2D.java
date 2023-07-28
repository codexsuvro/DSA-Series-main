import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] arr = new int[3][3];
            for(int rows = 0; rows < arr.length; rows++) {
                for(int cols = 0; cols < arr[rows].length; cols++){
                    arr[rows][cols] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println("Final array is : ");
            for(int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
            System.out.print("Enter the target : ");
            int target = sc.nextInt();
            int[] ans = linearsearch(arr, target);
            System.out.println(Arrays.toString(ans));
            System.out.println("Maximum element : " + max(arr));
        }
    }

    // Linear Search in 2D.
    static int[] linearsearch(int[][] arr, int target) {
        if(arr.length == 0) {
            return new int[]{-1,-1};
        }
        for (int rows = 0; rows < arr.length; rows++) {
            for(int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols] == target) {
                    return new int[]{rows+1,cols+1};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Finding Max element.
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] a : arr) {
            for(int b : a) {
                if(b > max) {
                    max = b;                
                }
            }
        }
        return max;
    }
}
