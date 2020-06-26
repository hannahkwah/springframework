package collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Library {

	private List<Object> bookList;
	private Set<Object> bookSet;
	private Map<Object, Object> bookMap;
	private Properties bookProperties;
	
	public List<Object> getBookList() {
		return bookList;
	}
	public void setBookList(List<Object> bookList) {
		this.bookList = bookList;
	}
	public Set<Object> getBookSet() {
		return bookSet;
	}
	public void setBookSet(Set<Object> bookSet) {
		this.bookSet = bookSet;
	}
	public Map<Object, Object> getBookMap() {
		return bookMap;
	}
	public void setBookMap(Map<Object, Object> bookMap) {
		this.bookMap = bookMap;
	}
	public Properties getBookProperties() {
		return bookProperties;
	}
	public void setBookProperties(Properties bookProperties) {
		this.bookProperties = bookProperties;
	}
	
	@Override
	public String toString() {
		return bookList + " " + bookSet + " " + bookMap + " " + bookProperties;
	}
}
