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
 * 
 *         Version/date: 11/18
 * 
 *         Responsibilities of class: This class inherits from the research database
 *         class.
 * 
 *         Research article has a topic and date published
 * 
 * 
 */

public class ResearchArticle extends Entries implements Requestable {
	private List<ResearchArticle> articles;

	private String topic;
	private String datePublished;
	private String type = "Research Article";


	/**
	 * Purpose: ArrayList book constructor
	 * 
	 * @param no param constuctor
	 */
	public ResearchArticle(String type) {
		super("Research Article");
	}


	/**
	 * Purpose: ArrayList book param constructor
	 * 
	 * @param narrator
	 * @param title
	 * @param audio length
	 * 
	 */
	public ResearchArticle(String type, String topic, String datePublished) {
		super("Research Article");
		this.topic = topic;
		this.datePublished = datePublished;
	}
	
	public void updateCount() {
		System.out.println("Updating Research Article count.");
	}
	
	@Override
	public boolean newRequest(Map<String, String> details) {
		Catalog catalog = Catalog.getInstance();
		
		String topic = details.get("topic");
		String publicationDate = details.get("publicationDate");
		
		ResearchArticle newArticle = new ResearchArticle(type, topic, publicationDate);
		
		catalog.addToCatalog(newArticle);
		
		return true;
	}


	@Override
	public void setDetails(Map<String, String> details) {
		if (details.containsKey("title")) {
			this.topic = details.get("topic");
		}

		if (details.containsKey("narrator")) {
			this.datePublished = details.get("datePublished");
		}
		
	}


	@Override
	public String getFormattedRequestDetails() {
		StringBuilder formattedDetails = new StringBuilder();
		
		formattedDetails.append("Research Article Details:\n");
		formattedDetails.append("Topic: ").append(topic).append("\n");
		formattedDetails.append("Date Published: ").append(datePublished).append("\n");
		
		return formattedDetails.toString();
	}

}
