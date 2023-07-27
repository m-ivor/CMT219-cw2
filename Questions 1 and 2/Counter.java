public class Counter {
    // To declare two variables, the number of comparisons and moves, respectively
    private long noComparisons;
    private long noMoves;

    // To declare constructor that is to be called when a new Counter object is created
    public Counter() {
        noComparisons = 0;
        noMoves = 0;
    }

    // To increase the comparisons count by 1
    public void incrementComparisons() {
        noComparisons++;
    }
    
    // To increase the moves count by 1
    public void incrementMoves() {
        noMoves++;
    }

    // To obtain the number of comparisons made
    public long getComparisons() {
        return noComparisons;
    }

    // To obtain the number of moves made
    public long getMoves() {
        return noMoves;
    }

    // To reset the counts for number of comparisons and moves made to zero
    public void reset() {
        noComparisons = 0;
        noMoves = 0;
    }
}