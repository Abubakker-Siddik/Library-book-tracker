public class Book {
    // Encapsulation: private variables (Best Practice)
    private String title;
    private String author;
    private int pages;
    private boolean isCheckedOut;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isCheckedOut = false; // Default status
    }

    // Business Logic Method 1: Borrow functionality
    public void borrowBook() {
        if (this.isCheckedOut) {
            System.out.println("Error: The book '" + this.title + "' is already borrowed.");
        } else {
            this.isCheckedOut = true;
            System.out.println("Success: You have borrowed '" + this.title + "'.");
        }
    }

    // Business Logic Method 2: Return functionality
    public void returnBook() {
        if (this.isCheckedOut) {
            this.isCheckedOut = false;
            System.out.println("Success: You have returned '" + this.title + "'.");
        } else {
            System.out.println("Info: This book was not borrowed.");
        }
    }

    // Method to display details
    public void displayDetails() {
        String status = isCheckedOut ? "Borrowed" : "Available";
        System.out.println("Book: " + title + " | Author: " + author + " | Status: " + status);
    }
}
