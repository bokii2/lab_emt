package finki.ukim.mk.lab_emt.model;

import finki.ukim.mk.lab_emt.model.enumerations.BookCategory;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private BookCategory bookCategory;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Author author;
    private int availableCopies;

    public Book() {
    }

    public Book(String name, BookCategory bookCategory, Author author, int availableCopies) {
        this.name = name;
        this.bookCategory = bookCategory;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
