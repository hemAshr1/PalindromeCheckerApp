
import java.util.Stack;

public class Main {

    // Two Pointer Method
    public static boolean twoPointerPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Reverse String Method
    public static boolean reversePalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Stack Method
    public static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "racecar";

        // Two Pointer Timing
        long startTime = System.nanoTime();
        boolean result1 = twoPointerPalindrome(input);
        long endTime = System.nanoTime();
        long time1 = endTime - startTime;

        // Reverse Method Timing
        startTime = System.nanoTime();
        boolean result2 = reversePalindrome(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        // Stack Method Timing
        startTime = System.nanoTime();
        boolean result3 = stackPalindrome(input);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        System.out.println("Palindrome Check for: " + input);
        System.out.println("--------------------------------");

        System.out.println("Two Pointer Method: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println();

        System.out.println("Reverse String Method: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");

        System.out.println();

        System.out.println("Stack Method: " + result3);
        System.out.println("Execution Time: " + time3 + " ns");
    }
}
