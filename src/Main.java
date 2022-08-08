
public class Main {

    public static void main(String[] args) {

        String inputText = "List — это упорядоченная коллекция, наиболее часто используемая в Java Collections " +
                "Framework. Этот интерфейс контролирует, где вставлен каждый элемент списка. При работе с List " +
                "пользователю доступны элементы списка по их целочисленному индексу " +
                "(позиции в списке). Интерфейс List имеет две стандартные реализации — ArrayList и LinkedList.";

        String word = "Этот";
        WordsChecker text = new WordsChecker(inputText);

        System.out.println(text.hasWord(word));

        word = "dfgdfgdfg";
        System.out.println(text.hasWord(word));

        word = "Framework";
        System.out.println(text.hasWord(word));

    }
}
