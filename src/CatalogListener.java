import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CatalogListener {

	// search
	public static class SearchAction implements ActionListener {
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

	// filters

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

	public static class RequestAddButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
	        JOptionPane.showMessageDialog(null, "Request Add button clicked");

		}

	}

	public static class EditEntryButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Edit Entry button clicked");
		}
	}

}
