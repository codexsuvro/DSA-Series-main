public class Reverse {
    public static void main(String[] args) {
        System.out.println(Rev(19578)); // Method call-ups
    }
    static int Rev(int n) {
        int ans = 0; // Return value initial set
        while(n > 0) {
            int rem = n % 10; // Remainder calculate
            n /= 10; // Initiator value calculate
            ans = (ans*10) + rem; // Final value calculate
        }
        return ans; // Return value
    }
}
