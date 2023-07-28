package ThirdSession;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows : ");
            int n = sc.nextInt();

            // *
            // **
            // ***
            // ***
            // **
            // *
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = n; i >= 1; i--) {
                for(int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            // *
            // **
            // ***
            // **
            // *
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = n-1; i >= 1; i--) {
                for(int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            //    *
            //   * *
            //  * * *
            // * * * *
            //  * * *
            //   * *
            //    * 
            for(int i = 0; i < 2 * n; i++) {
                int totalColsInRow = i > n ? 2 * n - i : i;
                int space = n - totalColsInRow;
                for(int s = 0; s < space; s++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < totalColsInRow; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
