/**
 * Created By Biswajit Laha
 */
package model;

/**
 * Book - model class that contains various attributes of a book
 */
public class Book {
	private String title;
	private String author;
	private String isbn;
	private String genre;
	private String publication_year;
	private String departments;
	private Boolean availablity;
	
	public Book(String title,
				String author, 
				String isbn, 
				String genre, 
				String publication_year, 
				String departments,
				Boolean availablity) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.publication_year = publication_year;
		this.departments = departments;
		this.availablity = availablity;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(String publication_year) {
		this.publication_year = publication_year;
	}
	public String getDepartments() {
		return departments;
	}
	public void setDepartments(String departments) {
		this.departments = departments;
	}
	public Boolean getAvailablity() {
		return availablity;
	}
	public void setAvailablity(Boolean availablity) {
		this.availablity = availablity;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", genre=" + genre
				+ ", publication_year=" + publication_year + ", departments=" + departments + ", availablity="
				+ availablity + "]";
	}

}
