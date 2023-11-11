import java.util.ArrayList;
import java.util.List;

public abstract class Entries {
		
	
	protected List<Entries> entries;
	protected static int totalEntries = 0;
	
	
	public Entries() {
		this.entries = new ArrayList<>();
	}
	
	public abstract void addEntry(Entries entry);
	
	public static int getTotalEntries() {
		return totalEntries;
	}
	
}
