import java.util.Collections;
import java.util.HashSet;

public class WordsChecker {

    protected String inputText;
    HashSet<String> text = new HashSet<>();

    public WordsChecker(String inputText) {
        this.inputText = inputText;
        Collections.addAll(text, inputText.split("\\P{IsAlphabetic}+"));
    }

    protected boolean hasWord(String word) {
        return text.contains(word);
    }

}
