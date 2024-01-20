package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "theatre")
@Getter
@Setter
public class Theatre extends BaseModel{
    private String name;
    List<Screen> screens;

}
