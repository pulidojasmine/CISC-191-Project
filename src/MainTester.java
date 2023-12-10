import java.util.List;
	
public class MainTester {

	    private static void searchBooksByAuthor(String author) {
	        System.out.println("Searching for books by author: " + author);
	        List<Entries> results = Book.searchByAuthor(Catalog.getInstance().getEntires(), author);
	        displaySearchResults(results);
	    }

	    private static void searchAudiobooksByTitle(String title) {
	        System.out.println("Searching for audiobooks by title: " + title);
	        List<Entries> results = Audiobook.searchByTitle(Catalog.getInstance().getEntires(), title);
	        displaySearchResults(results);
	    }

	    private static void searchResearchArticlesByDate(String date) {
	        System.out.println("Searching for research articles by date: " + date);
	        List<Entries> results = ResearchArticle.searchByDate(Catalog.getInstance().getEntires(), date);
	        displaySearchResults(results);
	    }

	    private static void displaySearchResults(List<Entries> results) {
	        System.out.println("Search Results:");
	        for (Entries entry : results) {
	            System.out.println(entry.getDetails());
	        }
	        System.out.println("------------------------------");
	    }
	    
	    
	    public static void main(String[] args) {
	        // Create a library catalog
	        Catalog catalog = Catalog.getInstance();

	        // Add some items to the catalog for testing
	        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 224);
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "Classics", 336);
	        Audiobook audiobook1 = new Audiobook("The Great Gatsby", "F. Scott Fitzgerald", 540);
	        ResearchArticle researchArticle1 = new ResearchArticle("Machine Learning Advances", "2022-01-15");

	        catalog.addToCatalog(book1);
	        catalog.addToCatalog(book2);
	        catalog.addToCatalog(audiobook1);
	        catalog.addToCatalog(researchArticle1);

	        // Perform searches
	        searchBooksByAuthor("J.D. Salinger");
	        searchAudiobooksByTitle("The Great Gatsby");
	        searchResearchArticlesByDate("2022-01-15");	
	        
		    //new CatalogView();

	        
	        
	    }
}
	    



