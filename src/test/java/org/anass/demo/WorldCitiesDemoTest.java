package org.anass.demo;

import lombok.extern.slf4j.Slf4j;
import org.anass.demo.entity.City;
import org.anass.demo.entity.Country;
import org.anass.demo.entity.CountryLanguage;
import org.anass.demo.repository.CityRepository;
import org.anass.demo.repository.CountryLanguageRepository;
import org.anass.demo.repository.CountryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
@SpringBootTest
class WorldCitiesDemoTest {

    @Autowired
    CountryRepository countryRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CountryLanguageRepository countryLanguageRepository;

    @Test
    void startup() {
    }

    @Test
    void country_findAll() {
        List<Country> allCountry = countryRepository.findAll();
        System.out.println("size of country is : " + allCountry.size());
        System.out.println(allCountry);
    }

    @Test
    void country_findOne_ok() {
        Optional<Country> countryOptional = countryRepository.findById("ABW");
        assertTrue(countryOptional.isPresent());
    }

    @Test
    void country_findOne_ko() {
        Optional<Country> countryOptional = countryRepository.findById("AAAA");
        assertFalse(countryOptional.isPresent());
    }

    @Test
    void countryLanguage_IsOfficial_ok() {
        List<CountryLanguage> allLanguage = countryLanguageRepository.findAll();
        System.out.println("All Languages are : " + allLanguage.size());
        System.out.println(allLanguage);
    }

    @Test
    void countryLanguage_findOne_ok() {
        List<CountryLanguage> byIsOfficial = countryLanguageRepository.findByIsOfficial(true);
        assertFalse(byIsOfficial.isEmpty());
        log.info("{}", byIsOfficial);

    }

    @Test
    void countryLanguage_findOne_ko() {
        List<CountryLanguage> byIsOfficial = countryLanguageRepository.findByIsOfficial(false);
        assertTrue(byIsOfficial.isEmpty());
        log.info("{}", byIsOfficial);
    }

    @Test
    void city_findAll() {
        List<City> allCity = cityRepository.findAll();
        System.out.println("number of cyties is: " + allCity.size());
        System.out.println(allCity);

    }
}