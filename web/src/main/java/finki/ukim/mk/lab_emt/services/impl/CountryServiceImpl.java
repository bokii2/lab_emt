package finki.ukim.mk.lab_emt.services.impl;

import finki.ukim.mk.lab_emt.model.Country;
import finki.ukim.mk.lab_emt.model.exceptions.CountryNotFoundException;
import finki.ukim.mk.lab_emt.repository.CountryRepository;
import finki.ukim.mk.lab_emt.services.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return this.countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return this.countryRepository.findById(id);
    }

    @Override
    public Optional<Country> create(String name, String continent) {
        Country country = new Country(name, continent);
        this.countryRepository.save(country);
        return Optional.of(country);
    }

    @Override
    public Optional<Country> update(Long id, String name, String continent) {
        Country country = this.countryRepository.findById(id).orElseThrow(() -> new CountryNotFoundException(id));
        country.setName(name);
        country.setContinent(continent);
        this.countryRepository.save(country);
        return Optional.of(country);
    }

    @Override
    public void deleteById(Long id) {
        this.countryRepository.deleteById(id);
    }
}
