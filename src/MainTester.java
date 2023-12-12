import java.util.List;

/**
 * Lead Author(s):
 * 
 * @author Jasmine Pulido
 * 
 *         References:
 * 
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving. Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         https://www.geeksforgeeks.org/creating-frames-using-swings-java/
 *         https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/FlowLayoutDemoProject/src/layout/FlowLayoutDemo.java
 * 
 *         Version/date: 12/15
 * 
 *         Responsibilities of class: tester class to test the search action.
 *         one test for each entry type
 * 
 */

public class MainTester {

	/**
	 * Purpose: "searches" for a result based on the author for book type
	 * 
	 * @param String author
	 */
	private static void searchBooksByAuthor(String author) {
		System.out.println("Searching for books by author: " + author);
		List<Entries> results = Book.searchByAuthor(Catalog.getInstance().getEntires(), author);
		displaySearchResults(results);
	}

	/**
	 * Purpose: "searches" for result based on the title for audiobook type
	 * 
	 * @param String title
	 */
	private static void searchAudiobooksByTitle(String title) {
		System.out.println("Searching for audiobooks by title: " + title);
		List<Entries> results = Audiobook.searchByTitle(Catalog.getInstance().getEntires(), title);
		displaySearchResults(results);
	}

	/**
	 * Purpose: "searches" for result based on the date for article type
	 * 
	 * @param String date
	 */
	private static void searchResearchArticlesByDate(String date) {
		System.out.println("Searching for research articles by date: " + date);
		List<Entries> results = ResearchArticle.searchByDate(Catalog.getInstance().getEntires(), date);
		displaySearchResults(results);
	}

	/**
	 * Purpose: displays the results that have been saved to the list "entries"
	 * 
	 * @param a list of entries named results
	 */
	private static void displaySearchResults(List<Entries> results) {
		System.out.println("Search Results:");
		for (Entries entry : results) {
			System.out.println(entry.getDetails());
		}
		System.out.println("------------------------------");
	}

	// main//

	public static void main(String[] args) {
		// creates a library catalog
		Catalog catalog = Catalog.getInstance();

		// makes some items to the catalog for testing
		Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 224);
		Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Classics", 336);
		Audiobook audiobook1 = new Audiobook("The Great Gatsby", "F. Scott Fitzgerald", 540);
		ResearchArticle researchArticle1 = new ResearchArticle("Machine Learning Advances", "2022-01-15");

		// adds items to the catalog
		catalog.addToCatalog(book1);
		catalog.addToCatalog(book2);
		catalog.addToCatalog(audiobook1);
		catalog.addToCatalog(researchArticle1);

		// perform searches using methods defined above
		searchBooksByAuthor("J.D. Salinger");
		searchAudiobooksByTitle("The Great Gatsby");
		searchResearchArticlesByDate("2022-01-15");

		// new CatalogView();

	}
}
