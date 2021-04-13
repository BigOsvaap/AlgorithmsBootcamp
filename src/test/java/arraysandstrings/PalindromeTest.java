package arraysandstrings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    void isPalindrome() {
        assertTrue(palindrome.isPalindrome("La ruta nos aportó, otro paso natural"));
        assertTrue(palindrome.isPalindrome("No deseo ese don"));

    }

    @Test
    void isNotPalindrome(){
        assertFalse(palindrome.isPalindrome("No, soy palindromo"));
    }

}