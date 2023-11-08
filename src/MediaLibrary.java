import java.util.ArrayList;
/**
 * Lead Author(s):
 * @author Jasmine Pulido
 * 
 
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *  
 * Version/date: 10/27
 * 
 * Responsibilities of class: This class inherits from the catalog class and will be the parent class to the audiobook class. 
 * 
 * The media library has: audiobooks
 * 
 */

public class MediaLibrary extends Catalog {
	
	private ArrayList<Requestable> MediaLibrary = new ArrayList<>();
	
	
	public MediaLibrary(Audiobook audiobook) {

	}
	
	//not sure where I'm going with this atm
	
    public int getNumberOfEntries() {
    	if (MediaLibrary.size() == 0) {
			return 0;
		}
    	return MediaLibrary.size();
    }
}
