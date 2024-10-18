package org.howard.edu.lsp.midterm.question1;

public class Book {
    private String title; // title of the book
    private String author; // author of the book
    private String ISBN; // ISBN number of the book
    private int yearPublished; //year book was published
    
    /**
     * Constructor for the Book class.
     * @param title         title of the book
     * @param author        author of the book
     * @param ISBN          ISBN number of the book
     * @param yearPublished year book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    //Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true; // check if both references point to the same object
        if (!(obj instanceof Book)) return false; //check if the object is Book
        Book other = (Book) obj; // check if have same author and ISBN
        return this.ISBN.equals(other.ISBN) && this.author.equals(other.author);
    }

    /**
     * Returns a string representation of the Book object.
     * Returns A string that represents the Book
     */

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}

/** package org.howard.edu.lsp.midterm.question2;
https://www.geeksforgeeks.org/what-is-javadoc-tool-and-how-to-use-it/ -What is java docs
**/