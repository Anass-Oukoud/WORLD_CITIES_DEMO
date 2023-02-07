package org.anass.demo.resource;

import org.anass.demo.entity.Country;
import org.anass.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping
    public Country create(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @GetMapping(path = "/one/{code}")
    public Optional<Country> findOne(@PathVariable(name = "code") String code) {
        return countryRepository.findById(code);
    }

    @GetMapping(path = "/by-name")
    public Optional<Country> findByName(@RequestParam(name = "name") String name) {
        return countryRepository.findByName(name);
    }

}
