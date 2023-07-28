import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Array purpose. 
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Here are your given elements : " + Arrays.toString(arr));
            System.out.print("Enter the target element : ");
            int target = sc.nextInt();
            if (linearsearchA(arr, target) == 0) {
                System.out.println("Array length is invalid.");
            } else if (linearsearchA(arr, target) == -1) {
                System.out.println("Not Found.");
            } else {
                System.out.println("Found at : " + linearsearchA(arr, target));
            }

            // For String purpose. 
            System.out.print("Enter the word : ");
            String s = sc.next();
            char p = 'u';
             if (linearsearchS(s, p) == 0) {
                System.out.println("Array length is invalid.");
             } else if (linearsearchS(s, p) == -1) {
                 System.out.println("Not Found.");
             } else {
                 System.out.println("Found at : " + linearsearchS(s, p));
             }
        }
    }

    static int linearsearchA(int[] arr, int target) {
    if(arr.length == 0) {
    return 0;
    }
    for (int i = 0; i < arr.length; i++) {
    if(arr[i] == target) {
    return i + 1;
    }
    }
    return -1;
    }

    static int linearsearchS(String s, char p) {
        if(s.length() == 0) {
            return 0;
        }
        for( int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == p) {
                return i + 1;
            }
        }
        return -1;
    }
}
