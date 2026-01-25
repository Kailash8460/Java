package String;

import java.util.*;

public class ReverseStringWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement to reverse print it: ");
        String input = sc.nextLine();
        // String input = "Java is a High-Level Programming Language";
        String result1 = printPattern(input);
        String result2 = printUsingLoops(input);
        System.out.println("Reversed String is: Result 1 - " + result1);
        System.out.println("Reversed String is: Result 2 - " + result2);
        sc.close();
    }

    // using String method
    public static String printPattern(String input) {
        String[] inputArrayStrings = input.split(" ");
        String result = "";
        for (String inpuString : inputArrayStrings) {
            result = inpuString + " " + result;
        }
        return result;
    }

    // using loop
    public static String printUsingLoops(String input) {
        String word = "";
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!String.valueOf(ch).equals(" ")) {
                word = word + ch;
            } else {
                result = word + " " + result;
                word = "";
            }

        }
        result = word + " " + result;
        return result;
    }
}
