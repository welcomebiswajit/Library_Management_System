/**
 * Created By Biswajit Laha
 */
package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Book;

/**
 * LibraryImpl - Manage a collection of books in multiple departments
 */
public class LibraryImpl {
	List<Book> books=null;
	
	public LibraryImpl() {
		books = new ArrayList<Book>();
		books.add(new Book("Java","Kitty","978-00","Technical","2024","Engineering",true));
		books.add(new Book("C++","Kitty","978-01","Technical","2024","Engineering",true));
		books.add(new Book("Python","Stevenson","978-03","Technical","2024","Engineering",true));
	}
	
	/**
	 * addBook(Book book) - Adds a book to the library's Departments collection (check for duplicates based on ISBN)
	 * @param book
	 * @return
	 */
	public Integer addBook(Book book) {
		Optional isbnOptional = Optional.ofNullable(book.getIsbn());
		Long count=0L;
		if(isbnOptional.isPresent())
			 count = books.stream().filter(n-> n.getIsbn().equals(isbnOptional.get())).collect(Collectors.counting());
		else {
			System.out.println("ISBN of the book is not given");
			return 0;
		}	
		
		if(count==0L) {
			books.add(book);
			System.out.println(book.getTitle()+" Book has been added");
			return 1;
		}	
		
		System.out.println("Duplicate Book exists by the same ISBN");
		return 0;
	}
	
	
	/**
	 * removeBook(String ISBN) - Removes a book by ISBN
	 * @param ISBN
	 */
	public void removeBook(String ISBN) {
		Optional isbnOptional = Optional.ofNullable(ISBN);
		if(isbnOptional.isPresent()) {
			books.removeIf(n-> n.getIsbn().equalsIgnoreCase(isbnOptional.get().toString()));
			System.out.println("Books with ISBN "+isbnOptional.get().toString()+" has been removed");
		}
		else {
			System.out.println("Books with ISBN "+isbnOptional.get().toString()+" could not be removed");
		}
	}
	
	/**
	 * findBookByTitle(String title) - Returns a list of books matching the title (caseinsensitive search)
	 * @param title
	 * @return
	 */
	public List<Book> findBookByTitle(String title) {
		Optional titleOptional = Optional.ofNullable(title);
		List<Book> titleList = null;
		
		if(titleOptional.isPresent()) {
			titleList = books.stream().filter(n-> n.getTitle().equalsIgnoreCase(titleOptional.get().toString())).collect(Collectors.toList());
		    System.out.println("List of Books matched by Title "+titleOptional.get().toString());
		    return titleList;
		}
		
		System.out.println("List of Books could not be matched by the given Title "+titleOptional.get().toString());
		return titleList;
	}
	
	/**
	 * findBookByAuthor(String author) - Returns a list of books by the author (caseinsensitive search)
	 * @param author
	 * @return
	 */
	public List<Book> findBookByAuthor(String author) {
		Optional authorOptional = Optional.ofNullable(author);
		List<Book> authorList = null;
		
		if(authorOptional.isPresent()) {
			authorList = books.stream().filter(n-> n.getAuthor().equalsIgnoreCase(authorOptional.get().toString())).collect(Collectors.toList());
		    System.out.println("List of Books matched by Author Name "+authorOptional.get().toString());
		    return authorList;
		}
		
		System.out.println("List of Books could not be matched by the given Author Name "+authorOptional.get().toString());
		return authorList;
	}
	
	/**
	 * listAllBooks() - Returns a list of all books in the library
	 * @return
	 */
	public List<Book> listAllBooks(){
		return books;
	}
	
	/**
	 * listAvailableBooks() - Returns a list of available books
	 * @return
	 */
	public List<Book> listAvailableBooks(){
		List<Book> availableBookList = null;
		availableBookList = books.stream().filter(n-> n.getAvailablity()==true).collect(Collectors.toList());
		return availableBookList;
	}

}
