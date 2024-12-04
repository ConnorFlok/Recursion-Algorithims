import java.util.*;
public class BinarySearch {
    public static void main(String[] args) throws Exception {
        int sizeOfArray = 32;
        int maximumValue = 100;
        int[] A = makeRandom(sizeOfArray,maximumValue);
        Arrays.sort(A);
        int end = A.length-1;
        System.out.println(Arrays.toString(A));
        // Test: search for every integer 0 through 99
        for (int i=0; i<maximumValue; i++) {
            int pos = positionOf(A,0,end,i);
            if (pos>=0) {
                System.out.println("Found "+i+" at position "+pos);
            }
        }
    }
    public static int positionOf(int[] A, int start, int end, int query){
        if (end - start < 0) {
            return -1;   // empty array means not found
        }
        int middle = 0;
        if (end-start==1) {
            middle = start;
        } else {
            middle = start + (end-start)/2;
        }
        if (A[middle]==query) {
            return middle;   // found it! return its position
        }
        if (A[middle] < query) {
            // go right by recursion
            return positionOf(A,middle+1,end,query);
        } 
        // go left by recusion
        return positionOf(A,start,middle-1,query);
    }
    public static int[] makeRandom (int size, int max) {
        Random generator = new Random(42);
        int[] A = new int[size];
        for (int i=0; i<size; i++) {
            A[i] = generator.nextInt(max);
        }
        return A;
    }
}