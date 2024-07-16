/**
 * Created By Biswajit Laha
 */
package unitTest;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import library.LibraryImpl;
import model.Book;

/**
 * LibraryImplTest - Test driven development of Library class
 */

public class LibraryImplTest {
	
	@InjectMocks 
	LibraryImpl libraryImpl;
	
	@InjectMocks
	Book book;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test 
	public void testAddBook() {
		Book testBook = new Book("Advanced Java","Kitty","978-10","Technical","2024","Engineering",true);
		Integer count  = libraryImpl.addBook(testBook);
		assertTrue(1==count);
	}
	
	@Test 
	public void testAddBookWithDuplicateISBN() {
		Book testBook = new Book("Java","Kitty","978-00","Technical","2024","Engineering",true);
		Integer count  = libraryImpl.addBook(testBook);
		assertTrue(0==count);
	}
	
	@Test 
	public void testAddBookWithoutISBN() {
		Integer count  = libraryImpl.addBook(book);
		assertTrue(0==count);
	}
	
	@Test 
	public void testfindBookByTitle() {
		assertTrue(libraryImpl.findBookByTitle("Java").size()>0);
	}
	
	@Test 
	public void testlistAllBooks() {
		assertTrue(libraryImpl.listAllBooks().size()>0);
	}
	
	@Test 
	public void testlistAvailableBooks(){
		assertTrue(libraryImpl.listAvailableBooks().size()>0);
	}
}
