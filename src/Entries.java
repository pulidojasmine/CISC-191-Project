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
 *         Version/date: 12/1
 * 
 *         Responsibilities of class: 
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
	
	public class CatalogSearch {

	    public static List<Entries> searchByAuthor(List<Entries> entries, String author) {
	        List<Entries> results = new ArrayList<>();
	        for (Entries entry : entries) {
	            if (entry instanceof Book) {
	                Book book = (Book) entry;
	                if (book.getAuthor().equalsIgnoreCase(author)) {
	                    results.add(entry);
	                }
	            }
	        }
	        return results;
	    }

	    public static List<Entries> searchByTitle(List<Entries> entries, String title) {
	        List<Entries> results = new ArrayList<>();
	        for (Entries entry : entries) {
	            if (entry instanceof Audiobook) {
	                Audiobook audiobook = (Audiobook) entry;
	                if (audiobook.getTitle().equalsIgnoreCase(title)) {
	                    results.add(entry);
	                }
	            }
	        }
	        return results;
	    }

	    public static List<Entries> searchByDate(List<Entries> entries, String date) {
	        List<Entries> results = new ArrayList<>();
	        for (Entries entry : entries) {
	            if (entry instanceof ResearchArticle) {
	                ResearchArticle article = (ResearchArticle) entry;
	                if (article.getDatePublished().equalsIgnoreCase(date)) {
	                    results.add(entry);
	                }
	            }
	        }
	        return results;
	    }
	}

	public abstract String getDetails();
	

}
