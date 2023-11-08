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
 * Responsibilities of class: This class inherits from the catalog class and will be the parent class to the research article class. 
 * 
 * The reasearch database has: reasearch articles
 * 
 */

public class ResearchDatabase implements Requestable {
	
	private ArrayList<Requestable> ResearchDatabase = new ArrayList<>();

	/**
	 * Purpose: constructor
	 * 
	 * @param narrator
	 * 
	 */
	public ResearchDatabase(ResearchArticle article) {

	}
	
	 public int getNumberOfEntries() {
	    	if (ResearchDatabase.size() == 0) {
				return 0;
			}
	    	return ResearchDatabase.size();
	    }
	
	
}
