package SmallTownXLibraries;

public class Book {

	//methods go here
	
		String bookTitle;
		boolean borrowed;
		
		//Creates a new Book
		public Book(String bookTitle) {
			//Implement this method
			this.bookTitle = bookTitle;
		}
		
		//Marks the books as rented
		public void borrowed() {
			borrowed = true;
		}
		
		//Marks book as not rented
		public void returned() {
			borrowed = false;
		}
		
		//Returns true if the book is rented, false otherwise
		public boolean isBorrowed() {
			return borrowed;
		}
		
		//Returns the title of the book
		public String getTittle() {
			return bookTitle;
		}
		
		public void rented() {
			borrowed = true;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//small test of the book class
			Book example = new Book("The Da Vinci Code");
			System.out.println("Tittle (should be The Da Vinci Code): " + example.getTittle());
			System.out.println("Borrowed? (should be false): " + example.isBorrowed());
			example.rented();
			System.out.println("Borrowed? (should be false): " + example.isBorrowed());
			example.returned();
			System.out.println("Borrowed? (should be false): " + example.isBorrowed());

		}
	
	
}
