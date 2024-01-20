package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "screen")
@Getter
@Setter
public class Screen extends BaseModel {
    /*
    Screen      Seat
    1             N
    1             1
    1:N cardinality
     */
    @OneToMany
    List<Seat> seats;
    /*
    Screen      Feature
    1             N
    N             1
    N:N cardinality
     */
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    List<Feature> features;
    private String name;

}
