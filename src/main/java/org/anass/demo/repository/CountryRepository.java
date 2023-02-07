package org.anass.demo.repository;

import org.anass.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    public Optional<Country> findByName(String name);
}
