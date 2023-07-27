import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileReader {
    public static ArrayList<String> readFile(String fileName, boolean toLowerCase) throws IOException {
        // To create new ArrayList to contain converted words
        ArrayList<String> vocabs = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String storeLine;
        // To loop through each line from the file until the end of the file
        while ((storeLine = bufferedReader.readLine()) != null) {
            // To split the line into separate words by whitespace
            for (String word : storeLine.split("\\s")) {
                // To change to lower-case
                if (toLowerCase) {
                    vocabs.add(word.toLowerCase());
                } else {
                    vocabs.add(word);
                }
            }
        }

        bufferedReader.close();
        return vocabs;
    }
}
