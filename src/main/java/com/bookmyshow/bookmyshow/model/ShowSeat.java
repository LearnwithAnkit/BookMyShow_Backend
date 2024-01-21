package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel {
    /*
    ShowSeat     Show
    1             1
    N             1
    N:1 cardinality
    ShowSeat
   1|A1|100
   1|A2|200
   2|A1|300
     */
    @ManyToOne
    private Show show;
    /*
   ShowSeat     Seat
   1             1
   N             1
   N:1 cardinality

   ShowSeat
   1|A1|100
   1|A2|200
   2|A1|300
    */
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.ORDINAL)
    private SeatStatus status;
    private Date lockedAt;
}
