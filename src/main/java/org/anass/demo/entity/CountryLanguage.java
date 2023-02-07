package org.anass.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.anass.demo.entity.id.CountryLanguageId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "countrylanguage")
@IdClass(CountryLanguageId.class)
public class CountryLanguage {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "CountryCode")
    private String countryCode;
    //    @Column(name = )
    @Id
    private String language;
    private Boolean isOfficial;
    private Float percentage;

}
