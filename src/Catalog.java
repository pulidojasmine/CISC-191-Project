import java.util.ArrayList;
import java.util.List;

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
 *         Responsibilities of class: This is the other main class called
 *         "catalog". Think of it like the library building where all the
 *         different types of books and media is stored.
 * 
 * 
 *         A catalog has: entries (books, research articles, and audiobooks):
 *         object aggregation
 * 
 */

public class Catalog {

	// field variables
	private List<Entries> entries;
	private static Catalog instance;
	private static int totalEntries;

	/**
	 * Purpose: catalog constructor a catalog has entries
	 * 
	 * @param no param constuctor
	 */
	public Catalog() {
		entries = new ArrayList<>();
		setTotalEntries(0);
	}

	/**
	 * Purpose: creates instances of the catalog aka "new" catalog
	 * 
	 */
	public static Catalog getInstance() {
		if (instance == null) {
			instance = new Catalog();
		}
		return instance;
	}

	/**
	 * Purpose: adds an entry to the catalog, updates the number of entries
	 * 
	 * @param Entry type called "entry"
	 */
	public void addToCatalog(Entries entry) {
		entries.add(entry);
		setTotalEntries(getTotalEntries() + 1);
	}

	/**
	 * Purpose: removes an entry from the catalog, updates number of entries
	 * 
	 * @param Entry type called "entry"
	 */
	public void removeFromCatalog(Entries entry) {
		entries.remove(entry);
		setTotalEntries(getTotalEntries() - 1);
	}

	/**
	 * Purpose: get entries
	 * 
	 * @return a list with of those entries
	 */
	public List<Entries> getEntires() {
		return entries;
	}

	/**
	 * Purpose: get entries
	 * 
	 * @return the number of entries
	 */
	public static int getTotalEntries() {
		return totalEntries;
	}

	/**
	 * Purpose: set total number of entries to another value
	 * 
	 * @param Int totalEntries, updated number that you want to be set
	 */
	public static void setTotalEntries(int totalEntries) {
		Catalog.totalEntries = totalEntries;
	}

}
