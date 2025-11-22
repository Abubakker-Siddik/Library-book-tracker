public class Main {
    public static void main(String[] args) {
        // Creating Book objects
        // Since both files are in the same folder, Main can see Book automatically!
        Book b1 = new Book("Java Mastery", "Sundar Pichai", 250);
        Book b2 = new Book("Programming Tactics", "Mark Munroe", 200);

        // Simulating Library Operations
        b1.displayDetails();
        b2.displayDetails();

        System.out.println("\n--- Attempting to borrow 'Java Mastery' ---");
        b1.borrowBook();  // Action method
        
        System.out.println("\n--- Updated Details ---");
        b1.displayDetails(); // Shows it is now checked out
        
        System.out.println("\n--- Attempting to borrow 'Java Mastery' again ---");
        b1.borrowBook(); // Should show error that it is already borrowed
    }
}
