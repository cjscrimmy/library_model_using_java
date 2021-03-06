import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void setUp(){
        book = new Book("Alice in Wonderland", "Lewis Carroll", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Alice in Wonderland", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Lewis Carroll", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }


}
