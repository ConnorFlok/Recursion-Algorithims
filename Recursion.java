package Recursions;

public class Recursion {
    public static void main(String[] args) {
        blastOffIter(10); // Iterative version
        blastOffRecur(10); // Recursive version
    }

    // Iterative method for blast off
    public static void blastOffIter(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("BLAST OFF!");
    }

    // Recursive method for blast off
    public static void blastOffRecur(int n) {
        if (n > 0) {
            System.out.println(n);
            blastOffRecur(n - 1); // Recursive call
        } else {
            System.out.println("BLAST OFF!");
        }
    }
}
