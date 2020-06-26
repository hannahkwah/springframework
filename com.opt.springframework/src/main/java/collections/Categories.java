package collections;

public class Categories {
	
	private String bookGenres;
	private String title;
	
	public void setBookGenres(String bookGenres) {
		this.bookGenres = bookGenres;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBookGenres() {
		return bookGenres;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return bookGenres + " " + title;
	}

}
