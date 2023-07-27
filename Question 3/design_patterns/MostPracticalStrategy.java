public class MostPracticalStrategy implements ScoringStrategy {
 	// Complete an implementation of getScore(Product a) which returns a score for Product a,
    // such that higher scores are given to products with higher practicality 
    public int getScore(Product a)
    {
        // To assign higher scores to products with higher practicality values, and lower scores to ones with lower practicality values
        return a.practicality;
    }
}

