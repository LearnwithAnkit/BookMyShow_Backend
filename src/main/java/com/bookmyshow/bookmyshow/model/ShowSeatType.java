package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeatType extends BaseModel{
    /*
    ShowSeatType     Show
    1                 N
    N                 1
    N:N cardinality
    ShowSeat
   1|GOLD|100
   1|SILVER|200
   2|GOLD|300
     */
    @ManyToOne
    private Show show;
    private String seatType;
    private int price;

}
