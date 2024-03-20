package finki.ukim.mk.lab_emt.model.exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(Long id) {
        super(String.format("Book with id: %id is not found", id));
    }
}
