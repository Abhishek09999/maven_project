package devops;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("\\W", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static int countVowels(String input) {
        return input.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static void main(String[] args) {
        String testWord = "Racecar";

        System.out.println("Input: " + testWord);
        if (isPalindrome(testWord)) {
            System.out.println("✅ '" + testWord + "' is a palindrome.");
        } else {
            System.out.println("❌ '" + testWord + "' is not a palindrome.");
        }

        System.out.println("Vowel Count: " + countVowels(testWord));
    }
}
