import java.util.ArrayList;

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
 *         Audiobook has an narrator and length of audio clip, also title of the book
 * 
 * 
 */

public class Audiobook implements Requestable {
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
	 * @param audio length
	 * 
	 */
	public Audiobook(String title, String narrator, int audioLength) {
		this.title = title;
		this.narrator = narrator;
		this.audioLength = audioLength;
	}
	
	
	//setters
	
    public void setNarrator(String newNarrator) {
    	this.narrator = newNarrator;
    }
    
    public void setTitle(String newTitle) {
    	this.title = newTitle;
    }

    public void setAudioLength(int newAudioLength) {
    	this.audioLength = newAudioLength;
    }
    
    //getters
    
    public String getNarrator() {
		return narrator;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public int getAudioLength() {
    	return audioLength;
    }
    
    //unsure if I want this here or in the entires class

//	public ArrayList<MediaLibrary> getAudiobooks() {
//		return Audiobooks;
//	}
//
//
//	public void setAudiobooks(ArrayList<MediaLibrary> audiobooks) {
//		Audiobooks = audiobooks;
//	}
    
}
