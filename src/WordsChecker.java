import java.util.*;

public class WordsChecker {

    protected String inputText;

    Deque<String> text = new LinkedList<>();



        public WordsChecker(String inputText) {
        this.inputText = inputText;
            for (String temp:inputText.split("\\P{IsAlphabetic}+")) {
                text.add(temp);
            }
    }

    protected boolean hasWord(String word) {

        for (String temp: text) {
            if (temp.equals(word)){
                return true;
            }
        }
        return false;
    }

}
