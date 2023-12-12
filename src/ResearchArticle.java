
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
 * 
 *         Version/date: 12/15
 * 
 *         Responsibilities of class: This class inherits from the entires and
 *         uses the requestable interface
 * 
 *         Research article has a topic and date published
 * 
 * 
 */

public class ResearchArticle extends Entries implements Requestable {

	// field variables
	private String topic;
	private String datePublished;

	/**
	 * Purpose: research article constructor
	 * 
	 * @param no param constuctor
	 */
	public ResearchArticle() {
		super("Research Article");
	}

	/**
	 * Purpose: research article param constructor
	 * 
	 * @param String topic
	 * @param String datePublished
	 * 
	 */
	public ResearchArticle(String topic, String datePublished) {
		super("Research Article");
		this.topic = topic;
		this.datePublished = datePublished;
	}

	/**
	 * Purpose: creates a new "request" given the article traits and adds it to the
	 * catalog
	 * 
	 * 
	 * @param details (topic, date published)
	 * 
	 */
	@Override
	public boolean newRequest(Map<String, String> details) {
		Catalog catalog = Catalog.getInstance();

		String topic = details.get("topic");
		String publicationDate = details.get("publicationDate");

		ResearchArticle newArticle = new ResearchArticle(topic, publicationDate);

		catalog.addToCatalog(newArticle);

		return true;
	}

	/**
	 * Purpose: sets new details to a request
	 * 
	 * @param Map <String, String> called details
	 * 
	 */
	@Override
	public void setDetails(Map<String, String> details) {
		if (details.containsKey("topic")) {
			this.topic = details.get("topic");
		}

		if (details.containsKey("datePublished")) {
			this.datePublished = details.get("datePublished");
		}

	}

	/**
	 * Purpose: gets the details of a request in a specific format
	 * 
	 * @return a formated String of the details
	 * 
	 */
	@Override
	public String getFormattedRequestDetails() {
		StringBuilder formattedDetails = new StringBuilder();

		formattedDetails.append("Research Article Details:\n");
		formattedDetails.append("Topic: ").append(topic).append("\n");
		formattedDetails.append("Date Published: ").append(datePublished).append("\n");

		return formattedDetails.toString();
	}

	// getters//

	/**
	 * Purpose: gets the date published
	 * 
	 * @return String datePublished
	 * 
	 */
	public String getDatePublished() {
		return this.datePublished;
	}

	// search methods//

	/**
	 * Purpose: searches through research articles (list of entrires, using the date
	 * published)
	 * 
	 * @param List<Entries> entries
	 * @param String        datePublished
	 * 
	 * @return list of entries (the results) associated with date given
	 * 
	 */
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

	/**
	 * Purpose: creates formatted results of the search
	 * 
	 * @return formatted String of details
	 * 
	 */
	@Override
	public String getDetails() {
		StringBuilder formattedDetails = new StringBuilder();

		formattedDetails.append("Research Article Details:\n");
		formattedDetails.append("Topic: ").append(topic).append("\n");
		formattedDetails.append("Date Published: ").append(datePublished).append("\n");

		return formattedDetails.toString();
	}

}
