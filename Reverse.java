public class Reverse {
    public static void main(String[] args) {
        printCharsReverse("Hood");
    }

    public static void printCharsReverse(String str) {
        if (str == null || str.equals("")) {
            return;
        } else {
            printCharsReverse(str.substring(1));  
            System.out.println(str.charAt(0));   
        }
    }
}
