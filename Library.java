package SmallTownXLibraries;

//import java.util.Arrays;

public class Library {
	private String libraryAddress;
	private Book[] books = new Book[100];
	private int bookCounter = 0;
	
	
	//methods go here
	public Library(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	
	public void addBook(Book bookTitle) {
		books[bookCounter] = bookTitle;
		bookCounter++;
	}
	
	public void printAddress() {
		System.out.println(libraryAddress);
		
	}
	
	//check if book is not borrowed else borrow book
	public void borrowBook(String bookTitle) {
		boolean stop = false;
		for(int i = 0; i < bookCounter; i++) {
			if(books[i].getTittle().equals(bookTitle)) {
				if(books[i].isBorrowed()) {
					System.out.println("This book is already borrowed");
					stop = true;
					break;
				}
				else{
					books[i].borrowed();
					System.out.println("You have successfully borrowed this book");
					stop = true;
					break;
				}
			}
		}
		if( stop == false) {
		System.out.println("This library doesn't offer this book");
		}
	}
	
	public static void printOpeningHours() {
		System.out.println("9AM - 5PM");
	}
	
	public void printAvailableBooks() {
		if(bookCounter == 0) {
			System.out.println("There are no books in this library");
		}
		for(int i = 0; i < bookCounter; i++) {
			if(!books[i].isBorrowed()) {
				System.out.println(books[i].getTittle());
			}
		}
	}
	
	public void returnBook(String bookTitle) {
		boolean stop = false;
		for (int i= 0; i < bookCounter; i++) {
			if(books[i].getTittle().equals(bookTitle)) {
				if(books[i].isBorrowed()) {
					books[i].returned();
					System.out.println("You have successfully returned the book: " + bookTitle);
					stop = true;
				}
			}

		}
		if (stop == false) {
			System.out.println("The book: " + bookTitle + " was not borrowed");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		
		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		
		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		
		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();
	
		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
		
		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		
		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks(); 					
	}
}
