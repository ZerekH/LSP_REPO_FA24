package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks"); //adds candidate
        vm.addCandidate("Hogan"); //adds candidate
        vm.castVote("Alsobrooks"); // votes for candidate

        System.out.println(vm.toString()); // give results
    }
}
