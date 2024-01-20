package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "region")
@Getter
@Setter
public class Region extends BaseModel{
    private String name;
    List<Theatre> theatres;

}
