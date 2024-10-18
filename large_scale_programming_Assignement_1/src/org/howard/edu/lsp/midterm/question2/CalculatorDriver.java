package org.howard.edu.lsp.midterm.question2;

public class CalculatorDriver {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(5, 10)); // 15 
        System.out.println(Calculator.sum(3.5, 7.8)); //11.3 
        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5})); // 15 
    }
}
