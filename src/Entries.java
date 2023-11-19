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
 *         https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
 * 
 *         Version/date: 11/18
 * 
 *         Responsibilities of class: this is the abstract class that all items
 *         will inherit from (Catalog). Each item in the catalog is an entry in
 *         the ssoystem: They are all the same type and we can count how many
 *         entries are in the system
 * 
 * 
 * 
 * 
 */
public abstract class Entries {

	private static int totalEntries = 0;
	private String type;

	public Entries(String newType) {
		this.type = newType;
		totalEntries++;
	}

	
	/**
	 * Purpose: gets the total number of entries in our system
	 * 
	 * @return the total int items (entries)
	 * 
	 */
	public static int getTotalEntries() {
		return totalEntries;
	}
	
	public String getType() {
		return type;
	}
	
	public abstract void updateCount();

}
