package finki.ukim.mk.lab_emt.services;

import finki.ukim.mk.lab_emt.model.Author;
import finki.ukim.mk.lab_emt.model.Book;
import finki.ukim.mk.lab_emt.model.dto.BookDto;
import finki.ukim.mk.lab_emt.model.enumerations.BookCategory;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> create(String name, BookCategory bookCategory, Long authorId, int availableCopies);
    Optional<Book> create(BookDto bookDto);
    Optional<Book> update(Long id, String name, BookCategory bookCategory, Long authorId, int availableCopies);
    Optional<Book> update(Long id, BookDto bookDto);
    void deleteById(Long id);
    void notAvailable(Long id);
}
