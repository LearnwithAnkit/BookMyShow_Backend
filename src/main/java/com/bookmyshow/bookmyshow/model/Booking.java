package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
    //to handle cancellation ,it will be n:n
    @OneToMany
    private List<ShowSeat> showSeats;
    private int amount;
    @OneToMany
    List<Payment> payments;

}
