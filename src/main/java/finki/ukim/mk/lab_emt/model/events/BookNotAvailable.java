package finki.ukim.mk.lab_emt.model.events;

import finki.ukim.mk.lab_emt.model.Book;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

@Getter
public class BookNotAvailable extends ApplicationEvent {
    public BookNotAvailable(Book source) {
        super(source);
    }
}
