Please open the "Questions 1 and 2" as a workspace folder and run MainClass.java file for solutions to Questions 1 and 2. 


Question 1:

Extracting words from a text document is the first step for many text-basedapplications of artificial intelligence, e.g., detecting abusive tweets on Twitter. Thistask asks you to write a Java program to extract all valid words from the document“Input219.txt” based on a given vocabulary “google-10000-english-no-swears.txt1” (you can download both files from the Learning Central). Specifically,if a word token from “Input219.txt” matches a word in “google-10000-english-no-swears.txt” (case-insensitively), you keep that word, otherwise, you discard it. Yourprogram should create an ArrayList containing all valid words from “Input219.txt”and print the list to the console.

You are not supposed to remove punctuation, rather you will simply read all thewords available in Input219.txt, match with words in google-10000-english-no-swears.txt1 and output the matched words in order of appearance in the input,including duplicates and attached punctuation. For example, if “for,” appears inInput219.txt and “for” appears in the vocabulary, then the result should include“for,” as an item in the ArrayList. Punctuation that is not adjacent to a spaceshould be treated as part of the word, e.g. “I’ve” should be considered a singleword and should only appear if “I’ve” appears in the vocabulary.


Question 2:

Implement the merge sort in order to sort the words obtained in question (A) into alphabetical order, i.e., the output of your program will be the sorted words in alphabetical order. For the merge sort algorithm write a method e.g. mergeSort(...), then measure: 
    1.the time that is needed to sort the first 100 words, first 200 words, first 300 words,etc. up to all words output by your program in part A. i.e. time separate calls to
    mergeSort() for 100 words, 200 words, 300 words, etc
    2. count the moves/comparisons that occur while sorting the first 100 of the words,first 200 of the words, first 300 of the words, etc. up to all words by the algorithm