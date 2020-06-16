import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        library = new Library(2);
        book1 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        book2 = new Book("The House at Pooh Corner", "A.A. Milne", "Children");
        book3 = new Book("Discworld", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void noBooksInLibrary(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }
}
