package finki.ukim.mk.lab_emt.services;

import finki.ukim.mk.lab_emt.model.Author;
import finki.ukim.mk.lab_emt.model.Country;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();
    Optional<Author> findById(Long id);
    Optional<Author> create(String name, String surname, Country country);
    Optional<Author> update(Long id, String name, String surname, Country country);
    void deleteById(Long id);
}
