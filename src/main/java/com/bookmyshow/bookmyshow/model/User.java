package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseModel{
    private String name;
    private String emailId;
    private String phoneNo;
    private List<Booking> bookings;
}
