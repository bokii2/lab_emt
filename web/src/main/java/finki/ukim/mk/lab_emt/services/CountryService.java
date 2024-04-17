package finki.ukim.mk.lab_emt.services;

import finki.ukim.mk.lab_emt.model.Country;

import java.util.*;

public interface CountryService {
    List<Country> findAll();
    Optional<Country> findById(Long id);
    Optional<Country> create(String name, String continent);
    Optional<Country> update(Long id, String name, String continent);
    void deleteById(Long id);
}
