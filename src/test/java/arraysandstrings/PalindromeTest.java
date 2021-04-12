package arraysandstrings;

import arraysandstrings.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @org.junit.jupiter.api.Test
    void isPalindrome() {

        assertFalse(palindrome.isPalindrome(""));

    }
}