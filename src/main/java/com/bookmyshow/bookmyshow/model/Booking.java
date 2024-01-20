package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    private BookingStatus status;
    private List<ShowSeat> showSeats;
    private int amount;
    List<Payment> payments;

}
