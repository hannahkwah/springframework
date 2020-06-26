package collections;

public class Book {

	private String author;
	private Integer year;
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Integer getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return author + " " + year;
	}
	
}
