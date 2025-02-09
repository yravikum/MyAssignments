package week2.day1;

public class Library {

	// Defining a method addBook(String bookTitle) with one input argument & return
	// the book Title
	public String addBook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;

	}

	// Defining a method issueBook()
	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}

	public static void main(String[] args) {

		// Creating an object for the Library class in the main method:

		Library bookOptions = new Library();
		

		// calling addBook method inside main method

		System.out.println(bookOptions.addBook("Harry Potter"));
		

		// callling issueBook method inside main method

		bookOptions.issueBook();

	}

}
