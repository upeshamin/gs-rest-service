package hello;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class WordAnalyser {

    public Boolean isPalindrome(String word) {
        if(doesNotContainSpecialChars(word)) {
            char[] chars = word.toCharArray();
            char[] reversed = new char[chars.length];
            for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--) {
                reversed[i] = chars [j];
            }
            return new String(chars).equals(new String(reversed));
        }
        return false;
    }

    public Boolean isAnagramOfPalindrome(String word) {
        if(doesNotContainSpecialChars(word)) {
            char[] chars = word.toCharArray();

            Map<Character, Integer> charMapCount = new HashMap<>();

            for (char character : chars) {
                charMapCount.compute(character, (letter, count) -> {
                    if (count == null) {
                        return 1;
                    }
                    if (character == letter) {
                        return ++count;
                    }
                    return count;
                });
            }

            boolean evenNumberOfChars = charMapCount.entrySet().stream().allMatch(characterIntegerEntry ->
                characterIntegerEntry.getValue() % 2 == 0);

            boolean singleOddChar = charMapCount.entrySet().stream().filter(characterIntegerEntry ->
                characterIntegerEntry.getValue() % 2 == 1).count() == 1;

            return evenNumberOfChars || singleOddChar;
        }
        return false;
    }

    private boolean doesNotContainSpecialChars(String word) {
        return word.matches("[a-zA-Z]+");
    }

}
