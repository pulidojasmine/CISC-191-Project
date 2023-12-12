import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;

/**
 * Lead Author(s):
 * 
 * @author Jasmine Pulido
 * 
 *         References:
 * 
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving. Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         https://www.geeksforgeeks.org/creating-frames-using-swings-java/
 *         https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/FlowLayoutDemoProject/src/layout/FlowLayoutDemo.java
 * 
 *         Version/date: 12/15
 * 
 *         Responsibilities of class: the actual frame and formatting of the GUI
 *         for the catalog
 * 
 */

@SuppressWarnings("serial")

public class CatalogView extends JFrame {

	// making the field variables - buttons, labels, etc
	private JPanel mainPanel;
	private JTextField searchField;
	private JButton searchButton;
	private JList<String> searchResults;
	private JLabel filtersLabel;
	private JButton audiobookButton;
	private JButton bookButton;
	private JButton articleButton;
	private JButton requestAddButton;
	private JButton editEntryButton;

	/**
	 * Purpose: CatalogView constructor (my panel maker)
	 * 
	 */
	public CatalogView() {
		super("Catalog View");

		// setting the window dimensions
		final int WINDOW_WIDTH = 550;
		final int WINDOW_HEIGHT = 400;

		mainPanel = new JPanel(new BorderLayout());
		mainPanel.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));

		// adds our main components onto the big/main panel
		createSearchBar();
		createSearchResults();
		createFilters();
		createBottomPanel();

		add(mainPanel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);

		// registers our action listeners
		registerSearchAction();
		registerFilterActions();
		registerRequestEditActions();
	}

	// smaller panels//

	/**
	 * Purpose: creates the search bar panel, which has a text field and a search
	 * button
	 * 
	 */
	private void createSearchBar() {
		JPanel searchBarPanel = new JPanel(new BorderLayout());

		searchField = new JTextField();
		searchButton = new JButton("Search");

		searchBarPanel.add(searchField, BorderLayout.CENTER);
		searchBarPanel.add(searchButton, BorderLayout.EAST);

		mainPanel.add(searchBarPanel, BorderLayout.NORTH);
	}

	/**
	 * Purpose: creates the search filters panel, which has a button for each filter
	 * filter options: audiobook, book, and article
	 * 
	 */
	private void createFilters() {
		JPanel filtersPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

		filtersLabel = new JLabel("Filter your search: ");
		audiobookButton = new JButton("Media Library");
		bookButton = new JButton("Books");
		articleButton = new JButton("Research Article Database");

		filtersPanel.add(filtersLabel);
		filtersPanel.add(audiobookButton);
		filtersPanel.add(bookButton);
		filtersPanel.add(articleButton);

		mainPanel.add(filtersPanel, BorderLayout.WEST);
	}

	/**
	 * Purpose: creates the search results panel, which actually gives the results
	 * on a scrolpane
	 * 
	 */
	private void createSearchResults() {
		searchResults = new JList<>(new String[] { "Result 1", "Result 2", "Result 3" });

		JScrollPane scrollPane = new JScrollPane(searchResults);

		mainPanel.add(scrollPane, BorderLayout.CENTER);
	}

	/**
	 * Purpose: creates the bottom panel, which has the two requestable buttons:
	 * add/edit
	 * 
	 */
	private void createBottomPanel() {
		JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		requestAddButton = new JButton("Request a New Entry");
		editEntryButton = new JButton("Edit an Existing Entry");

		bottomPanel.add(requestAddButton);
		bottomPanel.add(editEntryButton);

		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
	}

	/**
	 * Purpose: will retrieve whatever is typed into the text field
	 * 
	 * @return a String of whatever is typed in the field
	 */
	public String getTextFromField() {
		return searchField.getText();
	}

	// registering event handlers for buttons//

	/**
	 * Purpose: registers the "search" action, which has to do with the search
	 * button & field
	 * 
	 */
	private void registerSearchAction() {
		searchButton.addActionListener(new CatalogListener.SearchAction(searchField));
	}

	/**
	 * Purpose: registers the filter actions, for each of the three buttons
	 * 
	 */
	private void registerFilterActions() {
		audiobookButton.addActionListener(new CatalogListener.FilterAction("Audiobook"));
		bookButton.addActionListener(new CatalogListener.FilterAction("Book"));
		articleButton.addActionListener(new CatalogListener.FilterAction("Research Article"));
	}

	/**
	 * Purpose: registers the requestable actions - the buttons
	 * 
	 */
	private void registerRequestEditActions() {
		requestAddButton.addActionListener(new CatalogListener.RequestAddButton());
		editEntryButton.addActionListener(new CatalogListener.EditEntryButton());
	}

}
