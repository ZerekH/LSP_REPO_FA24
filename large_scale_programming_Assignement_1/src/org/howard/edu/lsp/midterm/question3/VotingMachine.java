package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * The VotingMachine class implements a simplified voting machine.
 */
public class VotingMachine {
    private Map<String, Integer> candidates; // Map to hold candidates and their vote counts, because number of candidates is unknown

    /**
     * Constructor for the VotingMachine class.
     */
    public VotingMachine() {
        candidates = new HashMap<>(); // init the map, key = candidate, value = # of votes
    }
    
    /**
     * Casts a vote for a candidate.
     * @param name The name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); //Increment the vote count
        }
    }
    /**
     * Adds a candidate to the voting machine.
     * @param name The name of the candidate
     */
    public void addCandidate(String name) {
        candidates.put(name, 0); //candidate with initial votes set to 0
    }


    /**
     * Returns a string representation of the voting results.
     * @return A string listing each candidate and their respective vote count
     */

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}
