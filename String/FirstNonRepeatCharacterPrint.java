package String;

import java.util.*;

public class FirstNonRepeatCharacterPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to find first non repeatable charcter: ");
        String input = sc.nextLine();
        char result1 = FirstCharacter(input);
        char result2 = NonRepeatChar(input);
        if (result1 != 0) {
            System.out.println("First non repeatable character is (result1): " + result1);
        } else {
            System.out.println("No non-repeatable character found.");
        }
        if (result2 != 0) {
            System.out.println("First non repeatable character is (result2): " + result2);
        } else {
            System.out.println("No non-repeatable character found.");
        }
        sc.close();
    }

    // using string method
    public static char FirstCharacter(String input) {
        char firstChar = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))) {
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
            if (count == 1) {
                firstChar = ch1;
                break;
            }
            count = 0;
        }
        return firstChar;
    }

    // using array list - way too complex (not for interview)
    public static void ComplexLogic() {
        String input = "reverse";
        input = input.toLowerCase();
        int length = input.length();
        int count = 0;
        ArrayList<String> characters = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            char ch1 = input.charAt(i);
            for (int j = 0; j < length; j++) {
                char ch2 = input.charAt(j);
                if (ch1 == ch2) {
                    count++;
                }
            }
            String res = String.valueOf(ch1);
            characters.add(res + count);
            count = 0;
        }
        System.out.println(characters);
        for (int i = 0; i < length; i++) {
            String character = characters.get(i);
            if (character.contains("1")) {
                System.out.println(character.charAt(0));
                break;
            }
        }
    }
}
