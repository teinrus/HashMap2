import java.util.*;

public class WordsChecker {

    protected String inputText;

    public WordsChecker(String inputText) {
        this.inputText = inputText;
    }

    protected boolean hasWord(String word) {

        List text = new ArrayList<>();
        text = List.of(inputText.split("\\P{IsAlphabetic}+"));

        return text.contains(word);

    }
}
