package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "seat")
@Getter
@Setter
public class Seat extends BaseModel{
    private int number;
    private String seatType;
    private int rowNo;
    private int colNo;
}
