import java.util.ArrayList;
import java.util.List;

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
 *         Responsibilities of class: This is the main parent class called
 *         "catalog". Think of it like the library building where all the
 *         different types of books and media is stored.
 * 
 *         This class will not contain much itself - although it is not an
 *         abstract class.
 * 
 *         A catalog has:
 * 
 */

public class Catalog extends Entries {
	private List<Book> books;
	private List<ResearchArticle> articles;
	private List<Audiobook> audiobooks;
	
	private static Catalog instance;

	public Catalog() {
		this.books = new ArrayList<>();

	}
	
	public static Catalog getInstance() {
		if (instance == null ) {
			instance = new Catalog();
		}
		return instance;
	}

	public void addBook(Book bookToAdd) {
		books.add(bookToAdd);
	}
	
	public void addResearchArticle(ResearchArticle articleToAdd) {
		articles.add(articleToAdd);
	}
	
	public void addAudiobooks(Audiobook audiobookToAdd) {
		audiobooks.add(audiobookToAdd);
	}

	@Override
	public void addEntry(Entries entry) {
		// TODO Auto-generated method stub
		
	}
	
	
}
