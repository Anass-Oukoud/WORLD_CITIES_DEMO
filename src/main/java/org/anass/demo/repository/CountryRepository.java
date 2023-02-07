package org.anass.demo.repository;

import org.anass.demo.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
//    public List<Country> findByName(String name);
}
