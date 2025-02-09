package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {

		// Creating an object for the Library class in the main method of LibraryManagement
		Library bookOptions = new Library();

		// Calling addBook method of the Library class into LibraryManagement
		System.out.println(bookOptions.addBook("I too had a Love Story"));

		// Calling issueBook method of the Library class into LibraryManagement
		bookOptions.issueBook();

	}

}
