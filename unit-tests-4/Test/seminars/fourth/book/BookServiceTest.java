package seminars.fourth.book;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    @Test
    void testBookServiceByID() {
        Book book = new Book("1", "Book1", "Author1");
        InMemoryBookRepository repository = mock(InMemoryBookRepository.class);
        BookService service = new BookService(repository);
        when(service.findBookById(anyString())).thenReturn(book);

        service.findBookById("1");
        assertThat(service.findBookById("1")).isEqualTo(book);
    }

    @Test
    void testBookServiceAll() {
        Book book = new Book("1", "Book1", "Author1");
        InMemoryBookRepository repository = mock(InMemoryBookRepository.class);
        BookService service = new BookService(repository);
        when(repository.findAll()).thenReturn(new ArrayList());
        ArrayList result = (ArrayList) repository.findAll();

        verify(service.findAllBooks(), times(1));
    }

    Book book = new Book("1", "Книга", "Блок");

    @Test
    void testBook() {
        assertThat(book instanceof Book);
    }

    @Test
    void testBookId() {
        assertThat(book.getId()).isEqualTo("1");
    }

    @Test
    void testBookAuthor() {
        assertThat(book.getAuthor()).isEqualTo("Блок");
    }

    @Test
    void testBookTitle(){
        assertThat(book.getTitle()).isEqualTo("Книга");
    }

}