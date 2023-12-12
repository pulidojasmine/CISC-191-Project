
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
 *         Version/date: 12/15
 * 
 *         Responsibilities of class: main parent class. each item is an entry,
 *         and the catalog takes in entries
 * 
 * 
 * 
 */
public abstract class Entries {

	// field variables
	private static int totalEntries = 0;
	private String type;

	/**
	 * Purpose: Entries param constructor
	 * 
	 * @param String type of entry
	 * 
	 */
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

	/**
	 * Purpose: gets the entry type
	 * 
	 * @return String type of entry
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Purpose: an abstract method of the formatted details implemented in the child
	 * classes
	 * 
	 * @return String of formatted details of an entry
	 * 
	 */
	public abstract String getDetails();

}
