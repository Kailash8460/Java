package String;

public class PalindromeString {
    public static void main(String[] args) {
        String input = "Madam";
        input = input.toLowerCase();

        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

        palindromeStringBuilder(input);
        palindromeNoMethod(input);
    }

    // Using String Builder Reversed method
    public static void palindromeStringBuilder(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }

    // No built-in methods
    public static void palindromeNoMethod(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        if (input.equals(result.toString())) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
