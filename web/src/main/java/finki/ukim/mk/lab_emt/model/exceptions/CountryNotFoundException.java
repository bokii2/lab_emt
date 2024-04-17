package finki.ukim.mk.lab_emt.model.exceptions;

public class CountryNotFoundException extends RuntimeException{
    public CountryNotFoundException(Long id) {
        super(String.format("Country with id: %id is not found", id));
    }
}
