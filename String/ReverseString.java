package String;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse: ");
        String input = sc.nextLine();
        String result = reverseString(input);
        System.out.println("Using Reverse String.");
        System.out.println(result);
        StringBuilder resultStringBuilder = reverseUsingStringBuilder(input);
        System.out.println("Using Reverse StringBuilder.");
        System.out.println(resultStringBuilder);
        sc.close();
    }

    // Time Complexity: O(n) not achieved
    public static String reverseString(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result = ch + result;
        }
        return result;
    }

    // Time Complexity: O(n) achieved
    public static StringBuilder reverseUsingStringBuilder(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result;
    }
}
