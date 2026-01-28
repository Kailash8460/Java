package String;

public class WhitespaceRemove {
    public static void main(String[] args) {
        String input = "    Hello           World  from    Java    ";
        String result = input.replaceAll("\\s", " ");
        System.out.println(result);
        withoutRegex(input);
        keepOneSpace(input);
    }

    public static void withoutRegex(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                result.append(input.charAt(i));
            }
        }
    }

    public static void keepOneSpace(String input) {
        String result = input.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
