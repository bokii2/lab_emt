package finki.ukim.mk.lab_emt.model.dto;


import finki.ukim.mk.lab_emt.model.Author;
import finki.ukim.mk.lab_emt.model.enumerations.BookCategory;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class BookDto {
    private String name;
    private BookCategory bookCategory;
    private Long authorId;
    private int availableCopies;

    public BookDto() {
    }

    public BookDto(String name, BookCategory bookCategory, Long authorId, int availableCopies) {
        this.name = name;
        this.bookCategory = bookCategory;
        this.authorId = authorId;
        this.availableCopies = availableCopies;
    }
}
