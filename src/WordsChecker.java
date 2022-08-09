
import java.util.*;

public class WordsChecker {

    protected String inputText;

    Deque<String> text = new ArrayDeque<>();


    public WordsChecker(String inputText) {
        this.inputText = inputText;
        Collections.addAll(text, inputText.split("\\P{IsAlphabetic}+"));
    }

    protected boolean hasWord(String word) {

        for (String temp : text) {
            if (temp.equals(word)) {
                return true;
            }
        }
        return false;
    }

}
