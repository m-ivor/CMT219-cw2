import java.util.ArrayList;

public class MergeSorter {
    public static void mergeSort(ArrayList<String> vocabs, int leftBranch, int rightBranch, Counter counter) {
        // To check if there are elements left to sort from the list
        if (leftBranch < rightBranch) {
            // To find the middle index by finding the average between left and right branch
            int middleIndex = leftBranch + (rightBranch - leftBranch) / 2;
            // To sort the left branch
            mergeSort(vocabs, leftBranch, middleIndex, counter);
            // To sort the right branch
            mergeSort(vocabs, middleIndex + 1, rightBranch, counter);
            // To merge the left and right branches of the sublist
            merge(vocabs, leftBranch, middleIndex, rightBranch, counter);
        }
    }

    // To merge the sorted sublists into one sublist
    // vocab - word list to be merged
    private static void merge(ArrayList<String> vocabs, int leftBranch, int middleIndex, int rightBranch, Counter counter) {
        ArrayList<String> leftSide = new ArrayList<>(vocabs.subList(leftBranch, middleIndex + 1));
        ArrayList<String> rightSide = new ArrayList<>(vocabs.subList(middleIndex + 1, rightBranch + 1));

        // To declare 3 variables that will track the current index in the left branch, right branch, and the index at which the newly merged elements are to be placed in the list, respectively
        int i = 0, j = 0, k = leftBranch;

        // To merge left and right sublists until there are no elements left
        while (i < leftSide.size() && j < rightSide.size()) {

            // To change to lower-case and remove any non-alphanumeric chars in both branches
            String leftWord = leftSide.get(i).toLowerCase().replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
            String rightWord = rightSide.get(j).toLowerCase().replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");

            // To compare processed word on left and right branch
            if (leftWord.compareToIgnoreCase(rightWord) <= 0) {
                vocabs.set(k++, leftSide.get(i++));
            } else {
                vocabs.set(k++, rightSide.get(j++));
            }

            counter.incrementComparisons();
            counter.incrementMoves();
        }

        // To be performed when there are elements left in the left branch
        while (i < leftSide.size()) {
            vocabs.set(k++, leftSide.get(i++));
            counter.incrementMoves();
        }

        // To be performed when there are elements left in the right branch
        while (j < rightSide.size()) {
            vocabs.set(k++, rightSide.get(j++));
            counter.incrementMoves();
        }
    }
}
