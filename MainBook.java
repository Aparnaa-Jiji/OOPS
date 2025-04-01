import java.util.Scanner;

// Base class Book
class Book {
    String title;
    String author;
    double price;

    // Constructor to initialize Book details
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display method to show common book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Publisher class inherits from Book
class Publisher extends Book {
    String publisherName;
    String publisherAddress;

    // Constructor to initialize Publisher details
    Publisher(String title, String author, double price, String publisherName, String publisherAddress) {
        super(title, author, price); // Call to the parent class (Book) constructor
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
    }

    // Display method to show publisher details
    void displayPublisherDetails() {
        display();  // Display common book details
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher Address: " + publisherAddress);
    }
}

// Literature class inherits from Book
class Literature extends Book {
    String genre;
    String language;

    // Constructor to initialize Literature book details
    Literature(String title, String author, double price, String genre, String language) {
        super(title, author, price); // Call to the parent class (Book) constructor
        this.genre = genre;
        this.language = language;
    }

    // Display method to show Literature book details
    void displayLiteratureDetails() {
        display();  // Display common book details
        System.out.println("Genre: " + genre);
        System.out.println("Language: " + language);
    }
}

// Fiction class inherits from Book
class Fiction extends Book {
    String fictionType;
    boolean isBestSeller;

    // Constructor to initialize Fiction book details
    Fiction(String title, String author, double price, String fictionType, boolean isBestSeller) {
        super(title, author, price); // Call to the parent class (Book) constructor
        this.fictionType = fictionType;
        this.isBestSeller = isBestSeller;
    }

    // Display method to show Fiction book details
    void displayFictionDetails() {
        display();  // Display common book details
        System.out.println("Fiction Type: " + fictionType);
        System.out.println("Best Seller: " + (isBestSeller ? "Yes" : "No"));
    }
}

// Main class to interact with the user
public class MainBook {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Read the category of the book (Literature or Fiction)
        System.out.print("Enter book category (Literature/Fiction): ");
        String category = scanner.nextLine().trim().toLowerCase();

        // Declare a Book reference
        Book book = null;

        // Read common details of the book
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left by nextDouble()

        if (category.equals("literature")) {
            // Read literature-specific details
            System.out.print("Enter genre of literature: ");
            String genre = scanner.nextLine();

            System.out.print("Enter language of literature: ");
            String language = scanner.nextLine();

            // Create Literature book object
            book = new Literature(title, author, price, genre, language);
        } else if (category.equals("fiction")) {
            // Read fiction-specific details
            System.out.print("Enter fiction type (e.g., Mystery, Fantasy, etc.): ");
            String fictionType = scanner.nextLine();

            System.out.print("Is it a bestseller? (true/false): ");
            boolean isBestSeller = scanner.nextBoolean();
            scanner.nextLine();  // Consume newline

            // Create Fiction book object
            book = new Fiction(title, author, price, fictionType, isBestSeller);
        }

        // Display the details of the book based on its category
        if (book != null) {
            if (book instanceof Literature) {
                ((Literature) book).displayLiteratureDetails();
            } else if (book instanceof Fiction) {
                ((Fiction) book).displayFictionDetails();
            }
        } else {
            System.out.println("Invalid category entered!");
        }

        // Close the scanner object
        scanner.close();
    }
}
