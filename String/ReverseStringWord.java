package String;

import java.util.*;

public class ReverseStringWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement to reverse print it: ");
        String input = sc.nextLine();
        // String input = "Java is a High-Level Programming Language";
        String result = printPattern(input);
        System.out.println("Reversed String is: ");
        System.out.println(result);
        sc.close();
    }

    public static String printPattern(String input) {
        String[] inputArrayStrings = input.split(" ");
        String result = "";
        for (String inpuString : inputArrayStrings) {
            result = inpuString + " " + result;
        }
        return result;
    }
}
