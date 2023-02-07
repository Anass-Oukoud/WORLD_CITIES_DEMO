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
//    private boolean continent;
    private String region;
//    @Column(name = "SurfaceArea")
//    private Float surfaceArea;
//    private short indepYear;
//    private int population;
//    private float lifeExpectancy;
//    private float gNp;
//    private float gNpOld;
//    private String localeName;
//    private String gouvernementForme;
//    private String headOfState;
//    private int capital;
//    private String code2;

}
