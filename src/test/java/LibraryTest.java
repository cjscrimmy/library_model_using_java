import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;

    @Before
    public void setUp(){
        library = new Library(2);
        book1 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy");
        book2 = new Book("The House at Pooh Corner", "A.A. Milne", "Children");
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, library.getCapacity());
    }
}
