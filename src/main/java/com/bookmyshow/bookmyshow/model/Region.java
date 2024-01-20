package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "region")
@Getter
@Setter
public class Region extends BaseModel {
    /*
    Region     Theatre
    1             N
    1             1
    1:N cardinality
     */
    @OneToMany
    List<Theatre> theatres;

    private String name;

}
