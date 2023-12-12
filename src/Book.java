import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Lead Author(s):
 * 
 * @author Jasmine Pulido
 * 
 * 
 * 
 *         References: Morelli, R., & Walde, R. (2016). Java, Java, Java:
 *         Object-Oriented Problem Solving. Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * 
 *         Version/date: 12/15
 * 
 *         Responsibilities of class: Inherits from the entries class and
 *         implements the requestable interface
 * 
 *         Book has an author, genre, and number of pages
 * 
 * 
 */

public class Book extends Entries implements Requestable {

	// field variables
	private String title;
	private String author;
	private String genre;
	private int numberOfPages;

	/**
	 * Purpose: book constructor
	 * 
	 * @param no param constuctor
	 */
	public Book() {
		super("Book");
	}

	/**
	 * Purpose: book param constructor
	 * 
	 * @param author
	 * @param genre
	 * @param numberOfPages
	 * 
	 */
	public Book(String title, String author, String genre, int numberOfPages) {
		super("Book");
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.numberOfPages = numberOfPages;

	}

	// implementing requestable interface

	/**
	 * Purpose: creates a new request based on details given
	 * 
	 * @param Map <String, String> called details
	 * @return a boolean confirming if the add/request is complete
	 * 
	 */
	@Override
	public boolean newRequest(Map<String, String> details) {
		Catalog catalog = Catalog.getInstance();

		String title = details.get("title");
		String author = details.get("author");
		String genre = details.get("genre");
		int numberOfPages = Integer.parseInt(details.get("numberOfPages"));

		Book newBook = new Book(title, author, genre, numberOfPages);

		catalog.addToCatalog(newBook);

		return true;
	}

	/**
	 * Purpose: sets new details to a request
	 * 
	 * @param Map <String, String> called details
	 * 
	 */
	@Override
	public void setDetails(Map<String, String> details) {
		if (details.containsKey("title")) {
			this.title = details.get("title");
		}

		if (details.containsKey("author")) {
			this.author = details.get("author");
		}

		if (details.containsKey("genre")) {
			this.genre = details.get("genre");
		}

		if (details.containsKey("numberOfPages")) {
			try {
				this.numberOfPages = Integer.parseInt(details.get("numberOfPages"));
			} catch (NumberFormatException e) {
				System.err.println("Invalid number of pages format: " + details.get("numberOfPages"));
			}
		}
	}

	/**
	 * Purpose: gets the details of a request in a specific format
	 * 
	 * @return a formated String of the details
	 */
	@Override
	public String getFormattedRequestDetails() {
		StringBuilder formattedDetails = new StringBuilder();

		formattedDetails.append("Book Details:\n");
		formattedDetails.append("Title: ").append(title).append("\n");
		formattedDetails.append("Author: ").append(author).append("\n");
		formattedDetails.append("Genre: ").append(genre).append("\n");
		formattedDetails.append("Page Number: ").append(numberOfPages).append("\n");

		return formattedDetails.toString();
	}

	// getters//

	/**
	 * Purpose: gets the author of the book
	 * 
	 * @return String author
	 */
	public String getAuthor() {
		return this.author;
	}

	/**
	 * Purpose: gets the title of the book
	 * 
	 * @return String title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Purpose: gets the genre of the book
	 * 
	 * @return String genre
	 */
	public String getGenre() {
		return this.genre;
	}

	/**
	 * Purpose: gets page number of book
	 * 
	 * @return Int page number
	 */
	public int getPageNumber() {
		return this.numberOfPages;
	}

	// search methods//

	/**
	 * Purpose: searches through books (list of entrires, using the author)
	 * 
	 * @param List<Entries> entries
	 * @param String        author
	 * 
	 * @return list of entries (the results) associated with author given
	 * 
	 */
	public static List<Entries> searchByAuthor(List<Entries> entries, String author) {
		// creates a list to store the results to
		List<Entries> results = new ArrayList<>();
		// go through each entry of the provided list
		for (Entries entry : entries) {
			// check if the entry is an instance of the book class
			if (entry instanceof Book) {
				// if it is a book, cast it to a book object
				Book book = (Book) entry;

				// check if author of the book matches what we put in
				if (book.getAuthor().equalsIgnoreCase(author)) {
					// if it is a match, add the entry to the results list
					results.add(entry);
				}
			}
		}
		return results;
	}

	/**
	 * Purpose: creates formatted results of the search
	 * 
	 * @return formatted String of details
	 * 
	 */
	@Override
	public String getDetails() {
		StringBuilder formattedDetails = new StringBuilder();

		formattedDetails.append("Book Details:\n");
		formattedDetails.append("Title: ").append(title).append("\n");
		formattedDetails.append("Author: ").append(author).append("\n");
		formattedDetails.append("Genre: ").append(genre).append("\n");
		formattedDetails.append("Page Number: ").append(numberOfPages).append("\n");

		return formattedDetails.toString();
	}

}
