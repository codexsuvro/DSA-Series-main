public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fib(10)); // Method call-up
    }
    static int Fib(int n) {
        int p = 0;
        int i = 1;
        int count = 2; // For two-numbers initially taken
        while(count <= n) {
            int temp = i; // Ref. varaible shift to temp variable
            i += p; // Make new i variable
            p = temp; // Shift temp to p variable
            count++; // Count add-ons 
        }
        return i; // Return value
    }
}