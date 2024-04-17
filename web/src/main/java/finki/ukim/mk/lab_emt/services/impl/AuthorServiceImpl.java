package finki.ukim.mk.lab_emt.services.impl;

import finki.ukim.mk.lab_emt.model.Author;
import finki.ukim.mk.lab_emt.model.Country;
import finki.ukim.mk.lab_emt.model.exceptions.AuthorNotFoundException;
import finki.ukim.mk.lab_emt.repository.AuthorRepository;
import finki.ukim.mk.lab_emt.services.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(Long id) {
        return this.authorRepository.findById(id);
    }

    @Override
    public Optional<Author> create(String name, String surname, Country country) {
        Author author = new Author(name, surname, country);
        this.authorRepository.save(author);
        return Optional.of(author);
    }

    @Override
    public Optional<Author> update(Long id, String name, String surname, Country country) {
        Author author = findById(id).orElseThrow(() -> new AuthorNotFoundException(id));

        author.setName(name);
        author.setSurname(surname);
        author.setCountry(country);
        this.authorRepository.save(author);

        return Optional.of(author);
    }

    @Override
    public void deleteById(Long id) {
        this.authorRepository.deleteById(id);
    }
}
