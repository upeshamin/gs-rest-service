package hello;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class WordAnalyserTest {

    private final WordAnalyser wordAnalyser = new WordAnalyser();

    @Test
    public void wordIsAnagramOfPalindromeShouldReturnTrue() {
        String word = "bzzubu";
        boolean anagramOfPalindrome = wordAnalyser.isAnagramOfPalindrome(word);
        assertThat(anagramOfPalindrome, is(true));
    }

    @Test
    public void wordIsNotAnagramOfPalindromeShouldReturnFalse() {
        String word = "buzzer";
        boolean anagramOfPalindrome = wordAnalyser.isAnagramOfPalindrome(word);
        assertThat(anagramOfPalindrome, is(false));
    }

    @Test
    public void wordIsPalindromeShouldReturnTrue() {
        String word = "kayak";
        boolean anagramOfPalindrome = wordAnalyser.isPalindrome(word);
        assertThat(anagramOfPalindrome, is(true));
    }

    @Test
    public void wordIsPalindromeWithMixedCaseShouldReturnFalse() {
        String word = "kayaK";
        boolean anagramOfPalindrome = wordAnalyser.isPalindrome(word);
        assertThat(anagramOfPalindrome, is(false));
    }

    @Test
    public void wordNotBePalindromeShouldReturnFalse() {
        String word = "something";
        boolean anagramOfPalindrome = wordAnalyser.isPalindrome(word);
        assertThat(anagramOfPalindrome, is(false));
    }

    @Test
    public void wordContainsInvalidCharsShouldReturnFalseForAll() {
        String word = "bz*!bu";

        boolean anagramOfPalindrome = wordAnalyser.isAnagramOfPalindrome(word);
        assertThat(anagramOfPalindrome, is(false));

        boolean isPalindrome = wordAnalyser.isPalindrome(word);
        assertThat(isPalindrome, is(false));
    }

    @Test
    public void wordWithSpecialCharsAndAnagramShouldReturnFalse() {
        String word = "bu!bu";

        boolean anagramOfPalindrome = wordAnalyser.isAnagramOfPalindrome(word);
        assertThat(anagramOfPalindrome, is(false));

        boolean isPalindrome = wordAnalyser.isPalindrome(word);
        assertThat(isPalindrome, is(false));
    }

}