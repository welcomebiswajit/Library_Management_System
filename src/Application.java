/**
 * Created By Biswajit Laha
 */
import java.util.Arrays;

import library.LibraryImpl;
import model.Book;
/**
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryImpl libraryImpl = new LibraryImpl();
		
		System.out.println("List of All Books Initially");
		libraryImpl.listAllBooks().forEach(System.out::println);
		
		System.out.printf("\n");
		libraryImpl.addBook(new Book(".NET","Robert","978-05","Technical","2024","Engineering",true));
		
		System.out.printf("\n");
		libraryImpl.removeBook("978-00");
		
		System.out.printf("\n");
		libraryImpl.findBookByTitle(".NET").forEach(System.out::println);
		
		System.out.printf("\n\n");
		libraryImpl.findBookByAuthor("Kitty").forEach(System.out::println);
		
		System.out.printf("\n\n");
		System.out.println("List of All Books");
		libraryImpl.listAllBooks().forEach(System.out::println);
		
		System.out.printf("\n\n");
		System.out.println("List of Available Books");
		libraryImpl.listAvailableBooks().forEach(System.out::println);
	}

}
