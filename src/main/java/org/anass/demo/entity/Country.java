package org.anass.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.security.PrivateKey;

@Getter
@Setter
@ToString
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;
    private String name;
    private String continent;
    private String region;
    @Column(name = "SurfaceArea")
    private Float surfaceArea;
    @Column(name = "IndepYear")
    private Short indepYear;
    private Integer population;
    @Column(name = "LifeExpectancy")
    private Float lifeExpectancy;
    @Column(name = "GNP")
    private Float gNp;
    @Column(name = "GNPOld")
    private Float gNpOld;
    @Column(name = "LocalName")
    private String localeName;
    @Column(name = "GovernmentForm")
    private String gouvernementForme;
    private String headOfState;
    private Integer capital;
    private String code2;

}
