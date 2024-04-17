package finki.ukim.mk.lab_emt.model.exceptions;

public class AuthorNotFoundException extends RuntimeException{
    public AuthorNotFoundException(Long id) {
        super(String.format("Author with id: %id is not found", id));
    }
}
