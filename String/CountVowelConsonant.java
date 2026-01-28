package String;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String input = "asdias dasdjasdqwewqwpe aeiou asda   7a6s78d67sa6d7 a6 7as dasda syd asbdt7y";
        input = input.toLowerCase();
        int countVowels = 0;
        int countConsonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                } else if (ch != ' ') {
                    countConsonants++;
                }
            }
        }
        System.out.println("Vowels = " + countVowels);
        System.out.println("Consonants = " + countConsonants);
    }
}
