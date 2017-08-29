package test;

/**
 * A dummy program to enable the creation of elementary test to verify that
 * the CI works.
 */
public class Main {

    /**
     * Prints "Hello, world!" to standard output.
     */
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
    
    /**
     * Reverses a string
     */
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int index = str.length(); index > 0; --index) {
            sb.append(str.charAt(index - 1));
        }
        return sb.toString();
    }
    
}
