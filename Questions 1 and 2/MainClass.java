import java.io.IOException;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        try {
            ArrayList<String> vocabulary = new ArrayList<>(MyFileReader.readFile("google-10000-english-no-swears.txt", true));

            // To store the contents of the input file that is to be analyzed to a variable
            ArrayList<String> vocabWords = new ArrayList<>(MyFileReader.readFile("Input219.txt", false));

            // To filter the words from the input file so that only the ones that appear in the vocabulary are stored in the new list
            ArrayList<String> validWords = new ArrayList<>();
            validWords.addAll(WordExtractionTool.onlyValidWords(vocabulary, vocabWords));

            // To format the output to the consule so that it is legible 
            System.out.println("Question 1");
            System.out.println("Total word count after word extraction: " + validWords.size());
            System.out.println("Valid words: " + validWords);
            System.out.println();

            Counter counter = new Counter();
            System.out.println("Question 2");

            // To iterate from 100 to the size of the valid words list with increments of 100, where i is the number of words that is to be sorted for each iteration
            for (int i = 100; i <= validWords.size(); i += 100) {
            // To create a new list that contains the first i number of words from the valid words list
            ArrayList<String> subList = new ArrayList<>(validWords.subList(0, i));
                counter.reset(); // resets counter to zero

                long startTime = System.nanoTime();
                // To arrange the sublist in ascending order and track the number of moves and comparisons performed in the sort
                MergeSorter.mergeSort(subList, 0, subList.size() - 1, counter);
                long endTime = System.nanoTime(); // time at which sort finishes

                long duration = (endTime - startTime); // time taken to finish the sort
                // To format the output to the consule in a legible way 
                System.out.println(duration + " nanoseconds to sort " + i + " words");
                System.out.println(counter.getComparisons() + " comparisons done to sort " + i + " words");
                System.out.println(counter.getMoves() + " moves done to sort " + i + " words");
                System.out.println();
            }

            counter.reset();

            long startTime = System.nanoTime();

            // To sort the valid words list by merge sort method in order to obtain a list 
            MergeSorter.mergeSort(validWords, 0, validWords.size() - 1, counter);

            // To obtain the time required for the whole sort process
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);

            // To format the output to the consule in a legible way
            System.out.println(duration + " nanoseconds to sort a total of " + validWords.size() + " words");
            System.out.println(counter.getComparisons() + " comparisons done to sort a total of " + validWords.size() + " words");
            System.out.println(counter.getMoves() + " moves done to sort a total of " + validWords.size() + " words");
            System.out.println();
            System.out.println("Final contents in alphabetical order: " + validWords);
        } 

        // To catch any potential exceptions that occur in the try block and print information about the exception
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}