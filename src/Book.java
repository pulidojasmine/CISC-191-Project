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
 *         Responsibilities of class: This class inherits from the catalog
 *         class.
 * 
 *         Book has an author, genre, and number of pages
 * 
 * 
 */

public class Book extends Catalog implements Requestable {

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
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.numberOfPages = numberOfPages;
	}
	
	
	//setters
	
    public void setAuthor(String newAuthor) {
    	this.author = newAuthor;
    }
    
    public void setTitle(String newTitle) {
    	this.title = newTitle;
    }
	
    public void setGenre(String newGenre) {
    	this.genre = newGenre;
    }
    
    public void setNumberOfPages(int newPageNumber) {
    	this.numberOfPages = newPageNumber;
    }
    
    //getters
    
    public String getAuthor() {
		return author;
    }
    
    public String getTitle() {
    	return title;
    }

    public String getGenre() {
    	return genre;
    }
    
    public int getNumberOfPages() {
    	return numberOfPages;
    }
    
    //implementing requestable interface
    
    @Override
    public boolean newRequest(Map<String, String> details) {
    	Catalog catalog = getInstance();
    	
    	String title = details.get("title");
    	String author = details.get("author");
    	String genre = details.get("genre");
    	int numberOfPages = Integer.parseInt(details.get("numberOfPages"));
    	
    	Book newBook = new Book(title, author, genre, numberOfPages);
    	
    	catalog.addBook(newBook);
    	
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
		// TODO Auto-generated method stub
		return null;
	}
    

}
