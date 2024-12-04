package Recursions;

public class Fibonacci {
    // Fibonacci sequence: 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {
        int result = fibber(1, 1, 3, 10); // Starting from the 3rd Fibonacci number, up to the 10th
        System.out.println(result); // Expect 55
    }

    // Recursive method to calculate the nth Fibonacci number
    public static int fibber(int prev1, int prev2, int current, int stop) {
        if (current == stop) {
            return prev2;
        } else {
            return fibber(prev2, prev1 + prev2, current + 1, stop);
        }
    }

    // Method to get the nth Fibonacci number
    public static int fib(int n) {
        if (n <= 2) {
            return 1; // First two Fibonacci numbers are 1
        } else {
            return fibber(1, 1, 3, n); // Start recursion from 3rd Fibonacci number
        }
    }
}
