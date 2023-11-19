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
 *         Version/date: 11/18
 * 
 *         Responsibilities of class: This is the other main parent class called
 *         "catalog". Think of it like the library building where all the
 *         different types of books and media is stored.
 * 
 * 			Catalog extends entries. 
 * 
 *         A catalog has: entries (books, research articles, and audiobooks)
 * 
 */

public class Catalog {
	
	private List<Entries> entries;
	private static Catalog instance;
	private int totalEntries;

	public Catalog() {
		entries = new ArrayList<>();
		totalEntries = 0;
	}
	
	public static Catalog getInstance() {
		if (instance == null ) {
			instance = new Catalog();
		}
		return instance;
	}
	
	/**
	 * Purpose: 
	 * 
	 */
	public void addToCatalog(Entries entry) {
		entries.add(entry);
		totalEntries++;
	}
	
	public void removeFromCatalog(Entries entry) {
		entries.remove(entry);
		totalEntries--;
	}
	
	public List<Entries> getEntires() {
		return entries;
	}
	

	
}
