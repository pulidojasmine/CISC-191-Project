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
 *         Responsibilities of class: This class inherits from the research database
 *         class.
 * 
 *         Research article has a topic and date published
 * 
 * 
 */

public class ResearchArticle implements Requestable {
	private String topic;
	private String datePublished;

	/**
	 * Purpose: ArrayList book constructor
	 * 
	 * @param no param constuctor
	 */
	public ResearchArticle() {
	}


	/**
	 * Purpose: ArrayList book param constructor
	 * 
	 * @param narrator
	 * @param title
	 * @param audio length
	 * 
	 */
	public ResearchArticle(String topic, String datePublished) {
		this.topic = topic;
		this.datePublished = datePublished;
	}
	
	
	//setters
	
    public void setTopic(String newTopic) {
    	this.topic = newTopic;
    }
    
    public void setDatePublished(String newDatePublished) {
    	this.datePublished = newDatePublished;
    }
    
    //getters
    
    public String getTopic() {
		return topic;
    }
    
    public String getDatePublished() {
    	return datePublished;
    }
//    
//    public int getNumberOfEntries() {
//    	if (ResearchArticles.size() == 0) {
//			return 0;
//		}
//    	return ResearchArticles.size();
//    }

}
