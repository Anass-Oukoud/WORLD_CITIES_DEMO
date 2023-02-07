package org.anass.demo.repository;

import org.anass.demo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends JpaRepository<City, String> {

//    public List<City> findByName(String name);
//    @Query("SELECT nm FROM City WHERE nm.CountryCode >=CountryCode")
//    public List<City> ListItemWithPriceOver(@Param("CountryCode") String countryCode);
}
