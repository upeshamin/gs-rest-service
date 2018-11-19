package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @Autowired
    private WordAnalyser wordAnalyser;

    @RequestMapping(path = "/words/{word}", method = RequestMethod.GET)
    public WordsResponse words(@PathVariable final String word) {
        boolean isPalindrome = wordAnalyser.isPalindrome(word);
        boolean isAnagramOfPalindrome = wordAnalyser.isAnagramOfPalindrome(word);
        return new WordsResponse(word, isPalindrome, isAnagramOfPalindrome);
    }

}
