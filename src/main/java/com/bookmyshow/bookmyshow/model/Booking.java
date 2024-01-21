package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    @ManyToOne
    private User user;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;
    //to handle cancellation ,it will be n:n
    @OneToMany
    private List<ShowSeat> showSeats;
    private int amount;
    @OneToMany
    List<Payment> payments;

}
