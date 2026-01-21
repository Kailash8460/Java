package String;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to reverse: ");
        String input = sc.nextLine();
        String result = reverseString(input);
        System.out.println(result);
        sc.close();
    }

    public static String reverseString(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result = ch + result;
        }
        return result;
    }
}
