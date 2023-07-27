public class LeastExpensiveStrategy implements ScoringStrategy {
 	// Complete an implementation of getScore(Product a) which returns a score for Product a,
    // such that higher scores are given to products with LOWER costs 
    public int getScore(Product a)
    {
        // To assign higher scores to products with lower costs (making them positive) and lower scores to ones with higher costs (making them negative)
        return -a.cost;
    }
}