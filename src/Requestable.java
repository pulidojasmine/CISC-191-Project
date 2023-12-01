import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Lead Author(s):
 * 
 * @author Jasmine Pulido
 * 
 * 
 * 
 *         References: 
 *         https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
 *         https://www.w3schools.com/java/java_hashmap.asp
 * 
 * 
 *         Version/date: 12/1
 * 
 *         Responsibilities of class: This an interface that all the subclasses will implement. 
 *         It will add new entries to the catalog, and set new details to that entry (depending on the type of item).
 *         It also contains a toString, that will write out the item entry
 * 
 * 
 */

public interface Requestable {

	/**
	 * Purpose: makes a new request of an item to be added to the catalog
	 * 
	 * @param map with the details of the item
	 * @return true if it works, false if no
	 */
	boolean newRequest(Map<String, String> details);
	
	/**
	 * Purpose: set the details before making the actual request
	 * 
	 * @param details of item
	 * 
	 */
	void setDetails(Map<String, String> details);

	/**
	 * Purpose: writes the request details to a file
	 * 
	 * @param name of the file to write to
	 * 
	 */
	default void writeRequest(String fileName) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
			writer.write("Request details: " + getFormattedRequestDetails());
		} catch (IOException e) {
			e.printStackTrace();		
		}
	}
	
	/**
	 * Purpose: gets a string of the request details
	 * 
	 * @return formatted string
	 * 
	 */
	String getFormattedRequestDetails();

}
