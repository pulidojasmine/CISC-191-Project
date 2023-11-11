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
 *         Version/date: 10/27
 * 
 *         Responsibilities of class: This class inherits from the media library
 *         class.
 * 
 *         Audiobook has an narrator and length of audio clip, also title of the
 *         book
 * 
 * 
 */

public class Audiobook extends Catalog implements Requestable {
	private String title;
	private String narrator;
	private int audioLength;

	/**
	 * Purpose: ArrayList book constructor
	 * 
	 * @param no param constuctor
	 */
	public Audiobook() {
	}

	/**
	 * Purpose: ArrayList book param constructor
	 * 
	 * @param narrator
	 * @param title
	 * @param audio    length
	 * 
	 */
	public Audiobook(String title, String narrator, int audioLength) {
		this.title = title;
		this.narrator = narrator;
		this.audioLength = audioLength;
	}

	// setters

	public void setNarrator(String newNarrator) {
		this.narrator = newNarrator;
	}

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public void setAudioLength(int newAudioLength) {
		this.audioLength = newAudioLength;
	}

	@Override
	public boolean newRequest(Map<String, String> details) {
		Catalog catalog = getInstance();

		String title = details.get("title");
		String narrator = details.get("narrator");
		int audioLength = Integer.parseInt(details.get("audioLength"));

		Audiobook newAudiobook = new Audiobook(title, narrator, audioLength);

		catalog.addAudiobooks(newAudiobook);
		
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

}
