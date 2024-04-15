package finki.ukim.mk.lab_emt.listeners;


import finki.ukim.mk.lab_emt.model.events.BookNotAvailable;
import finki.ukim.mk.lab_emt.services.BookService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BookEventHandlers {
    private final BookService bookService;

    public BookEventHandlers(BookService bookService) {
        this.bookService = bookService;
    }

    @EventListener
    public void onBookNotAvailable(BookNotAvailable event){
        this.bookService.notAvailable(event.getTimestamp());
    }
}
