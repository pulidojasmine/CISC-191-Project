import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 *         Responsibilities of class: the controller piece of MVC, makes the GUI
 *         functional
 * 
 */

public class CatalogListener {

	/**
	 * Purpose: creates an actual search action using actionlistener
	 * 
	 */
	public static class SearchAction implements ActionListener {
		// field variable
		private JTextField searchField;

		public SearchAction(JTextField searchField) {
			this.searchField = searchField;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String searchTerm = searchField.getText();
			System.out.println("Search term: " + searchTerm);
		}
	}

	/**
	 * Purpose: creates the filter search action using actionlistener
	 * 
	 */
	public static class FilterAction implements ActionListener {
		private String filterType;

		public FilterAction(String filterType) {
			this.filterType = filterType;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(filterType + " filter selected.");
		}
	}

	/**
	 * Purpose: request entries button action using actionlistener
	 * 
	 */
	public static class RequestAddButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Request Add button clicked");

		}

	}

	/**
	 * Purpose: edit entries action using actionlistener
	 * 
	 */
	public static class EditEntryButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Edit Entry button clicked");
		}
	}

}
