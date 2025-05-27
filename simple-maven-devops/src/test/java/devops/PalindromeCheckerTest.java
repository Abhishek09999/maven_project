package devops;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckerTest {

    @Test
    public void testPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("Madam"));
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
        assertFalse(PalindromeChecker.isPalindrome("Hello"));
    }

    @Test
    public void testVowelCount() {
        assertEquals(2, PalindromeChecker.countVowels("hello"));
        assertEquals(5, PalindromeChecker.countVowels("education"));
        assertEquals(0, PalindromeChecker.countVowels("rhythm"));
    }
}
