import javax.swing.JFrame; 
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

/**
 * Lead Author(s):
 * @author Jasmine Pulido
 * 
 * References:
 * 
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * https://www.geeksforgeeks.org/creating-frames-using-swings-java/ 
 * https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/FlowLayoutDemoProject/src/layout/FlowLayoutDemo.java
 * 
 * Version/date: 12/1
 * 
 * Responsibilities of class: the actual frame and formatting of the GUI for the catalog
 * 
 */


public class CatalogView extends JFrame {
	
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


	
	
	public CatalogView() {
		super("Catalog View");
		
		final int WINDOW_WIDTH = 550;
		final int WINDOW_HEIGHT = 400;
		
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		createSearchBar();
		createSearchResults();
		createFilters();
		createBottomPanel();
		
		add(mainPanel); 
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void createSearchBar() {
		JPanel searchBarPanel = new JPanel(new BorderLayout());
		
		searchField = new JTextField();
		searchButton = new JButton("Search");
		
		searchBarPanel.add(searchField, BorderLayout.CENTER);
		searchBarPanel.add(searchButton, BorderLayout.EAST);
		
        mainPanel.add(searchBarPanel, BorderLayout.NORTH);

		
	}
	
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
	
	private void createSearchResults() {
        searchResults = new JList<>(new String[]{"Result 1", "Result 2", "Result 3"});

        JScrollPane scrollPane = new JScrollPane(searchResults);
        
        mainPanel.add(scrollPane, BorderLayout.CENTER);
    }
	
	private void createBottomPanel() {
		JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		requestAddButton = new JButton ("Request a New Entry");
		editEntryButton = new JButton("Edit an Existing Entry");
		
		bottomPanel.add(requestAddButton);
		bottomPanel.add(editEntryButton);
		
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
	}
	
	public String getTextFromField() {
		return searchField.getText();
	}
	
	
	  /**
	    * Main method to quickly check what the view looks like
	    * @param args
	    */
	   public static void main(String[] args)
	   {
	      new CatalogView();
	   }
}
