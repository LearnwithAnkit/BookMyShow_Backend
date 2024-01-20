package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity(name = "screen")
@Getter
@Setter
public class Screen extends BaseModel{
    private String name;
    List<Seat> seats;
    List<Feature> features;

}
