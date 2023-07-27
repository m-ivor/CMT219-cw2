Question 3:

This Java program creates three new products, each with a cost (measured in £) and practicality (measured on a scale from 1-5). The program then chooses between the products, first by applying the LeastExpensiveStrategy and then the MostPracticalStrategy.

    1. Complete the implementation of the LeastExpensiveStrategy class with a getScore(Product a) method that returns a suitable score for any product, such that the product with the highest score is the least expensive one. 

    2. Complete the implementation of MostPracticalStrategy with a getScore(Product a) method that returns a suitable score for any product, such that the product with the highest score is the most practical one. 

    3. Modify the getBestProduct() method in the ProductRecommender class, so that it correctly applies the ScoringStrategy passed to it, in order to generate the following output: 
        Best product according to LeastExpensiveStrategy:
        Vauxhall Nova
        Best product according to MostPracticalStrategy:
        Skoda Octavia