package hello;

public class WordsResponse {

    private String word;
    private boolean palindrome;
    private boolean anagramOfPalindrome;

    public WordsResponse(String word, boolean palindrome, boolean anagramOfPalindrome) {
        this.word = word;
        this.palindrome = palindrome;
        this.anagramOfPalindrome = anagramOfPalindrome;
    }

    public String getWord() {
        return word;
    }

    public boolean isPalindrome() {
        return palindrome;
    }

    public boolean isAnagramOfPalindrome() {
        return anagramOfPalindrome;
    }

}
