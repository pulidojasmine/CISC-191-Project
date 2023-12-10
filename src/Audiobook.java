
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
 * 		   https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
 * 
 *         Version/date: 12/1
 * 
 *         Responsibilities of class: This class inherits from the media library
 *         class.
 * 
 *         Audiobook has an narrator and length of audio clip, also title of the
 *         book
 * 
 * 
 */

public class Audiobook extends Entries implements Requestable {
	
	private String title;
	private String narrator;
	private int audioLength;


	/**
	 * Purpose: ArrayList book constructor
	 * 
	 * @param no param constuctor
	 */
	public Audiobook() {
		super("Audiobook");
	}

	/**
	 * Purpose: ArrayList book param constructor
	 * 
	 * @param narrator
	 * @param title
	 * @param audio length
	 * 
	 */
	public Audiobook(String title, String narrator, int audioLength) {
		super("Audiobook");
		this.title = title;
		this.narrator = narrator;
		this.audioLength = audioLength;
	}
	
	/**
	 * Purpose: creates a new "request" given the audiobook traits and adds it to the catalog
	 * 
	 * 
	 * @param details (title, narrator, and audio length
	 * 
	 */
	@Override
	public boolean newRequest(Map<String, String> details) {
		Catalog catalog = Catalog.getInstance();

		String title = details.get("title");
		String narrator = details.get("narrator");
		int audioLength = Integer.parseInt(details.get("audioLength"));

		Audiobook newAudiobook = new Audiobook(title, narrator, audioLength);

		catalog.addToCatalog(newAudiobook);
		
		return true;
	}

	@Override
	public void setDetails(Map<String, String> details) {
		if (details.containsKey("title")) {
			this.title = details.get("title");
		}

		if (details.containsKey("narrator")) {
			this.narrator = details.get("narrator");
		}

		if (details.containsKey("audioLength")) {
			try {
				this.audioLength = Integer.parseInt(details.get("audioLength"));
			} catch (NumberFormatException e) {
				System.err.println("Invalid length of audio format: " + Integer.parseInt(details.get("audioLength")));
			}
		}

	}

	@Override
	public String getFormattedRequestDetails() {
		StringBuilder formattedDetails = new StringBuilder();
		
		formattedDetails.append("Audiobook Details:\n");
		formattedDetails.append("Title: ").append(title).append("\n");
		formattedDetails.append("Narrator: ").append(narrator).append("\n");
		formattedDetails.append("Audio Length: ").append(audioLength).append("\n");
		
		return formattedDetails.toString();
	}

	public String getTitle() {
		return this.title;
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

	@Override
	public String getDetails() {
		StringBuilder formattedDetails = new StringBuilder();
		
		formattedDetails.append("Audiobook Details:\n");
		formattedDetails.append("Title: ").append(title).append("\n");
		formattedDetails.append("Narrator: ").append(narrator).append("\n");
		formattedDetails.append("Audio Length: ").append(audioLength).append("\n");
		
		return formattedDetails.toString();
	}

}
