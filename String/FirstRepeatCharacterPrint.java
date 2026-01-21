package String;

import java.util.*;

public class FirstRepeatCharacterPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to find first non repeatable charcter: ");
        String input = sc.nextLine();
        char result1 = FirstCharacter(input);
        char result2 = NonRepeatChar(input);
        if (result1 != 0) {
            System.out.println("First repeatable character is (result1): " + result1);
        } else {
            System.out.println("No repeatable character found.");
        }
        if (result2 != 0) {
            System.out.println("First repeatable character is (result2): " + result2);
        } else {
            System.out.println("No repeatable character found.");
        }
        sc.close();
    }

    // using string method
    public static char FirstCharacter(String input) {
        char firstChar = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) != input.lastIndexOf(input.charAt(i))) {
                firstChar = input.charAt(i);
                break;
            }
        }
        return firstChar;
    }

    // using for loop
    public static char NonRepeatChar(String input) {
        char firstChar = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch1 = input.charAt(i);
            for (int j = 0; j < input.length(); j++) {
                char ch2 = input.charAt(j);
                if (ch1 == ch2) {
                    count++;
                }
            }
            if (count > 1) {
                firstChar = ch1;
                break;
            }
            count = 0;
        }
        return firstChar;
    }
}
