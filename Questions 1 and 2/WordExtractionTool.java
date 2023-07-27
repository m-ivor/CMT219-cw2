import java.util.ArrayList;

public class WordExtractionTool {
    public static ArrayList<String> onlyValidWords(ArrayList<String> vocabulary, ArrayList<String> vocabWords) {
        ArrayList<String> validWords = new ArrayList<>();

        for (String vocab : vocabWords) {
            // To change to lower-case and remove any non-alphanumeric chars
            String ignorePunctuation = vocab.toLowerCase().replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");

            if (vocabulary.contains(ignorePunctuation)) {
                validWords.add(vocab);
            }
        }
        return validWords;
    }
}
