package finki.ukim.mk.lab_emt.config;

import finki.ukim.mk.lab_emt.model.Author;
import finki.ukim.mk.lab_emt.model.Book;
import finki.ukim.mk.lab_emt.model.Country;
import finki.ukim.mk.lab_emt.model.enumerations.BookCategory;
import finki.ukim.mk.lab_emt.repository.AuthorRepository;
import finki.ukim.mk.lab_emt.repository.BookRepository;
import finki.ukim.mk.lab_emt.repository.CountryRepository;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class Initializer {
    private final AuthorRepository authorRepository;
    private final CountryRepository countryRepository;
    private final BookRepository bookRepository;

    public Initializer(AuthorRepository authorRepository, CountryRepository countryRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.countryRepository = countryRepository;
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void init(){
        Country country = new Country("Macedonia" ,"Europe");
        Country country1 = new Country("Mexico" ,"North America");
        Country country2 = new Country("India" ,"Asia");
        Country country3 = new Country("Senegal", "Africa");
        Country country4 = new Country("Brazil", "South America");
        this.countryRepository.save(country);
        this.countryRepository.save(country1);
        this.countryRepository.save(country2);
        this.countryRepository.save(country3);
        this.countryRepository.save(country4);

        Author author = new Author("Stale", "Popov", country);
        Author author1 = new Author("Juan", "Rulfo", country1);
        Author author2 = new Author("Arundhati", "Roy", country2);
        Author author3 = new Author("Mariama", "Ba", country3);
        Author author4 = new Author("Jorge", "Amado", country4);
        authorRepository.save(author);
        authorRepository.save(author1);
        authorRepository.save(author2);
        authorRepository.save(author3);
        authorRepository.save(author4);

        Book book = new Book("Kalesh Angja", BookCategory.NOVEL, author, 13);
        Book book1 = new Book("Pedro Paramo", BookCategory.NOVEL, author1, 10);
        Book book2 = new Book("Power Politics", BookCategory.HISTORY, author2, 16);
        Book book3 = new Book("So Long a Letter", BookCategory.BIOGRAPHY, author3, 23);
        Book book4 = new Book("The Violent Land", BookCategory.FANTASY, author4, 5);
        bookRepository.save(book);
        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);
        bookRepository.save(book4);
    }
}
