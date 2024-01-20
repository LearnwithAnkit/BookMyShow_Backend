package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Show extends BaseModel {
    private Date startTime;
    private Date endTime;
    private Movie movie;
    private Screen screen;
}
