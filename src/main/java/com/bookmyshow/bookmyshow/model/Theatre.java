package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "theatre")
@Getter
@Setter
public class Theatre extends BaseModel{
    private String name;
    /*
    Theatre     Screen
    1             N
    1             1
    1:N cardinality
     */
    @OneToMany
    List<Screen> screens;

}
