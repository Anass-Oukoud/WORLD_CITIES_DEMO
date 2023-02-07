package org.anass.demo.repository;

import org.anass.demo.entity.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, String> {

    List<CountryLanguage> findByIsOfficial(boolean isOfficial);
}
