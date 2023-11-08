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
 *         Responsibilities of class: This class inherits from the catalog
 *         class.
 * 
 *         Book has an author, genre, and number of pages
 * 
 * 
 */

public class Book extends Catalog {

	private ArrayList<Book> books = new ArrayList<>();
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
    
    public int getNumberOfEntries() {
    	if (books.size() == 0) {
			return 0;
		}
    	return books.size();
    }
}
