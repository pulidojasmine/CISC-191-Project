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
 *         Version/date: 12/1
 * 
 *         Responsibilities of class: This class inherits from the catalog
 *         class.
 * 
 *         Book has an author, genre, and number of pages
 * 
 * 
 */

public class Book extends Entries implements Requestable {
	
	private String title;
	private String author;
	private String genre;
	private int numberOfPages;


	/**
	 * Purpose: ArrayList book constructor
	 * 
	 * @param no param constuctor
	 */
	public Book() {
		super("Book");
	}


	/**
	 * Purpose: ArrayList book param constructor
	 * 
	 * @param author
	 * @param genre
	 * @param numberOfPages
	 * 
	 */
	public Book(String title, String author, String genre, int numberOfPages) {
		super("Book");
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.numberOfPages = numberOfPages;

	}
	
	
    //implementing requestable interface
    
    @Override
    public boolean newRequest(Map<String, String> details) {
    	Catalog catalog = Catalog.getInstance();
    	
    	String title = details.get("title");
    	String author = details.get("author");
    	String genre = details.get("genre");
    	int numberOfPages = Integer.parseInt(details.get("numberOfPages"));
    	
    	Book newBook = new Book(title, author, genre, numberOfPages);
    	
    	catalog.addToCatalog(newBook);
    	
    	return true;
    }


	@Override
	public void setDetails(Map<String, String> details) {
		if (details.containsKey("title")) {
			this.title = details.get("title");
		}

		if (details.containsKey("author")) {
			this.title = details.get("author");
		}

		if (details.containsKey("genre")) {
			this.title = details.get("genre");
		}

		if (details.containsKey("numberOfPages")) {
			try {
				this.numberOfPages = Integer.parseInt(details.get("numberOfPages"));
			} catch (NumberFormatException e) {
				System.err.println("Invalid number of pages format: " + details.get("numberOfPages"));
			}
		}		
	}


	@Override
	public String getFormattedRequestDetails() {
StringBuilder formattedDetails = new StringBuilder();
		
		formattedDetails.append("Book Details:\n");
		formattedDetails.append("Title: ").append(title).append("\n");
		formattedDetails.append("Author: ").append(author).append("\n");
		formattedDetails.append("Genre: ").append(genre).append("\n");
		formattedDetails.append("Page Number: ").append(numberOfPages).append("\n");

		
		return formattedDetails.toString();		
	}
    

}
