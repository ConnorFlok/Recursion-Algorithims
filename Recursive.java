public class Recursive {
    public static void main(String[] args) {
        printChars("Hood");
    }

    public static void printChars(String str) {
        if (str == null || str.equals("")) {
            return;  
        } else {
            System.out.print("Give me a ");
            System.out.println(str.charAt(0));  
            printChars(str.substring(1));  
        }
    }
}


