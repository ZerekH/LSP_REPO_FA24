/**
*  Name: Zerek Henderson
*/

package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.io.File; // import for reading files
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		HashMap<String, Integer> WordsHash = new HashMap<String, Integer>(); // create hashmap
		
		//String filePath = "/Users/zerekhenderson/git/LSP_REPO_FA24/large_scale_programming_Assignement_1/src/org/howard/edu/lsp/assignment2/words.text";
		String filePath = "src/org/howard/edu/lsp/assignment2/words.text";


		try {
		File file = new File(filePath); // create file object
		
		Scanner scanner = new Scanner(file); // reads file
		
		while (scanner.hasNextLine()) {
            
            String line = scanner.nextLine(); // reads line
            
            line = line.toLowerCase(); // switch letters to lowercase
            
            String[] words = line.split("[^a-z]+"); // split with regex
            
            for (String word : words) {
            	if (!word.isEmpty() && word.length() > 3) {
            		WordsHash.put(word, WordsHash.getOrDefault(word, 0) + 1); //getordefault func checks if word in hash if it is increment by 1
            	}
            }
		}
        scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
		System.out.println(WordsHash);
	}
}
/**
* create empty hashmap with words and Integers
* read file
* iterate over every word *figure out how to separate them
* convert words using .toLowerCase() method
* if word in keySet(keys), hashmap.get(word) +1
* else hashmap.put("word", 1)
* print hashmap
*/