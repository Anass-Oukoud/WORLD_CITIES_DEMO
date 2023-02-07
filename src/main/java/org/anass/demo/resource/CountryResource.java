package org.anass.demo.resource;

import org.anass.demo.entity.Country;
import org.anass.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/country")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Country>> allCountry() {
        List<Country> countries = countryRepository.findAll();
        return ResponseEntity.status(201).body(countries);
    }

    @GetMapping("/all-A")
    public List<Country> allCountryA() {
        return countryRepository.findAll();
    }
}
